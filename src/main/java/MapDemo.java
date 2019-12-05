import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        //创建MAp
        HashMap<String, String> map = new HashMap<>();
        map.put("李老师","1老师");
        map.put("张老师","2老师");
        map.put("王老师","3老师");
        map.put("高老师","4老师");
        String s = JSONObject.toJSONString(map);
        System.out.println(s);
    }
}
