
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: liuwei
 * @Date: 2019/1/13 21:57
 * @Description:
 */
public class prodect_l {
    public static void main(String[] args) {
        Product product=new Product("1","009","iphone","100");
        Product product1=new Product("4","009","iphone","100");
        Product product2=new Product("8","009","iphone","100");

        //创建list集合
        List<Product> list = new ArrayList<>();

        list.add(product);
        list.add(product1);
        list.add(product2);

        //创建空的{}  hashMap
        HashMap<String,List> hash=new HashMap<>();//{}
     //创建空的[] ArrayList
        List<Product> listhash= new ArrayList<>();//[]


        for (Product pro : list) {
            String sku=pro.getSku(); //009

            if(hash.containsKey(sku)){
                listhash=   hash.get(sku);
                listhash.add(pro);
            }else {
                listhash.add(pro);
                System.out.println(listhash);
                hash.put(sku,listhash);
            }
        }

     String hash1=   JSONObject.toJSONString(hash);

        System.out.println(hash1);

    }
}
