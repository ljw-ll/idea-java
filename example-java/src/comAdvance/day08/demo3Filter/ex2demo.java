package comAdvance.day08.demo3Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/*
 过滤器优化
 */
public class ex2demo {
    public static void main(String[] args) {

        File f1=new File("File");
        getAllFile(f1);
    }

    public static void getAllFile(File dir){
        //传递过滤器对象 使用匿名内部类
     /* File[] files=dir.listFiles(new FileFilter() {
              @Override
              public boolean accept(File pathname) {
                  if(pathname.isDirectory())
                      return true;

                  return pathname.getName().endsWith(".txt");

              }
          });*/

 /*   File[] files=dir.listFiles(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            return new File(dir,name).isDirectory()||name.endsWith(".txt");
        }
    });*/

        //使用Lambda表达式优化匿名内部类(接口中只有一个抽象方法)
     File[] files=dir.listFiles((File pathname)->{
             if(pathname.isDirectory())
                 return true;
             return pathname.getName().endsWith(".txt");
     });

         /*File[] files = dir.listFiles((File d, String name)->{
            //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
            return new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java");
        });*/

        //File[] files = dir.listFiles((d,name)->new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java"));




        // 遍历文件
        for (File f : files) {
            if(f.isDirectory())
                getAllFile(f);
            else System.out.println(f);
        }
    }


}
