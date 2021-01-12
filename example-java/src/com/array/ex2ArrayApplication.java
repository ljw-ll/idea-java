package com.array;

public class ex2ArrayApplication {
    public static void main(String[] args) {
        // getLength();
        // ArrayReverse();

        int[] array = {10, 20, 30, 40, 50};
        System.out.println(array); // 地址值

        printArray(array);
        System.out.println("-----------------------");
        array=ArrayReturn(1,2);
        printArray(array);
    }


    /*
     *如何获取数组的长度，格式：     数组名称.length
     *这将会得到一个int数字，代表数组的长度。
     *数组一旦创建，程序运行期间，长度不可改变。
     */
    public static void getLength() {

        int[] a = new int[10];
        System.out.println(a.length);
    }

    /*
     * 数组反转
     * 本来的样子：[1, 2, 3, 4]
     *之后的样子：[4, 3, 2, 1]
     */

    public static void ArrayReverse() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for (int u : a) {
            System.out.println(u);
        }
    }

    /*
     *数组可以作为方法的参数。
     *当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。
     */
    public static void printArray(int[] a) {
        for (int u : a) {
            System.out.println(u);
        }
    }

    /*
     * 任何数据类型都能作为方法的参数类型，或者返回值类型。
     *数组作为方法的参数，传递进去的其实是数组的地址值。
     *数组作为方法的返回值，返回的其实也是数组的地址值。
     */
    public static int[] ArrayReturn(int a,int b){

        int[] array=new int[]{a,b};
        return array;
    }


}
