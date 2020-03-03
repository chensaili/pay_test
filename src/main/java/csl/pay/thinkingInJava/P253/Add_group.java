package csl.pay.thinkingInJava.P253;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//添加一组元素
public class Add_group {
    public static void main(String[] args) {
        /**
         * Arrays.asList()方法接受一个数组或者一个用逗号分隔的元素列表
         * 并将其转换为一个List对象
         */
        Integer[]input1=new Integer[]{1,2,3,4};
        //asList返回的ArrayList并不是我们熟悉的java.util.ArrayList，而是另一个类，所以会报错
        List<Integer> list1=Arrays.asList(input1);
        //list1.add(5);//Exception in thread "main" java.lang.UnsupportedOperationException

        //如果要往其中添加元素，需要进行转换
        Integer[]input2=new Integer[]{1,2,3,4};
        List<Integer> list2=Arrays.asList(input2);
        ArrayList<Integer>arrayList2=new ArrayList<>(list2);
        arrayList2.add(5);

        /**
         * Colllectin.addAll()方法接收一个Collection对象，以及一个数组或者一个用逗号分隔的列表
         * 将元素添加到Collection
         */
        List<Integer> list3=Arrays.asList(1,2,3,4);
        Collection<Integer>collection=new ArrayList<>(list3);
        Integer[]input4=new Integer[]{5,6,7,8};
        //使用addAll()方法将一个List的元素全部加入Collection中，该方法只能接收另一个Collection对象作为参数
        collection.addAll(Arrays.asList(input4));
        for (Integer in:collection){
            System.out.print(in+" ");
        }
    }
}
