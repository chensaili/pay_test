package csl.pay.thinkingInJava.Strings;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList1=new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        System.out.println(arrayList1);

        ArrayList<Dog>arrayList=new ArrayList<>();
        Dog dog1=new Dog(1,"a");
        Dog dog2=new Dog(2,"b");
        Dog dog3=new Dog(3,"c");
        arrayList.add(dog1);
        arrayList.add(dog2);
        arrayList.add(dog3);
        System.out.println(arrayList);

        ArrayList<Cat>arrayList2=new ArrayList<>();
        Cat cat1=new Cat(1,"a");
        Cat cat2=new Cat(2,"b");
        Cat cat3=new Cat(3,"c");
        arrayList2.add(cat1);
        arrayList2.add(cat2);
        arrayList2.add(cat3);
        System.out.println(arrayList2);
    }
}
