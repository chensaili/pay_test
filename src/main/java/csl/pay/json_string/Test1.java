package csl.pay.json_string;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test1 {
    public static void main(String[] args) {
        String json="{\"name\":\"呵呵\",\"age\":22}";
        JSONObject object=JSONObject.parseObject(json);
        Person person= JSON.toJavaObject(object,Person.class);
        System.out.println(person.toString());

        Person person1=new Person("呵呵",22);
        JSONObject object1=(JSONObject) JSON.toJSON(person1);
        System.out.println(object1.toJSONString());
    }
}
