package csl.pay.thinkingInJava.generic.covariant;//: generics/GenericWriting.java
import java.util.*;

public class GenericWriting {
  static <T> void writeExact(List<T> list, T item) {
    list.add(item);
  }
  static List<Apple> apples = new ArrayList<Apple>();
  static List<Fruit> fruit = new ArrayList<Fruit>();
  static void f1() {
    writeExact(apples, new Apple());
    // writeExact(fruit, new Apple()); // Error: Incompatible types: found Fruit, required Apple
  }

  //可以向list中写入T或者T的子类
  static <T> void writeWithWildcard(List<? super T> list, T item) {
    list.add(item);
  }
  //不可以向list中写入东西
  static <T> void writeWithWildcard1(List<? extends T> list, T item) {
    //list.add(item);error
  }
  static void f2() {
    writeWithWildcard(apples, new Apple());
    writeWithWildcard(fruit, new Apple());
  }
  public static void main(String[] args) {
    f1();
    f2();
  }
}
