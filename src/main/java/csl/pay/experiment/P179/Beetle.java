package csl.pay.experiment.P179;

public class Beetle extends Insect {
    private int k=printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k="+k);
        System.out.println("j="+j);
    }
    private static int x2=
            printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Insect b=new Beetle();
    }
}
