package game2peer.mvc.bean;

public class GameUserRegister {
	private String gameCode;
	private String username;   //游戏注册用户的用户名
	private String gameUserId;
    private String plathformUserId;	
	private String password;
	private String re_password;
	private String email;
	private String verifycode;
	
	public String getGameUserId() {
		return gameUserId;
	}

	public void setGameUserId(String gameUserId) {
		this.gameUserId = gameUserId;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPlathformUserId() {
		return plathformUserId;
	}

	public void setPlathformUserId(String plathformUserId) {
		this.plathformUserId = plathformUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRe_password() {
		return re_password;
	}

	public void setRe_password(String re_password) {
		this.re_password = re_password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifycode() {
		return verifycode;
	}

	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}

}
