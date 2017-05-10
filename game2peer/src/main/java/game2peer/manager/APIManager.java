package game2peer.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game2peer.mybatis.dao.RestApisMapper;
import game2peer.mybatis.domain.RestApis;

@Service
public class APIManager {
	@Autowired
	private RestApisMapper restApisMapper;
	
	public RestApis getAPI(String id)
	{
		return restApisMapper.selectByPrimaryKey(id);
	}
	
}
