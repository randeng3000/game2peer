package game2peer.mybatis.domain;

import java.util.Date;

public class BusiGameUser extends BusiGameUserKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.game_user_id
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private String gameUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.nice_name
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private String niceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.create_time
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.password
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.veryify_code
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private String veryifyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.verify_ok
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private Integer verifyOk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.email
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_game_user.plathform_user_id
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    private String plathformUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.game_user_id
     *
     * @return the value of busi_game_user.game_user_id
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public String getGameUserId() {
        return gameUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.game_user_id
     *
     * @param gameUserId the value for busi_game_user.game_user_id
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setGameUserId(String gameUserId) {
        this.gameUserId = gameUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.nice_name
     *
     * @return the value of busi_game_user.nice_name
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public String getNiceName() {
        return niceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.nice_name
     *
     * @param niceName the value for busi_game_user.nice_name
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.create_time
     *
     * @return the value of busi_game_user.create_time
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.create_time
     *
     * @param createTime the value for busi_game_user.create_time
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.password
     *
     * @return the value of busi_game_user.password
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.password
     *
     * @param password the value for busi_game_user.password
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.veryify_code
     *
     * @return the value of busi_game_user.veryify_code
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public String getVeryifyCode() {
        return veryifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.veryify_code
     *
     * @param veryifyCode the value for busi_game_user.veryify_code
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setVeryifyCode(String veryifyCode) {
        this.veryifyCode = veryifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.verify_ok
     *
     * @return the value of busi_game_user.verify_ok
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public Integer getVerifyOk() {
        return verifyOk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.verify_ok
     *
     * @param verifyOk the value for busi_game_user.verify_ok
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setVerifyOk(Integer verifyOk) {
        this.verifyOk = verifyOk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.email
     *
     * @return the value of busi_game_user.email
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.email
     *
     * @param email the value for busi_game_user.email
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_game_user.plathform_user_id
     *
     * @return the value of busi_game_user.plathform_user_id
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public String getPlathformUserId() {
        return plathformUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_game_user.plathform_user_id
     *
     * @param plathformUserId the value for busi_game_user.plathform_user_id
     *
     * @mbg.generated Mon May 22 18:10:09 CST 2017
     */
    public void setPlathformUserId(String plathformUserId) {
        this.plathformUserId = plathformUserId;
    }
}