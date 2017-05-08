package game2peer.mvc.bean;

public class RegisterResponseBean {
	public static String SUCCESS_CODE = "0000";

	public static String USERNAME_TOO_SHORT = "0001";
	public static String PASSWORD_TOO_SHORT = "0002";
	public static String USERNAME_HAS_REGISTER = "0003";
	public static String FAILED_CODE = "9999";
	
	private String code;
	private String suggestLoginName;
	private String gameUserId;
	
	public String getSuggestLoginName() {
		return suggestLoginName;
	}
	public void setSuggestLoginName(String suggestLoginName) {
		this.suggestLoginName = suggestLoginName;
	}
	public String getGameUserId() {
		return gameUserId;
	}
	public void setGameUserId(String gameUserId) {
		this.gameUserId = gameUserId;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
