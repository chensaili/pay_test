package csl.pay.experiment.P196;

public class Dog extends Animal {
    private int i=1;
    public Dog(int in){
        i=in;
    }
    @Override
    void draw(){
        System.out.println("draw dog  "+i);
    }
}
