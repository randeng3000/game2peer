package game2peer.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import game2peer.mybatis.domain.BusiGameUser;
import game2peer.mybatis.domain.BusiGameUserExample;
import game2peer.mybatis.domain.BusiGameUserKey;

@Mapper
public interface BusiGameUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	long countByExample(BusiGameUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int deleteByExample(BusiGameUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int deleteByPrimaryKey(BusiGameUserKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int insert(BusiGameUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int insertSelective(BusiGameUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	List<BusiGameUser> selectByExample(BusiGameUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	BusiGameUser selectByPrimaryKey(BusiGameUserKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByExampleSelective(@Param("record") BusiGameUser record, @Param("example") BusiGameUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByExample(@Param("record") BusiGameUser record, @Param("example") BusiGameUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByPrimaryKeySelective(BusiGameUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game_user
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByPrimaryKey(BusiGameUser record);
}