package csl.pay.thinkingInJava.Strings.formatter;//: strings/Turtle.java
import java.util.Formatter;
//Formatter类
//可以在System.out.format(),String.format()方法中直接应用Formatter类。
public class Turtle {
  private String name;
  private Formatter f;
  public Turtle(String name, Formatter f) {
    this.name = name;
    this.f = f;
  }
  public void move(int x, int y) {
    f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
  }
  public static void main(String[] args) {
    /*PrintStream outAlias = System.out;
    Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
    Turtle terry = new Turtle("Terry", new Formatter(outAlias));
    tommy.move(0,0);
    terry.move(4,8);
    tommy.move(3,4);
    terry.move(2,5);
    tommy.move(3,3);
    terry.move(3,3);*/

  }
}
