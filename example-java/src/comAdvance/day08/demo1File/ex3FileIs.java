package comAdvance.day08.demo1File;

import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class ex3FileIs {
    public static void main(String[] args) {
    //   demo1();      //exists()
        demo2();      //isDirectory()  和   isFile()
    }

    /*
     public boolean isDirectory() ：此File表示的是否为目录。
         用于判断构造方法中给定的路径是否以文件夹结尾
             是:true
             否:false
     public boolean isFile() ：此File表示的是否为文件。
         用于判断构造方法中给定的路径是否以文件结尾
             是:true
             否:false
     注意:
         电脑的硬盘中只有文件/文件夹,两个方法是互斥
         这两个方法使用前提,路径必须是存在的,否则都返回false
  */
    private static void demo2() {

        File f1=new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\img");

        File f2=new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\img\\day08_01_递归累和.jpg");

        System.out.println(f1.getName());
        System.out.println(f2.getName());
        if(f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
        System.out.println("-------------");

        if(f2.exists()) {
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
    }

    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在:true
            不存在:false
     */
    private static void demo1() {
        File f1=new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\video");
        System.out.println(f1.exists());

        File f2=new File("a.txt");
        System.out.println(f2.exists());

    }
}
