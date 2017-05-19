package game2peer.manager;

import java.util.List;

import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.BusiGameDownload;
import game2peer.mybatis.domain.BusiGameShare;

public class GameAdpater {
	private BusiGame game;
	private List<BusiGameShare> shares = null;
	private List<BusiGameDownload> downloads = null;

	public List<BusiGameDownload> getDownloads() {
		return downloads;
	}

	public void setDownloads(List<BusiGameDownload> downloads) {
		this.downloads = downloads;
	}

	public BusiGame getGame() {
		return game;
	}

	public void setGame(BusiGame game) {
		this.game = game;
	}

	public List<BusiGameShare> getShares() 
	{
        return this.shares;
	}

	public void setShares(List<BusiGameShare> shares) {
		this.shares = shares;
	}
 
	public void getShareLink()
	{
        		
	}
}
