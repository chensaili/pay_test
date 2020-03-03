package csl.pay.thinkingInJava.InnerClass;

class Parcel4 {
    private int outer=2;
    private class PContent implements Contents{
        private int i=11;
        public int j=22;

        //在内部类中调用外部类的引用
        public Parcel4 getParcel4(){
            return Parcel4.this;
        }

        //在内部类中可访问所有的外部类成员
        @Override
        public int value() {
            return outer;
        }
    }
    public class PContent2 implements Contents{
        private int i=11;
        public int j=22;

        //在内部类中调用外部类的引用
        public Parcel4 getParcel4(){
            return Parcel4.this;
        }

        //在内部类中可访问所有的外部类成员
        @Override
        public int value() {
            return outer;
        }
    }
    public void getInner(){
        //在外部类中无法获取内部类的成员变量
       //System.out.println(j);
    }
    public Contents getContent(){
        return new PContent();
    }
}
class TestParcel4{
    public static void main(String[] args) {
        Parcel4 p=new Parcel4();
        //p.i;外部类对象无法访问内部类private对象
        //p.j;外部类对象无法访问内部类public对象
        //Parcel4.PContent pContent=p.new PContent();使用外部类对象无法创建私有的内部类对象
        //使用外部类对象创建公有的内部类对象
        Parcel4.PContent2 pContent2= p.new PContent2();
        System.out.println(pContent2.j);
        //System.out.println(pContent2.i);报错
    }
}
