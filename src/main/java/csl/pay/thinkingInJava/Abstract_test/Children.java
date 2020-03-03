package csl.pay.thinkingInJava.Abstract_test;

public class Children extends Father {
    public Children(int i){
        super.i=i;
    }
    @Override
    public void method() {
        System.out.println(super.i);
    }
}
