package csl.pay.thinkingInJava.Strings.printdemo;
//格式化输出
public class PrintDemo {
    public static void main(String[] args) {
        int x=5;
        double y=0.5;
        System.out.println("x="+x+" y="+y);
        System.out.printf("x=%d y=%f \n",x,y);
        System.out.format("x=%d y=%f \n",x,y);
    }
}
