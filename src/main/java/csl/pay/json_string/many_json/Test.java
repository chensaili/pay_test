package csl.pay.json_string.many_json;

import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;
import java.util.Set;

//解析嵌套的json字符串
public class Test {
    public static void main(String[] args) {
        /**
         * {
         *     "842": {
         *         "useranswer": "3407|3408",
         *         "score": 0
         *     },
         *     "846": {
         *         "useranswer": "3414",
         *         "score": 0
         *     },
         *     "847": {
         *         "useranswer": "3499",
         *         "score": 2
         *     }
         * }
         */
        String jsonStr = "{\"842\":{\"useranswer\":\"3407|3408\",\"score\":0},\"846\":{\"useranswer\":\"3414\",\"score\":0},\"847\":{\"useranswer\":\"3499\",\"score\":2}}";
        //先将这条数据解析为JSONObject
        JSONObject outJson = JSONObject.parseObject(jsonStr);
        //因为外部的JSON的key为三位数字的编号，我们需要得到编号，才能得到它对应的内部json
        Set<String> jsonSet = outJson.keySet();
        Iterator<String> iterator = jsonSet.iterator();
        while (iterator.hasNext()){
            //通过迭代器可以取到外部json的key
            String json = iterator.next();
            //取得内部json字符串
            String string = outJson.getString(json);
            //将内部json字符串解析为object对象
            JSONObject inJson = JSONObject.parseObject(string);
            //通过score，得到value值
            String score = inJson.getString("score");
            System.out.println(score);
        }
    }
}
