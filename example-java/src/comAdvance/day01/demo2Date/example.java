package comAdvance.day01.demo2Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习:
        请使用日期时间相关的API，计算出一个人已经出生了多少天。
 */
public class example {
    public static void main(String[] args) throws ParseException {

        Scanner scan=new Scanner(System.in);

        System.out.println("请输入出生日期格式为：yyyy-MM-dd");
        String s=scan.next();
        DateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
        Date d2=fmt.parse(s);

        Date d1=new Date();

        // 将两个日期转成毫秒值,Date类的方法getTime
        long num=d1.getTime()- d2.getTime();

        if(num<0){
            System.out.println("还没有出生");
        }
       else  System.out.println(num/1000/60/60/24);
    }
}
