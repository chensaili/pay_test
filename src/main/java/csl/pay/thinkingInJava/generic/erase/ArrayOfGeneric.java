package csl.pay.thinkingInJava.generic.erase;//: generics/ArrayOfGeneric.java
/**
 * 如何成功的创建泛型数组：创建一个被擦除类型的新数组，然后对其转型
 */
public class ArrayOfGeneric {
  static final int SIZE = 100;
  static Generic<Integer>[] gia;
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    // Compiles; produces ClassCastException:
    //! gia = (Generic<Integer>[])new Object[SIZE];编译器不报错，运行时报错，因为数组在编译期时被强转为Generic<Integer>[]，在运行时依旧为Object数组
    // Runtime type is the raw (erased) type:
    gia = (Generic<Integer>[])new Generic[SIZE];
    System.out.println(gia.getClass().getSimpleName());
    gia[0] = new Generic<Integer>();
    //! gia[1] = new Object(); // Compile-time error
    // Discovers type mismatch at compile time:
    //! gia[2] = new Generic<Double>();
  }
} /* Output:
Generic[]
*///:~
