package csl.pay.thinkingInJava.typeinfo.nullobject;

public class Test {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.getBook(-1);
        book.show();
    }
}
