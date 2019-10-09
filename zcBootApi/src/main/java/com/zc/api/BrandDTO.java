package com.zc.api;

import java.io.Serializable;
import java.util.Date;

/**
 * 品牌
 *
 * @author obama
 */
public class BrandDTO implements Serializable {
	private static final long serialVersionUID = 6348392991146109707L;

	private Long id;
	private String brandName;
	private String enBrandName;
	private String url;
	private String categoryId;
	private String categoryName;
	private Date createTime;
	private Date modifyTime;
	private Long operatorId;
	private String operatorName;
	private Integer deleteFlag;
	private Integer pageNo;
	private Integer pageSize;


	public String getCategoryId() { return categoryId; }

	public void setCategoryId(String categoryId) { this.categoryId = categoryId; }

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getEnBrandName() {
		return enBrandName;
	}

	public void setEnBrandName(String enBrandName) {
		this.enBrandName = enBrandName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}



}
