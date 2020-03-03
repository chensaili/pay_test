package csl.pay.thinkingInJava.Strings;//: strings/InfiniteRecursion.java

import java.util.*;
//无意识的递归P320
public class InfiniteRecursion {
  /*public String toString() {
    //这里发生了自动类型转换，试着将this转换成String
    //通过toString()方法把InfiniteRecursion转换成String，于是发生了递归调用
    return " InfiniteRecursion address: " + this + "\n";
  }*/

  public String toString() {
    //如果想要打印内存地址，那么不能使用this，而是使用super.toString()
    return " InfiniteRecursion address: " + super.toString() + "\n";
  }
  public static void main(String[] args) {
    //这里打印的是[内存地址]
    List<InfiniteRecursion> list1 = new ArrayList<InfiniteRecursion>();
    for(int i = 0; i < 10; i++)
      list1.add(new InfiniteRecursion());
    System.out.println(list1);

    //这里打印的是[a,a,a,a,a...]因为String类重写了toString()方法
    List<String> list2 = new ArrayList<String>();
    for(int i = 0; i < 10; i++)
      list2.add("a");
    System.out.println(list2);
  }
}
