import redis.clients.jedis.Jedis;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {

    public static void main(String[] args) throws Exception{
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("10.31.205.143",6379);
        jedis.auth("local-fuck-888");
        Set<String> keys = jedis.keys("Basic:JSW:CODE:*");
        KingSourceWarePojo param = new KingSourceWarePojo();
        List<KingSourceWare> data = new ArrayList<>();
        param.setThirdpartyPartNumber("17371341633");
        for (String key : keys) {
            System.out.println(key);
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
            System.out.println(brandId);
            System.out.println(partNumber);
            System.out.println(stock);
            System.out.println(mqp);
            System.out.println(warePrice);

            kingSourceWare.setBrandName("ROYALOHM/厚声");
            kingSourceWare.setMpq(Integer.parseInt(mqp));
            kingSourceWare.setPartNumber(partNumber);
            kingSourceWare.setStock(Integer.parseInt(stock));
            kingSourceWare.setWarePrice(Long.parseLong(warePrice));
            data.add(kingSourceWare);
        }
        param.setData(data);
        String s = JsonUtil.toJson(param);
        System.out.println(s);
        FileWriter writer = new FileWriter("E:\\workplace\\zc\\param.txt");
        writer.write(s);
        writer.flush();
        writer.close();
    }
}
