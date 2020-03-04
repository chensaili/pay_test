package csl.pay.thinkingInJava.typeinfo.nullobject;
//新增一个非空对象类ConcreteBook类
public class ConcreteBook implements Book {
    private int ID;
    private String name;
    private String author;
    // 构造函数
    public ConcreteBook(int ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    public void show() {
        System.out.println(ID + "**" + name + "**" + author);
    }
}
