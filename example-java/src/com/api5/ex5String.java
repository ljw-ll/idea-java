package com.api5;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex5String {
    public static void main(String[] args) {

        //creat1();
        // demo1();
        // equals();
        // getSt();
        // subSt();
        // convertSt();
        // spiltSt();
      /*  int[] arr1 = {1, 2, 3};
        String s = demo2(arr1);
        System.out.println(s);
       */

        demo3();
    }

    /*
     * 构造函数
     * 三种构造方法：
     *public String()：创建一个空白字符串，不含有任何内容。
     *public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
     *public String(byte[] array)：根据字节数组的内容，来创建对应的字符串。
     *一种直接创建：
     *String str = "Hello"; // 右边直接用双引号
     */
    public static void creat1() {

        String str1 = new String();
        String str2 = new String("abc");
        System.out.println("字符串1：" + str1);
        System.out.println("字符串2：" + str2);

        char[] arr1 = new char[]{'A', 'b', 'c'};
        String str3 = new String(arr1);
        System.out.println(str3);

        byte[] arr2 = new byte[]{65, 66, 67};
        System.out.println(Arrays.toString(arr2));
        String str4 = new String(arr2);
        System.out.println(str4);

        String str5 = "hello";
        System.out.println(str5);
    }

    /*
     *字符串常量池
     *程序当中直接写上的双引号字符串，就在字符串常量池中。
     *对于基本类型来说，==是进行数值的比较。
     *对于引用类型来说，==是进行【地址值】的比较。
     */
    public static void demo1() {

        String str1 = "abc";
        String str2 = "abc";
        char[] arr = new char[]{'a', 'b', 'c'};
        String str3 = new String(arr);
        String str4 = new String(arr);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        //当 new 创建，相对字符串的新对象时，地址会变化
        System.out.println(str4 == str3);  //false;
    }

    /*
     *==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

     *public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false。
     *注意事项：
     *1. 任何对象都能用Object进行接收。
     *2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
     *3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
     *："abc".equals(str)    不推荐：str.equals("abc")

     *public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。
     */

    public static void equals() {
        String str1 = "hello";
        String str2 = "hello";
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(arr);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));

        System.out.println("------------------");
        String str4 = null;
        System.out.println("abc".equals(str4));  //推荐常量写在前面
        //  System.out.println(str4.equals("abc"));   //不推荐 ，可能会产生空指针保存

        System.out.println("------------------");

        String str5 = "java";
        String str6 = "Java";
        System.out.println(str5.equals(str6));
        System.out.println(str5.equalsIgnoreCase(str6));  //忽略大小写

        //只有英文字母区分大小写，其他的不区分
        System.out.println("abc一abc".equalsIgnoreCase("abc壹abc"));

    }

    /*
     * String当中与获取相关的常用方法有：
     *public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
     *public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
     *public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
     *public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
     */

    public static void getSt() {

        int len = "avallabalba".length();
        System.out.println(len);

        // 字符串拼接
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(" " + str2);
        System.out.println(str3);

        // 获取指定位置的单个字符
        char s = "hello".charAt(4);
        System.out.println(s);

        // 查找字符串第一次 出现的索引位置，若无该字符串 则为-1；
        String str4 = "helloworldaaaa";
        int id1 = str4.indexOf("llo");
        int id2 = str4.indexOf("b");
        System.out.println(id1);
        System.out.println(id2);

    }

    /*
     *字符串截取
     * public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
     *public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
     *备注：[begin,end)，包含左边，不包含右边。
     */
    public static void subSt() {
        String str1 = "helloworld";
        String str2 = str1.substring(2);
        String str3 = str1.substring(2, 5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    /*
     *字符串转换
     * public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
     *public byte[] getBytes()：获得当前字符串底层的字节数组。
     *public String replace(CharSequence oldString, CharSequence newString)：
     *将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
     *备注：CharSequence意思就是说可以接受字符串类型。
     */
    public static void convertSt() {
        char[] chars = "hello".toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("---------------------");

        byte[] bytes = "abc".getBytes();
        System.out.println(Arrays.toString(bytes));

        String str = "how are you dong in aaaaa";
        str = str.replace("a", "b");
        System.out.println(str);

        String str1 = "会不会玩呀？你大爷的！";
        String str2 = str1.replace("你大爷的", "****");
        System.out.println(str2);
    }

    /*
     *字符串的分割
     */

    public static void spiltSt() {

        String str1 = "aaa,bbb,ccc";
        String[] arr1 = str1.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("--------------------");
        String str2 = "aaa.bbb.ccc";
        String[] arr2 = str2.split("\\.");
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }


    /*
     *  题目：
     *定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
     */
    public static String demo2(int[] arr) {

        String str1 = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                str1 += "word" + arr[i] + "]";
            else {
                str1 += "word" + arr[i] + "#";
            }
        }
        //  System.out.println(Arrays.toString(arr).replace(",","#").replace(" ",""));
        return str1;
    }

    /*
     *题目：
     *键盘输入一个字符串，并且统计其中各种字符出现的次数。
     *种类有：大写字母、小写字母、数字、其他
     */

    public static void demo3(){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s=in.next();
        char ch;
        int smallNum=0,bigNum=0,num=0,otherNum=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch>='0'&&ch<='9')
                num++;
            else if(ch>='a'&&ch<='z')
                smallNum++;
            else if(ch>='A'&&ch<='Z')
                bigNum++;
            else {
                otherNum++;
                System.out.println(ch);
            }
        }
        System.out.println("大写字母："+bigNum);
        System.out.println("小写字母："+smallNum);
        System.out.println("数字：  "+num);
        System.out.println("其他字母: "+otherNum);


    }

}
