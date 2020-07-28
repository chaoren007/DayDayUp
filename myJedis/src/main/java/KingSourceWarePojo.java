import java.util.List;


/**
 * 金硕微商品实体类
 *
 * @author Sea
 * @version 1.0.0
 * @date 2020/6/29 16:26
 */
public class KingSourceWarePojo {
     private List<KingSourceWare> data;
     private String thirdpartyPartNumber;

    public List<KingSourceWare> getData() {
        return data;
    }

    public void setData(List<KingSourceWare> data) {
        this.data = data;
    }

    public String getThirdpartyPartNumber() {
        return thirdpartyPartNumber;
    }

    public void setThirdpartyPartNumber(String thirdpartyPartNumber) {
        this.thirdpartyPartNumber = thirdpartyPartNumber;
    }
}
