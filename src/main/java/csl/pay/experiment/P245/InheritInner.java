package csl.pay.experiment.P245;//: innerclasses/InheritInner.java
// Inheriting an inner class.
//内部类的继承
class WithInner {
  public WithInner(){
    System.out.println("外部类");
  }
  class Inner {
    public Inner(){
      System.out.println("内部类");
    }
  }
}

public class InheritInner extends WithInner.Inner {
  // InheritInner() {} // Won't compile
  InheritInner(WithInner wi) {
    wi.super();
  }
  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
    //结果是：
    // 外部类
    //内部类
  }
}
/*public class InheritInner extends WithInner{
  // InheritInner() {} // Won't compile
  InheritInner(WithInner wi) {
    super();
  }
  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }
  //结果是：
  //外部类
  //外部类
}*/

