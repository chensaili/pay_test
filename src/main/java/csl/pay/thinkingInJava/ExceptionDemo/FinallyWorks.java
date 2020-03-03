package csl.pay.thinkingInJava.ExceptionDemo;//: exceptions/FinallyWorks.java
// The finally clause is always executed.
//如果try中出现了return，finally中的语句是否还会执行
class ThreeException extends Exception {}

public class FinallyWorks {
  static int count = 0;
  public static void main(String[] args) {
      try {
        if(count== 0) {
          throw new ThreeException();
        }
        if(count==1){
          //即使try中出现了return，finally中的语句也会被执行
          return;
        }
        //如果上面抛出了异常，那么下面的语句就不会再执行
        System.out.println("No exception");
      } catch(ThreeException e) {
        System.out.println("ThreeException");
      } finally {
        System.out.println("In finally clause");
      }
  }
}