package game2peer.mvc;

public class ResponseBean {
	private String code;
	private String message;
	public static String SUCCESS_CODE = "0000";
	public static String MISS_FIELD_VALUE_CODE = "0001";
	public static String INVALID_FIELD_VALUE_CODE = "0002";
	
	public static String FAILED_CODE = "9999";
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
