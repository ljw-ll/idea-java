package comAdvance.day05.demo1Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex1Exception {
    public static void main(String[] args) /*throws ParseException*/ {

        //Checked异常:编译期异常,进行编译(写代码)java程序出现的问题
        SimpleDateFormat  fmt=new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = fmt.parse("2021-01-06");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");

        //RuntimeException:运行期异常,java程序运行过程中出现的问题
        int[] arr={1,2,3};
        System.out.println(arr[0]);

        try {
            //可能会出现异常的代码
            System.out.println(arr[3]);
        }
        catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);
        }
        System.out.println("后续代码");

        // Error  错误
        int[] arr1=new int[1005*1005];


       // 异常的产生过程解析(分析异常的怎么产生的,如何处理异常)
        int[] arr2 = {1,2,3};
        int e = getElement(arr2,3);
        System.out.println(e);

    }

    /*
        定义一个方法,获取数组指定索引处的元素
        参数:
            int[] arr
            int index
    */
    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }
}
