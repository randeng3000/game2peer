package game2peer.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import game2peer.mybatis.dao.PagesMapper;
import game2peer.mybatis.domain.Pages;

@Service
public class PagesManager {

	@Autowired
	private PagesMapper pagesMapper;
	
	
	public Pages getPage(String id)
	{
		return pagesMapper.selectByPrimaryKey(id);
	}
	
}
