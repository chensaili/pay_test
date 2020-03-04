package csl.pay.thinkingInJava.typeinfo.nullobject;
//新增一个空对象类NullBook类
public class NullBook implements Book{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void show() {
        System.out.println("sorry，没有找到你输入ID的图书信息");
    }
}
