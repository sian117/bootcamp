package jp.co.arrowsystems.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.co.arrowsystems.shop.common.AbstractBaseAction;

public final class MenuAction extends AbstractBaseAction {

	@Override
	public ActionForward doAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("----- MENU画面を表示します -----");

		return mapping.findForward("success");
	}

}
