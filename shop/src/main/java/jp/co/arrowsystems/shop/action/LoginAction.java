package jp.co.arrowsystems.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.co.arrowsystems.shop.common.AbstractBaseAction;
import jp.co.arrowsystems.shop.dao.LoginDao;
import jp.co.arrowsystems.shop.dto.UserDto;
import jp.co.arrowsystems.shop.form.LoginForm;

public final class LoginAction extends AbstractBaseAction {

	@Override
	public ActionForward doAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("----- ログイン画面を表示します -----");
		
		LoginForm loginForm = (LoginForm) form;
		
		String userId = loginForm.getId();
		
		
		LoginDao dao = new LoginDao();
		dao.selectAllUserInfo();

		UserDto dto = dao.findUserInfoByUserId(userId);
		
		return mapping.findForward("success");
	}

}
