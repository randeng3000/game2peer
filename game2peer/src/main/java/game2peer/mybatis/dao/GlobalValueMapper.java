package game2peer.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import game2peer.mybatis.domain.GlobalValue;
import game2peer.mybatis.domain.GlobalValueExample;

@Mapper
public interface GlobalValueMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	long countByExample(GlobalValueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int deleteByExample(GlobalValueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int deleteByPrimaryKey(String gKey);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int insert(GlobalValue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int insertSelective(GlobalValue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	List<GlobalValue> selectByExample(GlobalValueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	GlobalValue selectByPrimaryKey(String gKey);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByExampleSelective(@Param("record") GlobalValue record, @Param("example") GlobalValueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByExample(@Param("record") GlobalValue record, @Param("example") GlobalValueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByPrimaryKeySelective(GlobalValue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Mon May 08 11:10:07 CST 2017
	 */
	int updateByPrimaryKey(GlobalValue record);
}