package com.zc.bean;

import java.util.Date;

public class CrmContacts {

    /**
     * 联系人ID,自增序列
     */
    private Long contactsId;

    /**
     * 客户ID(联系人类型为企业时才有该值)
     */
    private Long customerId;

    /**
     * 客户代码(联系人类型为企业时才有该值)
     */
    private String customerCode;

    /**
     * 联系人类型：10个人；20企业
     */
    private Integer contactsType;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人在职状态：10在职；20离职
     */
    private Integer contactsPositionStatus;

    /**
     * 联系人来源
     */
    private String contactsSource;

    /**
     * 10已注册  20未注册
     */
    private Integer registerFlag;


    /**
     * 联系人手机
     */
    private String contactsMobile;

    /**
     * 联系人邮箱
     */
    private String contactsEmail;

    /**
     * 联系人QQ
     */
    private String contactsQq;

    /**
     * 联系人微信
     */
    private String contactsWechat;

    /**
     * 联系人电话
     */
    private String contactsPhone;

    /**
     * 联系人职位
     */
    private String contactsPosition;

    /**
     * 联系人生日
     */
    private Date contactsBirthday;

    /**
     * 兴趣爱好
     */
    private String contactsHobby;

    /**
     * 备注
     */
    private String remark;

    /**
     * 跟进部门：10电话拓新组；20销售1组；30销售2组；40销售3组
     */
    private Integer flowStatus;

    /**
     * 联系人领取状态：10待领取；20已领取
     */
    private Integer receiveStatus;

    /**
     * 注册时间
     */
    private Date registrationTime;

    /**
     * 跟进人员工ID
     */
    private Long followUserEmployeeId;

    /**
     * 跟进人账户ID
     */
    private Integer followUserId;

    /**
     * 跟进人账户名称(如：乐福-Louv)
     */
    private String followUserName;

    /**
     * 跟进人所属部门ID
     */
    private Integer followUserDeptId;

    /**
     * 跟进人所属部门名称
     */
    private String followUserDeptName;

    /**
     * 跟进时间
     */
    private Date followTime;

    /**
     * 创建人员工ID
     */
    private Long createEmployeeId;

    /**
     * 创建人账号ID
     */
    private Integer createUserId;

    /**
     * 创建人账号名称(如：乐福-Louv)
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人员工ID
     */
    private Long updateEmployeeId;

    /**
     * 修改人账号ID
     */
    private Integer updateUserId;

    /**
     * 修改人账号名称(如：乐福-Louv)
     */
    private String updateUserName;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 数据来源：10注册；20手动创建；30导入
     */
    private Integer dataSource;

    /**
     * 是否已下单标识：10已下单；20未下单
     */
    private Integer placeOrderFlag;

    /**
     * 上次成交时间
     */
    private Date lastOrderTime;

    /**
     * 客户下单的用户ID
     */
    private Long registrationUserId;



    /**
     * 是否为CRM创建联系人标识 10是 20否
     */
    private Integer crmFlag;

    /**
     * 共享人账户ID
     */
    private Integer shareUserId;

    /**
     * 公司全称
     */
    private String companyFullName;

    /**
     * 数据流转状态对应的部门ID
     */
    private Integer flowStatusDeptId;
    /**
     * 是否可流转标识 10=可以流转到其他组 20=不能流转到其他组
     */
    private Integer flowFlag;

    /**
     * 搜索关键词(主要用于下拉框搜索时使用)
     */
    private String searchKeyword;

    /**
     * 流转类型(10自动流转 20手动流转)
     */
    private Integer flowType;
    /**
     * 跟进部门Id
     */
    private Integer flowDeptId;
    /**
     * 联系人部门
     */
    private String contactsDept;
    /**
     * 联系人职位备注
     */
    private String contactsPositionRemarks;
    /**
     * 公司助记码
     */
    private String mnemonicCode;

    /**
     * 跟进部门名称
     */
    private String flowDeptName;

    public Long getContactsId() {
        return contactsId;
    }

    public void setContactsId(Long contactsId) {
        this.contactsId = contactsId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Integer getContactsType() {
        return contactsType;
    }

    public void setContactsType(Integer contactsType) {
        this.contactsType = contactsType;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public Integer getContactsPositionStatus() {
        return contactsPositionStatus;
    }

    public void setContactsPositionStatus(Integer contactsPositionStatus) {
        this.contactsPositionStatus = contactsPositionStatus;
    }

    public String getContactsSource() {
        return contactsSource;
    }

    public void setContactsSource(String contactsSource) {
        this.contactsSource = contactsSource;
    }

    public Integer getRegisterFlag() {
        return registerFlag;
    }

    public void setRegisterFlag(Integer registerFlag) {
        this.registerFlag = registerFlag;
    }

    public String getContactsMobile() {
        return contactsMobile;
    }

    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile;
    }

    public String getContactsEmail() {
        return contactsEmail;
    }

    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail;
    }

    public String getContactsQq() {
        return contactsQq;
    }

    public void setContactsQq(String contactsQq) {
        this.contactsQq = contactsQq;
    }

    public String getContactsWechat() {
        return contactsWechat;
    }

    public void setContactsWechat(String contactsWechat) {
        this.contactsWechat = contactsWechat;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsPosition() {
        return contactsPosition;
    }

    public void setContactsPosition(String contactsPosition) {
        this.contactsPosition = contactsPosition;
    }

    public Date getContactsBirthday() {
        return contactsBirthday;
    }

    public void setContactsBirthday(Date contactsBirthday) {
        this.contactsBirthday = contactsBirthday;
    }

    public String getContactsHobby() {
        return contactsHobby;
    }

    public void setContactsHobby(String contactsHobby) {
        this.contactsHobby = contactsHobby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Integer flowStatus) {
        this.flowStatus = flowStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Long getFollowUserEmployeeId() {
        return followUserEmployeeId;
    }

    public void setFollowUserEmployeeId(Long followUserEmployeeId) {
        this.followUserEmployeeId = followUserEmployeeId;
    }

    public Integer getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Integer followUserId) {
        this.followUserId = followUserId;
    }

    public String getFollowUserName() {
        return followUserName;
    }

    public void setFollowUserName(String followUserName) {
        this.followUserName = followUserName;
    }

    public Integer getFollowUserDeptId() {
        return followUserDeptId;
    }

    public void setFollowUserDeptId(Integer followUserDeptId) {
        this.followUserDeptId = followUserDeptId;
    }

    public String getFollowUserDeptName() {
        return followUserDeptName;
    }

    public void setFollowUserDeptName(String followUserDeptName) {
        this.followUserDeptName = followUserDeptName;
    }

    public Date getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Date followTime) {
        this.followTime = followTime;
    }

    public Long getCreateEmployeeId() {
        return createEmployeeId;
    }

    public void setCreateEmployeeId(Long createEmployeeId) {
        this.createEmployeeId = createEmployeeId;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateEmployeeId() {
        return updateEmployeeId;
    }

    public void setUpdateEmployeeId(Long updateEmployeeId) {
        this.updateEmployeeId = updateEmployeeId;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getPlaceOrderFlag() {
        return placeOrderFlag;
    }

    public void setPlaceOrderFlag(Integer placeOrderFlag) {
        this.placeOrderFlag = placeOrderFlag;
    }

    public Date getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(Date lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public Long getRegistrationUserId() {
        return registrationUserId;
    }

    public void setRegistrationUserId(Long registrationUserId) {
        this.registrationUserId = registrationUserId;
    }


    public Integer getCrmFlag() {
        return crmFlag;
    }

    public void setCrmFlag(Integer crmFlag) {
        this.crmFlag = crmFlag;
    }

    public Integer getShareUserId() {
        return shareUserId;
    }

    public void setShareUserId(Integer shareUserId) {
        this.shareUserId = shareUserId;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public Integer getFlowStatusDeptId() {
        return flowStatusDeptId;
    }

    public void setFlowStatusDeptId(Integer flowStatusDeptId) {
        this.flowStatusDeptId = flowStatusDeptId;
    }

    public Integer getFlowFlag() {
        return flowFlag;
    }

    public void setFlowFlag(Integer flowFlag) {
        this.flowFlag = flowFlag;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public Integer getFlowDeptId() {
        return flowDeptId;
    }

    public void setFlowDeptId(Integer flowDeptId) {
        this.flowDeptId = flowDeptId;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public String getFlowDeptName() {
        return flowDeptName;
    }

    public void setFlowDeptName(String flowDeptName) {
        this.flowDeptName = flowDeptName;
    }

    public String getContactsDept() {
        return contactsDept;
    }

    public void setContactsDept(String contactsDept) {
        this.contactsDept = contactsDept;
    }

    public String getContactsPositionRemarks() {
        return contactsPositionRemarks;
    }

    public void setContactsPositionRemarks(String contactsPositionRemarks) {
        this.contactsPositionRemarks = contactsPositionRemarks;
    }
}


