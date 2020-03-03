package csl.pay.experiment.QueueDemo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * 如果想实现按照自己的意愿进行优先级排列的队列的话，需要实现Comparator接口
 * 这里自定义一个类，根据类的年龄进行排序
 */

public class PriorityQueueDemo {
    private int age;
    private String name;

    public PriorityQueueDemo(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //如果不重写toString()方法，那么在main方法打印出来的是地址
    @Override
    public String toString() {
        return "PriorityQueueDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Comparator<PriorityQueueDemo>comparator=new Comparator<PriorityQueueDemo>() {
            @Override
            public int compare(PriorityQueueDemo o1, PriorityQueueDemo o2) {
                int i1=o1.getAge();
                int i2=o2.getAge();
                if (i1<i2){
                    return -1;
                }else if(i1>i2){
                    return 1;
                }else {
                    return 0;
                }
            }
        };
        Queue<PriorityQueueDemo>queueDemos=new PriorityQueue<>(comparator);
        PriorityQueueDemo demo1=new PriorityQueueDemo(2,"b");
        PriorityQueueDemo demo2=new PriorityQueueDemo(3,"c");
        PriorityQueueDemo demo3=new PriorityQueueDemo(1,"a");
        queueDemos.offer(demo1);
        queueDemos.offer(demo2);
        queueDemos.offer(demo3);
        while(!queueDemos.isEmpty()){
            System.out.println(queueDemos.poll());
        }
    }
}
