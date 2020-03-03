package csl.pay.thinkingInJava.P216;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * 创建一个类，它将生成一个char序列，适配这个类，使其成为Scanner对象的一种输入
 * 第二步：创建一个适配器类
 */
public class Adpter extends Generate_Char implements Readable{
    private int count;
    public Adpter(int count){
        this.count=count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count--==0){
            return -1;
        }
        char[]chs=next();
        for(char ch:chs){
            cb.append(ch);
        }
        return chs.length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(new Adpter(1));
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
