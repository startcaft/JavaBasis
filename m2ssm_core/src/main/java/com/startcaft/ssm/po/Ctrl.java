package com.startcaft.ssm.po;

public class Ctrl {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ctrl.id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ctrl.ctrl_desc
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String ctrlDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ctrl.is_enable
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Boolean isEnable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ctrl.icon
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ctrl.ctrl_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private String ctrlName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ctrl.menu_id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    private Integer menuId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ctrl.id
     *
     * @return the value of tb_ctrl.id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ctrl.id
     *
     * @param id the value for tb_ctrl.id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ctrl.ctrl_desc
     *
     * @return the value of tb_ctrl.ctrl_desc
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getCtrlDesc() {
        return ctrlDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ctrl.ctrl_desc
     *
     * @param ctrlDesc the value for tb_ctrl.ctrl_desc
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setCtrlDesc(String ctrlDesc) {
        this.ctrlDesc = ctrlDesc == null ? null : ctrlDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ctrl.is_enable
     *
     * @return the value of tb_ctrl.is_enable
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ctrl.is_enable
     *
     * @param isEnable the value for tb_ctrl.is_enable
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ctrl.icon
     *
     * @return the value of tb_ctrl.icon
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ctrl.icon
     *
     * @param icon the value for tb_ctrl.icon
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ctrl.ctrl_name
     *
     * @return the value of tb_ctrl.ctrl_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public String getCtrlName() {
        return ctrlName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ctrl.ctrl_name
     *
     * @param ctrlName the value for tb_ctrl.ctrl_name
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setCtrlName(String ctrlName) {
        this.ctrlName = ctrlName == null ? null : ctrlName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ctrl.menu_id
     *
     * @return the value of tb_ctrl.menu_id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ctrl.menu_id
     *
     * @param menuId the value for tb_ctrl.menu_id
     *
     * @mbggenerated Thu Oct 08 17:27:14 CST 2015
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}