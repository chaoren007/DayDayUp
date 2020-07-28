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
     * 价格
     */
    private Long warePrice;

    /**
     * 包装量
     */
    private Integer mpq;

    /**
     * 库存数量
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

    public Long getWarePrice() {
        return warePrice;
    }

    public void setWarePrice(Long warePrice) {
        this.warePrice = warePrice;
    }

    public Integer getMpq() {
        return mpq;
    }
    public void setMpq(Integer mpq) {
        this.mpq = mpq;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
