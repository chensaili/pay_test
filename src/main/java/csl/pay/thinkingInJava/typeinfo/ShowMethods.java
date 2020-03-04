package csl.pay.thinkingInJava.typeinfo;//: typeinfo/ShowMethods.java

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
//获取Class对象，然后通过class对象反射获取这个类的构造器和普通方法
public class ShowMethods {
  private int a;
  private int b;

  public ShowMethods(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public ShowMethods() {
  }

  public void method(){
    System.out.println("哈哈哈");
  }
  public static void main(String[] args) throws ClassNotFoundException {
    Class c=Class.forName("csl.pay.thinkingInJava.typeinfo.ShowMethods");
    Constructor[] constructors = c.getConstructors();
    for(Constructor con:constructors){
      System.out.println(con);
    }
    Method[] methods = c.getMethods();
    for(Method method:methods){
      System.out.println(method);
    }
  }
}

