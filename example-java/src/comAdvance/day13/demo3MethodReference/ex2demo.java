package comAdvance.day13.demo3MethodReference;

import comAdvance.day12.demo2Lambda.MessageInterface;

/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的,成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */
public class ex2demo {
    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj=new MethodRerObject();
            obj.printUpperCaseString(s);
        });

        MethodRerObject obj=new MethodRerObject();
        printString(obj::printUpperCaseString);
    }

    private  static  void printString(Printable pr){
        pr.print("hellowolld");
    }
}
