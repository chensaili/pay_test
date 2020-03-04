package csl.pay.thinkingInJava.Strings.formatter;//: strings/Receipt.java
import java.util.*;
//Formatter类的基本用法
public class Receipt {
  private double total = 0;
  private Formatter f = new Formatter(System.out);//加了System.out之后，才会在控制台输出，否则控制台没有输出

  public void printTitle() {
    f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
    f.format("%-15s %5s %10s\n", "----", "---", "-----");
  }

  public void print(String name, int qty, double price) {
    f.format("%-15.15s %5d %10.2f\n", name, qty, price);//这里的precision应用于String和浮点
    total += price;
  }

  public void printTotal() {//%-15的“-”表示的是左对齐，默认为右对齐
    f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
    f.format("%-15s %5s %10s\n", "", "", "-----");
    f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
  }

  public static void main(String[] args) {
    Receipt receipt = new Receipt();
    receipt.printTitle();
    receipt.print("Jack's Magic Beans", 4, 4.25);
    receipt.print("Princess Peas", 3, 5.1);
    receipt.print("Three Bears Porridge", 1, 14.29);
    receipt.printTotal();
  }
}
