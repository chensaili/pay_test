package csl.pay.thinkingInJava.typeinfo.nullobject;
//定义工厂类
public class BookFactory {

    public Book getBook(int ID) {
        Book book;
        switch (ID) {
            case 1:
                book = new ConcreteBook(ID, "设计模式", "GoF");
                break;
            case 2:
                book = new ConcreteBook(ID, "我的设计模式", "空对象模式");
                break;
            default:
                book = new NullBook();//创建一个NullBook对象
                break;
        }
        return book;
    }
}
