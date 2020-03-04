package csl.pay.thinkingInJava.typeinfo;
//泛化的Class
public class GenericClass {
    public static void main(String[] args) {
        /**
         * int.class和Integer.class指向的不是同一个Class对象引用，但是它们基本类型和包装类的关系，
         * int可以自动包装为Integer，
         * 所以编译器可以编译通过
         */
        Class<Integer>c1=int.class;
        c1=Integer.class;
        //c1=Double.class;报错

        /**
         * 泛型中的类型可以持有其子类的引用吗？不行
         * 虽然Integer继承自Number，但是编译器无法编译通过。
         */
        //Class<Number>c2=Integer.class;

        /**
         * 为了使用泛化的Class引用放松限制，我们还可以使用通配符，
         * 它是Java泛型的一部分。
         * 通配符的符合是”?“，表示“任何事物“：
         */
        Class<?>c3=int.class;
        c3=double.class;

        /**
         * 通配符?可以与extend结合
         * 表示被限定为某种类型，或该类型的任何子类型
         */
        Class<? extends Number> c4 = Integer.class;
        c4 = Number.class;
        c4 = Double.class;
        //c4=String.class;报错，String不属于Number类及其子类

        /**
         * 通配符?不仅可以与extend结合，而且还可以与super关键字相结合，
         * 表示被限定为某种类型，或该类型的任何父类型：
         */
        Class<? super Integer> c5 = Integer.class;
        c5 = Number.class;
        c5 = Object.class;
        c5=Integer.class.getSuperclass();
    }
}
