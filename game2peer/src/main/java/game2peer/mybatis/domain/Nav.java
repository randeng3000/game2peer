package game2peer.mybatis.domain;

public class Nav {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nav.id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nav.parent_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nav.title
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nav.url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nav.order_level
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private Integer orderLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nav.id
     *
     * @return the value of nav.id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nav.id
     *
     * @param id the value for nav.id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nav.parent_id
     *
     * @return the value of nav.parent_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nav.parent_id
     *
     * @param parentId the value for nav.parent_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nav.title
     *
     * @return the value of nav.title
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nav.title
     *
     * @param title the value for nav.title
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nav.url
     *
     * @return the value of nav.url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nav.url
     *
     * @param url the value for nav.url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nav.order_level
     *
     * @return the value of nav.order_level
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Integer getOrderLevel() {
        return orderLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nav.order_level
     *
     * @param orderLevel the value for nav.order_level
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setOrderLevel(Integer orderLevel) {
        this.orderLevel = orderLevel;
    }
}