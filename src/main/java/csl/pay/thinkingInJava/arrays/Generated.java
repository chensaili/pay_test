//: net/mindview/util/Generated.java
package csl.pay.thinkingInJava.arrays;

import csl.pay.thinkingInJava.generic.coffee.Generator;

/**
 * 从Generator中创建数组第一步，这一步只能创建Object子类型的数组
 */
public class Generated {
  // Fill an existing array:
  public static <T> T[] array(T[] a, Generator<T> gen) {
    return new CollectionData<T>(gen, a.length).toArray(a);
  }
  // Create a new array:
  @SuppressWarnings("unchecked")
  public static <T> T[] array(Class<T> type,
      Generator<T> gen, int size) {
    T[] a =
      (T[])java.lang.reflect.Array.newInstance(type, size);
    return new CollectionData<T>(gen, size).toArray(a);
  }
} ///:~
