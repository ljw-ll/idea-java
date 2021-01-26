package comAdvance.day01.demo1Object;

import java.util.Objects;

public class ObjectsEquals {
    public static void main(String[] args) {
        String s1="abc";
        String s2="aaa";
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3=null;
     //   System.out.println(s3.equals(s1));   //空指针异常

        boolean b= Objects.equals(s3,s1);
        System.out.println(b);

        String s4=null;
        System.out.println(Objects.equals(s3,s4));


        String s5=new String("abc");
        System.out.println(s5);
        System.out.println(Objects.equals(s1,s5));
    }


}
