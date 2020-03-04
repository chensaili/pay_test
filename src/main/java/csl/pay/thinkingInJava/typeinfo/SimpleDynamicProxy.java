package csl.pay.thinkingInJava.typeinfo;//: typeinfo/SimpleDynamicProxy.java
import java.lang.reflect.*;

/**
 * 动态代理
 */
class DynamicProxyHandler implements InvocationHandler {
  private Object proxied;
  public DynamicProxyHandler(Object proxied) {
    this.proxied = proxied;
  }
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
    if(args != null) {
      for (Object arg : args) {
        System.out.println("  " + arg);
      }
    }
    return method.invoke(proxied, args);
  }
}	

class SimpleDynamicProxy {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
    RealObject real = new RealObject();
    consumer(real);

    //Proxy.newProxyInstance创建一个代理对象
    Interface proxy = (Interface)Proxy.newProxyInstance(
            Interface.class.getClassLoader(),
      new Class[]{ Interface.class },
      new DynamicProxyHandler(real));
    consumer(proxy);
  }
}