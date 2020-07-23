package com.zc.controller;

/**
 * 金硕微商品实体类
 *
 * @author Madison.lu
 * @version 1.0.0
 * @date 2020/6/29 16:26
 */
public class KingSourceWare {

    /**
     * 原厂型号
     */
    private String partNumber;
    /**
     * 第三方id
     */
    private String thirdpartyPartNumber;
    /**
     * 品牌名
     */
    private String brandName;
    /**
     * 分类名
     */
    private String categoryName;
    /**
     * 批次
     */
    private String batchNumber;
    /**
     * 起订量
     */
    private String moq;
    /**
     * 包装量
     */
    private String mpq;
    /**
     * 递增量
     */
    private Integer multiple;
    /**
     * 报价有效期，天
     */
    private Integer quoteDays;
    /**
     * 是否拆包，10 拆包 20 不拆包
     */
    private Integer packageFlag;
    /**
     * 库存
     */
    private Integer stock;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getThirdpartyPartNumber() {
        return thirdpartyPartNumber;
    }

    public void setThirdpartyPartNumber(String thirdpartyPartNumber) {
        this.thirdpartyPartNumber = thirdpartyPartNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getMoq() {
        return moq;
    }

    public void setMoq(String moq) {
        this.moq = moq;
    }

    public String getMpq() {
        return mpq;
    }

    public void setMpq(String mpq) {
        this.mpq = mpq;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public Integer getQuoteDays() {
        return quoteDays;
    }

    public void setQuoteDays(Integer quoteDays) {
        this.quoteDays = quoteDays;
    }

    public Integer getPackageFlag() {
        return packageFlag;
    }

    public void setPackageFlag(Integer packageFlag) {
        this.packageFlag = packageFlag;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
