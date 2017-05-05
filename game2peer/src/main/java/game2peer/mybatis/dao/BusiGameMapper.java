package game2peer.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import game2peer.mybatis.domain.BusiGame;
import game2peer.mybatis.domain.BusiGameExample;

@Mapper
public interface BusiGameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    long countByExample(BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int deleteByExample(BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int insert(BusiGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int insertSelective(BusiGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    List<BusiGame> selectByExampleWithBLOBs(BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    List<BusiGame> selectByExample(BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    BusiGame selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int updateByExampleSelective(@Param("record") BusiGame record, @Param("example") BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") BusiGame record, @Param("example") BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int updateByExample(@Param("record") BusiGame record, @Param("example") BusiGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int updateByPrimaryKeySelective(BusiGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(BusiGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game
     *
     * @mbg.generated Mon May 01 15:57:15 CST 2017
     */
    int updateByPrimaryKey(BusiGame record);
}