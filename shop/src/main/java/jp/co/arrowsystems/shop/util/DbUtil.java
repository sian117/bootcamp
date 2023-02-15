package jp.co.arrowsystems.shop.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbUtil {

    private static final String MY_BATIS_CONFIG_XML = "mybatis-config.xml";
    
    private static SqlSessionFactory sqlSessionFactory = null;
	
    static {
		try (Reader in = Resources.getResourceAsReader(MY_BATIS_CONFIG_XML)) {
	    	sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}         
    }
    
	public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
	}
	
}
