package game2peer.mvc.bean;

public class RegisterResponseBean {
	public static String SUCCESS_CODE = "0000";

	public static String USERNAME_TOO_SHORT = "0011";
	public static String USERNAME_HAS_SPECIACHAR = "0012";
	public static String USERNAME_HAS_REGISTER = "0023";
	
	public static String PASSWORD_TOO_SHORT = "0021";
	public static String PASSWORD_HAS_SPECIACHAR = "0022";

	public static String FAILED_CODE = "9999";
	
	private String code;
	private String suggestLoginName;

	
	public String getSuggestLoginName() {
		return suggestLoginName;
	}
	public void setSuggestLoginName(String suggestLoginName) {
		this.suggestLoginName = suggestLoginName;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
