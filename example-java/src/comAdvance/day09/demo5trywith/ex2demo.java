package comAdvance.day09.demo5trywith;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK9新特性
    try的前边可以定义流对象
    在try后边的()中可以直接引入流对象的名称(变量名)
    在try代码执行完毕之后,流对象也可以释放掉,不用写finally
    格式:
        A a = new A();
        B b = new B();
        try(a,b){
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */
public class ex2demo {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("c:\\aaa.jpg");
        FileOutputStream fos=new FileOutputStream("d:\\aaa.jpg");

        try(fis;fos){

            byte[] bytes=new byte[1024];
            int len=0;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
