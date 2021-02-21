package comAdvance.day13.demo3MethodReference;
/*
    通过类名引用静态成员方法
    类已经存在,静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class ex3demo {
    public static void main(String[] args) {

      int number= method(-10,(num)->{
           return Math.abs(num);
        });
        System.out.println(number);
          /*
            使用方法引用优化Lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */

        int n1=method(-100,Math::abs);
        System.out.println(n1);
    }

    private  static int method(int number,Calcable c){
      return   c.calsAbs(number);
    }
}
