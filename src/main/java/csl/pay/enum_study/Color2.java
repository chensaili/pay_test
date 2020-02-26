package csl.pay.enum_study;

/**
 * 带构造方法的枚举
 */
public enum Color2 {
    RED(10),GREEN(20),BLUE;
    private int color;
    private Color2(){
        System.out.println("color2无参构造器");
    }
    private Color2(int color){
        this.color=color;
        System.out.println("color2有参构造器");
    }
}
