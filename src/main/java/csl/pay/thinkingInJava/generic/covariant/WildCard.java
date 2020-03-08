package csl.pay.thinkingInJava.generic.covariant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//通配符的理解
public class WildCard {
    public void printList(List<String> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public void printList2(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        WildCard testWildcard = new WildCard();

        ArrayList<? extends Object> arrayList = new ArrayList<>();
        arrayList.add(null);
        // arrayList.add(testWildcard); // 报错

        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(null);
        arrayList2.add("2");

        List<Integer> li = Arrays.asList(1, 2, 3);
        testWildcard.printList2(li);
        // testWildcard.printList(li); // 报错printList(java.util.List<java.lang.String>)in WildCard cannot be appliedto(java.util.List<java.lang.Integer>)

        List<String> ls = Arrays.asList("one", "two", "three");
        testWildcard.printList2(ls);
        testWildcard.printList(ls);

    }
}