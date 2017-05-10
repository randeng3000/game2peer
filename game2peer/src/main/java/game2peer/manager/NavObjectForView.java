package game2peer.manager;

public class NavObjectForView {
	private String name;
	private String url;
	private boolean isLeaf;
	private boolean isSubEnd;
	
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
	public boolean isLeaf() {
		return isLeaf;
	}
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	public boolean isSubEnd() {
		return isSubEnd;
	}
	public void setSubEnd(boolean isSubEnd) {
		this.isSubEnd = isSubEnd;
	}	
}
