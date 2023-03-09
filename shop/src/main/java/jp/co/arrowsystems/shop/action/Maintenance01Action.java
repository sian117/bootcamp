package jp.co.arrowsystems.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.co.arrowsystems.shop.common.AbstractBaseAction;
import jp.co.arrowsystems.shop.common.ShopConst;
import jp.co.arrowsystems.shop.dto.UserDto;
import jp.co.arrowsystems.shop.form.MaintenanceForm;

public final class Maintenance01Action extends AbstractBaseAction {

	@Override
	public ActionForward doAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("----- マスタメンテ画面を表示します -----");

		// Sessionからユーザー情報を取得する
		HttpSession session = request.getSession();
		UserDto userInfo = (UserDto) session.getAttribute(ShopConst.SESSION_KEY_USER_INFO);
		
		MaintenanceForm mainteForm = (MaintenanceForm) form;
		mainteForm.setUserName(userInfo.getUserName());
		
		
		return mapping.findForward("success");
	}

}
