package csl.pay.enum_study;

/**
 * 在枚举类中定义抽象方法
 */
public enum Color4 implements Info{
    RED(10){
        @Override
        public String getColor2() {
            return "red";
        }
    },GREEN(20){
        @Override
        public String getColor2() {
            return "green";
        }
    },BLUE{
        @Override
        public String getColor2() {
            return "blue";
        }
    };
    private int color;
    private Color4(){
        System.out.println("color4无参构造器");
    }
    private Color4(int color){
        this.color=color;
        System.out.println("color4有参构造器");
    }

    @Override
    public int getColor() {
        return color;
    }

    public abstract String getColor2();
}
