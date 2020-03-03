package csl.pay.experiment.ExceptionDemo;//: exceptions/DynamicFields.java
// A Class that dynamically adds fields to itself.
// Demonstrates exception chaining.

/**
 * 异常链，使用initCause()方法
 */
class DynamicFieldsException extends Exception {}

public class DynamicFields {
  public void method() throws DynamicFieldsException{
    DynamicFieldsException df=new DynamicFieldsException();
    df.initCause(new NullPointerException());
    throw df;
  }

  public static void main(String[] args) {
    DynamicFields dynamicFields=new DynamicFields();
    try {
      dynamicFields.method();
    }catch (DynamicFieldsException e){
      e.printStackTrace(System.out);
    }
  }
}