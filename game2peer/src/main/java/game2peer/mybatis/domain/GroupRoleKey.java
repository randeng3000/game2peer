package game2peer.mybatis.domain;

public class GroupRoleKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.group_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_role.role_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    private Integer roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.group_id
     *
     * @return the value of group_role.group_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.group_id
     *
     * @param groupId the value for group_role.group_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_role.role_id
     *
     * @return the value of group_role.role_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_role.role_id
     *
     * @param roleId the value for group_role.role_id
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}