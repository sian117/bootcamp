package jp.co.arrowsystems.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import jp.co.arrowsystems.shop.bl.LoginBl;
import jp.co.arrowsystems.shop.bl.LoginBlImpl;
import jp.co.arrowsystems.shop.common.AbstractBaseAction;
import jp.co.arrowsystems.shop.common.ShopConst;
import jp.co.arrowsystems.shop.dto.UserDto;
import jp.co.arrowsystems.shop.form.LoginForm;

/**
 * ログイン画面 ログインボタンアクション
 */
public final class Login02Action extends AbstractBaseAction implements ShopConst {

	@Override
	public ActionForward doAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("----- ログインボタンを押下しました -----");

		// フォームの入力値を取得
		LoginForm loginForm = (LoginForm) form;
		String userId = loginForm.getId();

		// ビジネスロジック呼び出し
		// 指定したユーザーがuserテーブルに登録されているか確認する
		LoginBl loginbl = new LoginBlImpl();
		if (loginbl.exists(userId)) {
			
			// 登録されている場合
			// ユーザー情報を取得し、セッションに格納する
			UserDto dto = loginbl.getUserInfo(userId);

			HttpSession session = request.getSession();
			session.setAttribute(ShopConst.SESSION_KEY_USER_INFO, dto);
			
			// メニュー画面へ遷移する
			return mapping.findForward("success");
		}

		// 登録されていない場合
		// エラーメッセージ出力
		ActionMessages msgs = new ActionMessages();
		ActionMessage msg = new ActionMessage("login.error.notfound");
		msgs.add(ActionMessages.GLOBAL_MESSAGE, msg);
		saveErrors(request, msgs);
		
		// ログイン画面に戻る
		return mapping.findForward("error");
	}

}
