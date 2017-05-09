package game2peer.mvc.bean;

import game2peer.utility.StringUtility;

public class UserRegister {
	private String username;
	private String password;
	private String nicename;
	private String readit;
	private String uid;
	private String errorMessage;

	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
	public String getNicename() {
		return nicename;
	}
	public void setNicename(String nicename) {
		this.nicename = nicename;
	}
	public String getReadit() {
		return readit;
	}
	public void setReadit(String readit) {
		this.readit = readit;
	}

    public boolean isValid()
    {
    	if (StringUtility.hasEmpty(this.username, this.password, this.readit))
    	{
    		return false;
    	}
    	else
    	{
    		if (this.password.length() < 6)
    		   return false;	
    		if (!StringUtility.isEmail(this.username))
      		   return false;	
    		//this.username = this.username.toLowerCase();
    		if (StringUtility.hasEmpty(this.nicename))
    		{
    		   this.nicename = this.username.substring(0, this.username.indexOf("@"));	
    		}
    	}
    	return true;
    }


}
