package com.startcaft.ssm.mapper;

import com.startcaft.ssm.po.UserGroup;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_group
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_group
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_group
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_group
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_group
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_group
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    int updateByPrimaryKey(UserGroup record);
}