package csl.pay.enum_study;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;

public class EnumDemo {

    public Color colorEnum;
    @Test
    public void test1(){
        //枚举限定了颜色这个变量的取值，除了BLUE,RED,GREEN三种取值外，不能有其他取值
        //colorEnum=Color.BLUE;
        //colorEnum=Color.RED;
        colorEnum=Color.GREEN;
        System.out.println(colorEnum);

        System.out.println(colorEnum.name());
        System.out.println(colorEnum.ordinal());

        Color[]values=Color.values();
        System.out.println(Arrays.toString(values));
    }

    @Test
    public void test2(){
        EnumSet<Color>set=EnumSet.allOf(Color.class);
        for(Color c:set){
            System.out.println(c);
        }

        EnumMap<Color,String>map=new EnumMap<Color, String>(Color.class);
        map.put(Color.RED,"red");
        map.put(Color.GREEN,"green");
        map.put(Color.BLUE,"blue");
    }

    @Test
    public void test3(){
        System.out.println(Color2.RED);
    }

    @Test
    public void test4(){
        System.out.println(Color3.RED.getColor());
    }

    @Test
    public void test5(){
        System.out.println(Color4.RED.getColor2());
    }

    @Test
    public void test6(){
        Singleton.SINGLETON.method();
    }
}
