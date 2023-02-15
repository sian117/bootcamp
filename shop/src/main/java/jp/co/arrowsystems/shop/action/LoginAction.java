package jp.co.arrowsystems.shop.action;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.co.arrowsystems.shop.common.AbstractBaseAction;

public final class LoginAction extends AbstractBaseAction {

	@Override
	public ActionForward doAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("----- ログイン画面を表示します -----");

		
        String resource = "mybatis-config.xml";
        try (Reader in = Resources.getResourceAsReader(resource)) {
            // ★設定ファイルを元に、 SqlSessionFactory を作成する
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

            // ★SqlSessionFactory から SqlSession を生成する
            SqlSession session = factory.openSession();
            // ★SqlSession を使って SQL を実行する
            List<Map<String, Object>> result = session.selectList("sample.mybatis.selectTest");
            System.out.println(result);
            session.close();
            
        } catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}		
		
		return mapping.findForward("success");
	}

}
