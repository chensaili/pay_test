package csl.pay.thinkingInJava.generic.erase;//: generics/InstantiateGenericType.java
/**
 * new T()会报错
 * java中使用传递一个工厂对象，并使用它来创建新的实例，最便利的工厂对象就是class对象
 * @param <T>
 */

class ClassAsFactory<T> {
  T x;
  public ClassAsFactory(Class<T> kind) {
    try {
      x = kind.newInstance();
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class Employee {}	

public class InstantiateGenericType {
  public static void main(String[] args) {
    ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
    System.out.println(("ClassAsFactory<Employee> succeeded"));
    try {
      ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
    } catch (Exception e) {
      System.out.println(("ClassAsFactory<Integer> failed"));
    }
  }
}
