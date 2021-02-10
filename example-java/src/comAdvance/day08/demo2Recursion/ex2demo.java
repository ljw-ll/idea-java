package comAdvance.day08.demo2Recursion;

import java.io.File;

/*
    练习:
        递归打印多级目录

 */
public class ex2demo {
    public static void main(String[] args) {

        File f1=new File("File");
        getAllFile(f1);
        System.out.println("-------------");
        getAllFile1(f1);
    }

     /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
     */

    public static void getAllFile(File dir){
         File[] arr=dir.listFiles();
       /* for (File f : arr) {
            System.out.println(f);
        }*/
        for (File f : arr) {
            if(f.isDirectory()){
                getAllFile(f);
               // System.out.println(f);
            }
          else   System.out.println(f);
        }

    }


    /*练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
        只要.txt结尾的文件

     */

    public static void getAllFile1(File dir){
        File[] arr=dir.listFiles();
       /* for (File f : arr) {
            System.out.println(f);
        }*/
        for (File f : arr) {
            if(f.isDirectory()){
                getAllFile1(f);
                // System.out.println(f);
            }
            else  {
                  /*

                    只要.txt结尾的文件
                    1.把File对象f,转为字符串对象
                 */
                //String name = f.getName();
                //String path = f.getPath();
                //String s = f.toString();

                if(f.getName().toLowerCase().endsWith(".txt"))
                    System.out.println(f);
            }
        }

    }
}
