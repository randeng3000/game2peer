package game2peer.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import game2peer.mybatis.dao.GlobalValueMapper;
import game2peer.mybatis.domain.GlobalValue;

@Service
public class GlobalValueManager {

	public final static String global_key = "global.key";
	
	@Autowired
	GlobalValueMapper globalValueMapper;
	
	@Cacheable(value="globalvalue", key="#args[0]")
	public String getValue(String key, String defaultValue)
	{
		GlobalValue v = globalValueMapper.selectByPrimaryKey(key);
		if ((v == null) && (defaultValue != null))
		  return defaultValue;
		else
		  return v.getgValue();	
	}
	
	public String getValue(String key)
	{
		return getValue(key, null);
	}
}
