package game2peer.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import game2peer.mybatis.domain.BusiGameManagerExample;
import game2peer.mybatis.domain.BusiGameManagerKey;

@Mapper
public interface BusiGameManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    long countByExample(BusiGameManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    int deleteByExample(BusiGameManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    int deleteByPrimaryKey(BusiGameManagerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    int insert(BusiGameManagerKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    int insertSelective(BusiGameManagerKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    List<BusiGameManagerKey> selectByExample(BusiGameManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    int updateByExampleSelective(@Param("record") BusiGameManagerKey record, @Param("example") BusiGameManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_manager
     *
     * @mbg.generated Wed May 17 21:24:12 CST 2017
     */
    int updateByExample(@Param("record") BusiGameManagerKey record, @Param("example") BusiGameManagerExample example);
}