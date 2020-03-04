package csl.pay.thinkingInJava.typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

/**
 * 展示了Class对象仅在需要的才被加载，static初始化是在类加载时进行的
 */
class Candy {
  static {
    System.out.println(("Loading Candy"));
  }
}

class Gum {
  static {
    System.out.println(("Loading Gum"));
  }
}

class Cookie {
  static {
    System.out.println(("Loading Cookie"));
  }
}

public class SweetShop {
  public static void main(String[] args) {
    System.out.println(("inside main"));
    new Candy();
    System.out.println(("After creating Candy"));
    try {
      Class.forName("csl.pay.thinkingInJava.typeinfo.Gum");
    } catch(ClassNotFoundException e) {
      System.out.println(("Couldn't find Gum"));
    }
    System.out.println(("After Class.forName(\"Gum\")"));
    new Cookie();
    System.out.println(("After creating Cookie"));
  }
}