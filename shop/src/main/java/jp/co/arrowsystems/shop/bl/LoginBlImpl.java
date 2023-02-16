package jp.co.arrowsystems.shop.bl;

import jp.co.arrowsystems.shop.common.AbstractBaseBl;
import jp.co.arrowsystems.shop.dao.LoginDao;
import jp.co.arrowsystems.shop.dto.UserDto;

/**
 * ログイン画面 ビジネスロジック実装クラス
 */
public class LoginBlImpl extends AbstractBaseBl implements LoginBl {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean exists(String userId) {

		LoginDao dao = new LoginDao();

		// userテーブル検索処理
		// データがない場合はnullが返る
		UserDto dto = dao.findUserInfoByUserId(userId);

		if (dto == null) {
			System.out.println("------ ユーザー登録なし ------");
			return false;
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDto getUserInfo(String userId) {

		LoginDao dao = new LoginDao();
		return  dao.findUserInfoByUserId(userId);
	}

}
