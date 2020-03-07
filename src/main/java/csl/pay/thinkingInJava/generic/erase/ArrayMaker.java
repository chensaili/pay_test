package csl.pay.thinkingInJava.generic.erase;//: generics/ArrayMaker.java
import java.lang.reflect.*;
import java.util.*;

/**
 * 泛型最令人困惑的一点就是：它可以表示没有任何意义的事物
 *
 * @param <T>
 */
public class ArrayMaker<T> {

  private Class<T> kind;

  public ArrayMaker(Class<T> kind) {
    this.kind = kind;
  }

  @SuppressWarnings("unchecked")
  T[] create(int size) {
    //注意：在泛型中创建数组，使用Array.newInstance是推荐的方式
    //Array.newInstance(kind, size);实际上并未拥有kind所蕴含的类型信息
    return (T[])Array.newInstance(kind, size);
  }

  public static void main(String[] args) {
    ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
    String[] stringArray = stringMaker.create(9);
    System.out.println(Arrays.toString(stringArray));
  }
} /* Output:
[null, null, null, null, null, null, null, null, null]
*///:~
