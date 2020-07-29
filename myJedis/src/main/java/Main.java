import redis.clients.jedis.Jedis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) throws Exception{
        doSomeTh1();
    }



    private static void doSomeTh1() throws Exception{
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("10.31.205.143",6379);
        jedis.auth("local-fuck-888");
        Set<String> keys = jedis.keys("Basic:JSW:CODE:*");
        KingSourceWarePojo param = new KingSourceWarePojo();
        List<KingSourceWare> data = new ArrayList<>();
        param.setThirdpartyPartNumber("17371341633");
        int count = 0;
        Set<String> brandIdSet = new HashSet<>();
        for (String key : keys) {
            count = count + 1;
            if (count > 200) {
                break;
            }

            String k = key.split(":")[3];
            KingSourceWare kingSourceWare = new KingSourceWare();
            kingSourceWare.setThirdpartyPartNumber(k);
            String s = jedis.get(key);
            System.out.println(s);
            Map<String, Object> map = JsonUtil.json2Map(s);
            String brandId = (String)map.get("brandId");
            String partNumber = (String)map.get("partNumber");
            String stock = (String)map.get("stock");
            String mqp = (String)map.get("mpq");
            String warePrice = (String)map.get("warePrice");

            brandIdSet.add(brandId);


            kingSourceWare.setBrandName("ROYALOHM/厚声");
            kingSourceWare.setMpq(Integer.parseInt(mqp));
            kingSourceWare.setPartNumber(partNumber);
            kingSourceWare.setStock(Integer.parseInt(stock));
            kingSourceWare.setWarePrice(Long.parseLong(warePrice));
            data.add(kingSourceWare);
        }

        for (String brandId : brandIdSet) {
            System.out.println(brandId);
        }
//
//        param.setData(data);
//        String s = JsonUtil.toJson(param);
//        System.out.println(s);
//        FileWriter writer = new FileWriter("E:\\workplace\\zc\\param1.txt");
//        writer.write(s);
//        writer.flush();
//        writer.close();
    }
}
