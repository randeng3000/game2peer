package game2peer.manager;

import java.util.List;

public class NavObject {
	private String name;
	private String url;
	private List<NavObject> subNav = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<NavObject> getSubNav() {
		return subNav;
	}
	public void setSubNav(List<NavObject> subNav) {
		this.subNav = subNav;
	}	
}
