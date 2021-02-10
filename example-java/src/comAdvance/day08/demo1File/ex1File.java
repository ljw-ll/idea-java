package comAdvance.day08.demo1File;
/*
    java.io.File类
    文件和目录路径名的抽象表示形式。
    java把电脑中的文件和文件夹(目录)封装为了一个File类,我们可以使用File类对文件和文件夹进行操作
    我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件夹进行遍历
        获取文件的大小
    File类是一个与系统无关的类,任何的操作系统都可以使用这个类中的方法

    重点:记住这三个单词
        file:文件
        directory:文件夹/目录
        path:路径

        路径:
        绝对路径:是一个完整的路径
            以盘符(c:,D:)开始的路径
                c:\\a.txt
                C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt
                D:\\demo\\b.txt
        相对路径:是一个简化的路径
            相对指的是相对于当前项目的根目录(C:\\Users\itcast\\IdeaProjects\\shungyuan)
            如果使用当前项目的根目录,路径可以简化书写
            C:\\Users\itcast\\IdeaProjects\\shungyuan\\123.txt-->简化为: 123.txt(可以省略项目的根目录)
        注意:
            1.路径是不区分大小写
            2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠
 */



import java.io.File;
import java.lang.reflect.Field;

public class ex1File {
    public static void main(String[] args) {
      //     demo1();
             demo2();  // 构造方法

    }

    /*  File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数:
            String pathname:字符串的路径名称
            路径可以是以文件结尾,也可以是以文件夹结尾
            路径可以是相对路径,也可以是绝对路径
            路径可以是存在,也可以是不存在
            创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况

       File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        参数:把路径分成了两部分
            String parent:父路径
            String child:子路径
        好处:
            父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化

      File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        参数:把路径分成了两部分
            File parent:父路径
            String child:子路径
        好处:
             父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
             父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
     */





    private static void demo2() {

        File f1=new File("D:\\BaiduNetdiskDownload\\从零基础到就业的机构视频\\02-java语言进阶(必学)\\day08_File类、递归\\code\\08_FileAndRecursion");
        System.out.println(f1);

        File f2=new File("b.txt");
        System.out.println(f2);
        System.out.println("------------------");

        File f3=new File("c:\\","a.txt");
        File f4=new File("d:\\","a.txt");
        System.out.println(f3);
        System.out.println(f4);
        System.out.println("------------------");

        File f5=new File("c:\\");
        File f6=new File(f5,"b.txt" );
        System.out.println(f6);


    }


    /*
          static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
          static char pathSeparatorChar 与系统有关的路径分隔符。

          static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
          static char separatorChar 与系统有关的默认名称分隔符。

          操作路径:路径不能写死了
          C:\develop\a\a.txt  windows
          C:/develop/a/a.txt  linux
          "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
       */
    private static void demo1() {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 windows:分号;  linux:冒号:

        String separator = File.separator;
        System.out.println(separator);// 文件名称分隔符 windows:反斜杠\  linux:正斜杠/
    }


}




