package csl.pay.thinkingInJava.P196;

public class Animal {
    void draw(){
        System.out.println("draw animal");
    }
    public Animal(){
        System.out.println("before");
        draw();
        System.out.println("after");
    }
}
