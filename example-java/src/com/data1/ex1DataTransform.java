package com.data1;



public class ex1DataTransform {
    public static void main(String[] args) {

      //  demo1();
        demo2();
    }



    /*
     * 数据类型 （数据范围从小到大）自动转换
     */
    private static void demo1(){
        byte i=1;
        int num1=2;
        int num2=num1+i;
        System.out.println(num2);
        // byte num3=num1+i;   报错 （不符合从小到大的条件）

        double num4=2.5F;
        System.out.println(num4);
    }

    /*
     * 强制转换
     */
    private  static void demo2(){
           long num1=100L;
        //   int num2=num1; 报错
           int num3=(int )num1;
        System.out.println(num3);

        char zifu1='A';
        char zifu2=(char)(zifu1+1);
        System.out.println(zifu2);

    }



}


