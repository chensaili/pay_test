package csl.pay.enum_study;

public enum  Color3 implements Info {
    RED(10),GREEN(20),BLUE;
    private int color;
    private Color3(){
        System.out.println("color3无参构造器");
    }
    private Color3(int color){
        this.color=color;
        System.out.println("color3有参构造器");
    }

    @Override
    public int getColor() {
        return color;
    }
}
