package jp.co.arrowsystems.shop.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class AbstractBaseAction extends Action {

	abstract public ActionForward doAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response);

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return doAction(mapping, form, request, response);
	}

}
