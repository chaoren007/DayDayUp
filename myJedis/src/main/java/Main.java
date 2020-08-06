import redis.clients.jedis.Jedis;

import java.io.FileWriter;
import java.util.*;


/**
 * @author Administrator
 */
public class Main {
    private static Jedis jedis;
    static {
        jedis = new Jedis("10.31.205.143",6379);
        jedis.auth("local-fuck-888");
    }


    public static void main(String[] args) throws Exception{
        doSomeTh1();
    }

    private static void do1() throws Exception{
        //连接本地的 Redis 服务
        List<String> codes = new ArrayList<>();
        String pre = "{\"MaterialCodes\":";
        String end = "}\"";

        Set<String> keys = jedis.keys("Basic:JSW:CODE:*");
        System.out.println(keys.size());
        Integer size = keys.size();
        for (String key : keys) {
            System.out.println(size--);
            String k = key.split(":")[3];
            String s = jedis.get(key);
            Map<String, Object> map = JsonUtil.json2Map(s);
            String brandId = (String)map.get("brandId");
            String partNumber = (String)map.get("partNumber");
            String stock = (String)map.get("stock");
            String mqp = (String)map.get("mpq");
            String warePrice = (String)map.get("warePrice");
            if (Integer.parseInt(stock) <= 1) {
                codes.add(k);
            }
        }
        System.out.println(codes.size());
        System.out.println(pre + JsonUtil.toJson(codes) + end);
    }



    private static void doSomeTh3() throws Exception{
        int size = 0;
        String s = jedis.get("Basic:JSW:KEYS:2");
        String preFix = "{\"MaterialCodes\":";
        String endFix = "}";
        String param = preFix + s + endFix;
        System.out.println(param);

    }

    private static void doSomeTh2() throws Exception{
        int size = 0;
        for (int i=0; i < 8; i++) {
            String s = jedis.get("Basic:JSW:KEYS:" + i);
            ArrayList arrayList = JsonUtil.fromJson(s, ArrayList.class);
            if (arrayList.contains("RRHS0201WMF1000TEE")) {
                System.out.println(i);
                break;
            }
            size = size + arrayList.size();
            System.out.println(size);

        }
    }



    private static void doSomeTh1() throws Exception{
        //连接本地的 Redis 服务
        Set<String> keys = jedis.keys("Basic:JSW:CODE:*");
        KingSourceWarePojo param = new KingSourceWarePojo();
        List<KingSourceWare> data = new ArrayList<>();
        param.setThirdpartyPartNumber("17371341633");
        int count = 0;
        Set<String> brandIdSet = new HashSet<>();
        for (String key : keys) {
//            count = count + 1;
//            if (count > 200) {
//                break;
//            }
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
        param.setData(data);
        String s = JsonUtil.toJson(param);
        System.out.println(s);
        FileWriter writer = new FileWriter("E:\\workplace\\zc\\param1.txt");
        writer.write(s);
        writer.flush();
        writer.close();
    }
}
