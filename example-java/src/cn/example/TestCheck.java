package cn.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当主方法执行后，会自动自行被检测的所有方法(加了Check注解的方法)，判断方法是否有异常，记录到文件中
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {

        Calculator c=new Calculator();
        Class<Calculator> calculatorClass = Calculator.class;
        Method[] methods = calculatorClass.getMethods();

       int number=0;  // 记录异常次数
        BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //4.判断方法上是否有Check注解
             if(method.isAnnotationPresent(Check.class)){
                 try {
                     method.invoke(c);
                 } catch (Exception e) {
                     e.printStackTrace();
                     //记录在文件中
                     number++;
                     bw.write(method.getName()+"方法出现异常");
                     bw.newLine();
                     bw.write("异常的名称："+e.getCause().getClass().getName());
                     bw.newLine();
                     bw.write("异常的原因: "+e.getCause().getMessage());
                     bw.newLine();
                     bw.write(":"+e.getCause());
                     bw.newLine();

                     bw.write("----------------");
                     bw.newLine();

                 }
             }
        }

        bw.write("本次测试一共出现 "+number+" 次异常");

        bw.flush();
        bw.close();

    }
}
