package game2peer.mybatis.domain;

public class BusiUserLikeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_user_like.user_id
     *
     * @mbg.generated Fri May 19 21:57:37 CST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_user_like.game_id
     *
     * @mbg.generated Fri May 19 21:57:37 CST 2017
     */
    private String gameId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_user_like.user_id
     *
     * @return the value of busi_user_like.user_id
     *
     * @mbg.generated Fri May 19 21:57:37 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_user_like.user_id
     *
     * @param userId the value for busi_user_like.user_id
     *
     * @mbg.generated Fri May 19 21:57:37 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_user_like.game_id
     *
     * @return the value of busi_user_like.game_id
     *
     * @mbg.generated Fri May 19 21:57:37 CST 2017
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_user_like.game_id
     *
     * @param gameId the value for busi_user_like.game_id
     *
     * @mbg.generated Fri May 19 21:57:37 CST 2017
     */
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}