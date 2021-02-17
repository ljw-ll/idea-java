package comAdvance.day09.demo4Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class ex2demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("example-java\\src\\comAdvance\\day09\\c.txt");

        char[] cs={'a','b','c','d','e'};
        fw.write(cs);

        fw.write("\n");
        fw.write(cs,0,3);

        fw.write("\n");
        fw.write("黑马程序员",2,3);

        fw.close();
    }
}
