package game2peer.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import game2peer.mybatis.domain.BusiGameShare;
import game2peer.mybatis.domain.BusiGameShareExample;

@Mapper
public interface BusiGameShareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    long countByExample(BusiGameShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int deleteByExample(BusiGameShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int insert(BusiGameShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int insertSelective(BusiGameShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    List<BusiGameShare> selectByExample(BusiGameShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    BusiGameShare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int updateByExampleSelective(@Param("record") BusiGameShare record, @Param("example") BusiGameShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int updateByExample(@Param("record") BusiGameShare record, @Param("example") BusiGameShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int updateByPrimaryKeySelective(BusiGameShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_share
     *
     * @mbg.generated Thu May 18 09:49:10 CST 2017
     */
    int updateByPrimaryKey(BusiGameShare record);
}