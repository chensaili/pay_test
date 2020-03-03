package csl.pay.experiment.ExceptionDemo;

/**
 * 异常的限制
 */
//BaseballException，Foul，Strike，StormException，RainedOut，PopFoul
class BaseballException extends Exception {}

class Foul extends BaseballException {}
class Strike extends BaseballException {}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}


abstract class Inning {
  public Inning() throws BaseballException {}
  public void event() throws BaseballException {
  }
  public abstract void atBat() throws Strike, Foul;
  public void walk() {}
}

interface Storm {
  public void event() throws RainedOut;
  public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
  //1.当父类的构造方法抛出异常，子类必须有一个构造方法是抛出相同异常或者此异常的父类
  //public StormyInning(){};报错
  public StormyInning() throws RainedOut, BaseballException {}
  public StormyInning(String s) throws Foul, BaseballException {}

  //2.当父类方法没有抛出异常，子类覆盖的方法不能够抛出异常
  //public void walk()throws PopFoul{}报错

  //3.当父类与接口具有相同的方法而且方法同时抛出不同的异常，这个时候是不允许的
  // 但是允许在子类的方法中不抛出异常
  //public void event() throws RainedOut {}
  //public void event() throws BaseballException {}
  public void event(){}

  // If the method doesn't already exist in the base class, the exception is OK:
  public void rainHard() throws RainedOut {}

  //4.子类覆盖的方法可以抛出父类抛出异常的子类（PopFoul是Foul的子类）
  public void atBat() throws PopFoul {}



  public static void main(String[] args) {
    try {
      StormyInning si = new StormyInning();
      si.atBat();
    } catch(PopFoul e) {
      System.out.println("Pop foul");
    } catch(RainedOut e) {
      System.out.println("Rained out");
    } catch(BaseballException e) {
      System.out.println("Generic baseball exception");
    }
    try {
      Inning i = new StormyInning();
      i.atBat();
    } catch(Strike e) {
      System.out.println("Strike");
    } catch(Foul e) {
      System.out.println("Foul");
    } catch(RainedOut e) {
      System.out.println("Rained out");
    } catch(BaseballException e) {
      System.out.println("Generic baseball exception");
    }
  }
}
