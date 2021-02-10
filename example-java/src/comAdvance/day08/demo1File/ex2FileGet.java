package comAdvance.day08.demo1File;

import com.static6.Demo02StaticMethod;

import java.io.File;

/*
    File类获取功能的方法
        - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        - public String getPath() ：将此File转换为路径名字符串。
        - public String getName()  ：返回由此File表示的文件或目录的名称。
        - public long length()  ：返回由此File表示的文件的长度。
 */
public class ex2FileGet {
    public static void main(String[] args) {

     //   demo1();    //getAbsolutePath()
     //   demo2();   //  getPath()
     //   demo3();    //getName()
        demo4();     // length()
    }

    /*
       public long length()  ：返回由此File表示的文件的长度。
       获取的是构造方法指定的文件的大小,以字节为单位
       注意:
           文件夹是没有大小概念的,不能获取文件夹的大小
           如果构造方法中给出的路径不存在,那么length方法返回0
    */
    private static void demo4() {


        File f2 = new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\code\\08_FileAndRecursion");
        System.out.println(f2.length());

        File f3 = new File("C:\\develop\\a");
        System.out.println(f3.length());//0 文件夹没有大小概念的
    }

    /*
     public String getName()  ：返回由此File表示的文件或目录的名称。
     获取的就是构造方法传递路径的结尾部分(文件/文件夹)
  */
    private static void demo3() {
        File f1=new File("c:\\ii\\a.txt");
        System.out.println(f1.getName());

        File f2=new File("c:\\ii");
        System.out.println(f2.getName());

    }


    /*
     public String getPath() ：将此File转换为路径名字符串。
     获取的构造方法中传递的路径

     toString方法调用的就是getPath方法
     源码:
         public String toString() {
             return getPath();
         }
  */
       private static void demo2() {
           File f1 = new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\code\\08_FileAndRecursion\\1.txt");
           String n1 = f1.getPath();
           System.out.println(n1);

           File f2 = new File("1.txt");
           System.out.println(f2.getPath());

           System.out.println(f2);
           System.out.println(f2.toString());

       }

    /*
       public String getAbsolutePath() ：返回此File的绝对路径名字符串。
       获取的构造方法中传递的路径
       无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
    */
    private static void demo1() {
        File f1=new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\code\\08_FileAndRecursion\\1.txt");
        String n1=f1.getAbsolutePath();
        System.out.println(n1);

        File f2=new File("1.txt");
        System.out.println(f2.getAbsolutePath());
    }


}
