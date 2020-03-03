package csl.pay.experiment.traverse_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//遍历map集合
public class Traverse_Map {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);
        //使用keySet遍历
        Set<Integer>set=map.keySet();
        for(Integer s:set){
            System.out.println(s+" "+map.get(s));
        }

        //使用entrySet进行遍历
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //使用迭代器进行遍历（陌生）
        Iterator<Map.Entry<Integer,Integer>>iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer>entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
