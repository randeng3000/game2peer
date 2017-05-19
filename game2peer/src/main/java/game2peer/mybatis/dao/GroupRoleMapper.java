package game2peer.mybatis.dao;

import game2peer.mybatis.domain.GroupRoleExample;
import game2peer.mybatis.domain.GroupRoleKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroupRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    long countByExample(GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    int deleteByExample(GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    int deleteByPrimaryKey(GroupRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    int insert(GroupRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    int insertSelective(GroupRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    List<GroupRoleKey> selectByExample(GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") GroupRoleKey record, @Param("example") GroupRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_role
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    int updateByExample(@Param("record") GroupRoleKey record, @Param("example") GroupRoleExample example);
}