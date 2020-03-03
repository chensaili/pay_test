package csl.pay.experiment.ExceptionDemo;//: exceptions/ExceptionMethods.java
// Demonstrating the Exception Methods.

/**
 * 异常信息打印
 * 从结果可以看出每一个方法都比前面一个方法提供了更多的信息
 */

public class ExceptionMethods {
  public static void main(String[] args) {
    try {
      throw new Exception("My Exception");//括号里的内容就是getMessage()方法获取到的
    } catch(Exception e) {
      System.out.println(("Caught Exception"));
      System.out.println(("getMessage():" + e.getMessage()));
      System.out.println(("getLocalizedMessage():" +
              e.getLocalizedMessage()));
      System.out.println(("toString():" + e));
      System.out.println(("printStackTrace():"));
      e.printStackTrace(System.out);
    }
  }
}
