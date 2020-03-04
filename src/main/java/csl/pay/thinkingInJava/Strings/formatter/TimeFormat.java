package csl.pay.thinkingInJava.Strings.formatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
//formatter类对时间格式化的操作
public class TimeFormat {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat1.format(new Date()));//2020-03-04 08:56:39
        SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        System.out.println(dateFormat2.format(new Date()));//2020:03:04 08:56:39

        Formatter formatter=new Formatter(System.out);
        formatter.format("%tp\n",new Date());//上午/下午
        formatter.format("%tF\n",new Date());//2020-03-04
        formatter.format("%tR\n",new Date());//09:00
        formatter.format("%tT\n",new Date());//09:00:54
        formatter.format("%tr\n",new Date());//09:00:54 上午
        formatter.format("%tc\n",new Date());//星期三 三月 04 09:00:54 CST 2020

    }
}
