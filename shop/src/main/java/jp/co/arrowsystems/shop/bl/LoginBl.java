package jp.co.arrowsystems.shop.bl;

import jp.co.arrowsystems.shop.dto.UserDto;

/**
 * ログイン画面 ビジネスロジックインターフェイス
 */
public interface LoginBl {


	/**
	 * ユーザーがDBに登録されているか確認します
	 * @param userId ユーザーID
	 * @return 登録されている場合True、されていない場合False
	 */
	boolean exists(String userId);
	
	
	/**
	 * ユーザー情報を取得します
	 * @param userId
	 * @return UserDto
	 */
	UserDto getUserInfo(String userId);
	
}
