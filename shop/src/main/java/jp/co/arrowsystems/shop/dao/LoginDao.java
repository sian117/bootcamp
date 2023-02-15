package jp.co.arrowsystems.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.arrowsystems.shop.dto.UserDto;
import jp.co.arrowsystems.shop.util.DbUtil;

public class LoginDao {

	public List<UserDto> selectAllUserInfo() {
        SqlSession session = DbUtil.getSqlSession();
        return session.selectList("shop.login.selectAll");
	}
	

	public UserDto findUserInfoByUserId(String userId) {
        SqlSession session = DbUtil.getSqlSession();
        return session.selectOne("shop.login.findByUserId" , userId);
	}

}
