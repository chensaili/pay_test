package csl.pay.thinkingInJava.typeinfo;

class Dog {
    static final String s1 = "Dog_s1";
    static  String s2 = "Dog_s2";
    static {
        System.out.println("Loading Horse");
    }
}
class Cat {
    static String s1 = "Cat_s1";
    static {
        System.out.println("Loading Cat");
    }
}
public class ClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("----Star Horse----");
        Class dog = Dog.class;//不会引发初始化
        System.out.println("------");
        System.out.println(Dog.s1);//调用static final，不会引发初始化
        System.out.println("------");
        System.out.println(Dog.s2);//调用非final的static域，会引发初始化
        System.out.println("---start Cat---");
        Class cat = Class.forName("csl.pay.thinkingInJava.typeinfo.Cat");//引发初始化
        System.out.println("-------");
        System.out.println(Cat.s1);
        System.out.println("finish main");
    }
}
