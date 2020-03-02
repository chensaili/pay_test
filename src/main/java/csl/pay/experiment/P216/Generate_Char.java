package csl.pay.experiment.P216;

import java.util.Random;

/**
 * 创建一个类，它将生成一个char序列，适配这个类，使其成为Scanner对象的一种输入
 * 第一步：创建一个生成char序列的类
 */

public class Generate_Char {
    private char[]chs={'a','b','c','d','e','f','g','h','i','g'};
    private static Random random=new Random();
    private char[]res;
    public char[] next(){
        res=new char[chs.length];
        for(int i=0;i<chs.length;i++){
            res[i]=chs[random.nextInt(10)];
        }
        return res;
    }

    public static void main(String[] args) {
        Generate_Char generate_char=new Generate_Char();
        char[]chs=generate_char.next();
        for(char ch:chs){
            System.out.print(ch+" ");
        }
    }
}
