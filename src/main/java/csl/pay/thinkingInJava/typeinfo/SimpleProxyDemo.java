package csl.pay.thinkingInJava.typeinfo;//: typeinfo/SimpleProxyDemo.java

/**
 * 展示代理结构的简单模型
 */

interface Interface {
  void doSomething();
  void somethingElse(String arg);
}
//实际对象实现了接口
class RealObject implements Interface {
  public void doSomething() {
    System.out.println(("doSomething"));
  }
  public void somethingElse(String arg) {
    System.out.println(("somethingElse " + arg));
  }
}	
//代理对象实现了同一个接口
class SimpleProxy implements Interface {
  private Interface proxied;
  public SimpleProxy(Interface proxied) {
    this.proxied = proxied;
  }
  public void doSomething() {
    System.out.println(("SimpleProxy doSomething"));
    proxied.doSomething();
  }
  public void somethingElse(String arg) {
    System.out.println(("SimpleProxy somethingElse " + arg));
    proxied.somethingElse(arg);
  }
}	

class SimpleProxyDemo {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
  }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~
