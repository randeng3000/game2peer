package game2peer.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import game2peer.mybatis.domain.RoleUrl;
import game2peer.mybatis.domain.RoleUrlExample;
import game2peer.mybatis.domain.RoleUrlKey;

@Mapper
public interface RoleUrlMapper {
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	long countByExample(RoleUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int deleteByExample(RoleUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int deleteByPrimaryKey(RoleUrlKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int insert(RoleUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int insertSelective(RoleUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	List<RoleUrl> selectByExample(RoleUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	RoleUrl selectByPrimaryKey(RoleUrlKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RoleUrl record, @Param("example") RoleUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int updateByExample(@Param("record") RoleUrl record, @Param("example") RoleUrlExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int updateByPrimaryKeySelective(RoleUrl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_url
	 * @mbg.generated  Thu Mar 30 08:58:31 CST 2017
	 */
	int updateByPrimaryKey(RoleUrl record);

}