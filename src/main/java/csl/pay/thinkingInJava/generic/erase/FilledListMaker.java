package csl.pay.thinkingInJava.generic.erase;//: generics/FilledListMaker.java
import java.util.*;

/**
 * 即使编译器无法知道有关create（）中T的任何信息，但是它仍然可以在编译器确保放置到result中的对象具有T类型
 * @param <T>
 */
public class FilledListMaker<T> {
  private int i;
  List<T> create(T t, int n) {
    List<T> result = new ArrayList<T>();
    for(int i = 0; i < n; i++) {
      result.add(t);
      //result.add(i);报错，编译器确保放置到result中的对象具有T类型
    }
    return result;
  }
  public static void main(String[] args) {
    FilledListMaker<String> stringMaker =
      new FilledListMaker<String>();
    List<String> list = stringMaker.create("Hello", 4);
    System.out.println(list);
  }
} /* Output:
[Hello, Hello, Hello, Hello]
*///:~
