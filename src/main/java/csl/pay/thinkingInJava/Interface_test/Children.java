package csl.pay.thinkingInJava.Interface_test;

public class Children implements Father {
    @Override
    public void method() {
        System.out.println(i);
        //System.out.println(super.i);报错
    }
}
