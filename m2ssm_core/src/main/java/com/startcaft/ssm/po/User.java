package com.startcaft.ssm.po;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.login_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.create_time
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.user_email
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.is_enable
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Boolean isEnable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.nick_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.user_pwd
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.department_id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.login_name
     *
     * @return the value of tb_user.login_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.login_name
     *
     * @param loginName the value for tb_user.login_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.create_time
     *
     * @return the value of tb_user.create_time
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.create_time
     *
     * @param createTime the value for tb_user.create_time
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.user_email
     *
     * @return the value of tb_user.user_email
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.user_email
     *
     * @param userEmail the value for tb_user.user_email
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.is_enable
     *
     * @return the value of tb_user.is_enable
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.is_enable
     *
     * @param isEnable the value for tb_user.is_enable
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.nick_name
     *
     * @return the value of tb_user.nick_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.nick_name
     *
     * @param nickName the value for tb_user.nick_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.user_pwd
     *
     * @return the value of tb_user.user_pwd
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.user_pwd
     *
     * @param userPwd the value for tb_user.user_pwd
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.department_id
     *
     * @return the value of tb_user.department_id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.department_id
     *
     * @param departmentId the value for tb_user.department_id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}