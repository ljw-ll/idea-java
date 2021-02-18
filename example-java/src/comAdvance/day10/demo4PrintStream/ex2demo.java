package comAdvance.day10.demo4PrintStream;


import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句,默认在控制台输出
    使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out)
          重新分配“标准”输出流。
 */
public class ex2demo {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("控制台输出");
        PrintStream ps=new PrintStream("example-java\\src\\comAdvance\\day10\\print.txt");
       System.setOut(ps);
        System.out.println("我在打印流的目的地输出");

        ps.close();

    }
}
