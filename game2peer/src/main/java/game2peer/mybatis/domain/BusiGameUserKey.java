package game2peer.mybatis.domain;

public class BusiGameUserKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game_user.game_code
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String gameCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column busi_game_user.login_name
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	private String loginName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game_user.game_code
	 * @return  the value of busi_game_user.game_code
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getGameCode() {
		return gameCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game_user.game_code
	 * @param gameCode  the value for busi_game_user.game_code
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column busi_game_user.login_name
	 * @return  the value of busi_game_user.login_name
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column busi_game_user.login_name
	 * @param loginName  the value for busi_game_user.login_name
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}