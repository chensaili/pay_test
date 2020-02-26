package csl.pay.json_string;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.*;

public class Json_date {
    //打印value为Date类型的map
    public static void mapToJson1(Map<String,Date> map){
        //打印出来的value为时间戳
        System.out.println(JSON.toJSON(map));
        //打印出来的value为格式化的日期字符串
        System.out.println(
                JSON.toJSONStringWithDateFormat(map, "yyyy-MM-dd  HH:mm:ss", SerializerFeature.WriteDateUseDateFormat));
    }
    //打印普通的map集合
    public static void mapToJson2(Map<String,String> map){
        System.out.println(
                JSON.toJSON(map)
        );
    }

    public static void main(String[] args) {
        Map<String, Date>map1=new HashMap<>();
        map1.put("value为Date类型，试验1为",new Date());
        map1.put("value为Date类型，试验2为",new Date());
        mapToJson1(map1);
        Map<String, String>map2=new HashMap<>();
        map2.put("a","aa");
        map2.put("b","bb");
        mapToJson2(map2);
    }
}
