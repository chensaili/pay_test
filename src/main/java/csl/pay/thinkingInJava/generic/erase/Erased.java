package csl.pay.thinkingInJava.generic.erase;//: generics/Erased.java
// {CompileTimeError} (Won't compile)

/**
 * 泛型不能显示的引用运行时类型的操作之中，例如转型instanceof和new表达式
 * @param <T>
 */
public class Erased<T> {
  private final int SIZE = 100;
  Class<T>kind;
  public void f1(Object arg) {
    /*if(arg instanceof kind) {//ERROR

    }*/
    //if(arg instanceof T) {}          // Error
    //T var = new T();                 // Error
    //T[] array = new T[SIZE];         // Error不能创建泛型数组
    //T[] array = (T)new Object[SIZE]; // Unchecked warning

    if(kind.isInstance(arg)){ }//引入类型标签和使用isInstance来补偿instanceof报错的情况

  }
} ///:~
