package csl.pay.thinkingInJava.generic.erase;//: generics/FactoryConstraint.java

/**
 * new T()会报错
 * 建议使用显式的工厂，并限制其类型，使得只能接受实现了这个工厂的类（和InstantiateGenericType类对比）
 * @param <T>
 */

//泛型接口
interface FactoryI<T> {
  T create();
}
//泛型类
class Foo2<T> {
  private T x;
  public <F extends FactoryI<T>> Foo2(F factory) {//F属于FactoryI，因此F对象可以调用create方法
    x = factory.create();
  }
  // ...
}

class IntegerFactory implements FactoryI<Integer> {
  public Integer create() {//重写泛型接口里的create方法
    return new Integer(0);
  }
}	

class Widget {
  public static class Factory implements FactoryI<Widget> {
    public Widget create() {
      return new Widget();
    }
  }
}

public class FactoryConstraint {
  public static void main(String[] args) {
    new Foo2<Integer>(new IntegerFactory());
    new Foo2<Widget>(new Widget.Factory());
  }
} ///:~
