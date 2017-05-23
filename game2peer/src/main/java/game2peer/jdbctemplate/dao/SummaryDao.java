package game2peer.jdbctemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import game2peer.jdbctemplate.domain.SummaryBean;
import game2peer.manager.GameManager;

@Repository 
public class SummaryDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private GameManager gameManager;
	
	public List<SummaryBean> getMyGameUserSummary(String plathform_user_id, int limit_start, int size) 
	{
		try {
			String SQL = "SELECT COUNT(game_code) AS v1, game_code as d1 FROM busi_game_user where (plathform_user_id=?) GROUP BY game_code LIMIT ?, ?";
			List<SummaryBean> l = (List<SummaryBean>) this.jdbcTemplate.query(SQL, new Object[] {plathform_user_id, limit_start, size}, new BeanPropertyRowMapper(SummaryBean.class));
			for (int i = 0; i < l.size(); i++)
			{
				String gameCode = l.get(i).getD1(); 
				l.get(i).setD1(gameManager.getGameById(gameCode).getGameName());
			}
			return l;	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
