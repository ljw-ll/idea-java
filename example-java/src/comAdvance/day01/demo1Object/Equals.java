package comAdvance.day01.demo1Object;

public class Equals {
    public static void main(String[] args) {
        Person p1=new Person("小张",15);
        Person p2=new Person("小王",20);

        boolean b=p1.equals(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(b);
        System.out.println("--------------------");


        p1=p2;
        boolean b1=p1.equals(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(b1);
        System.out.println("--------------------");

        Person p3=new Person("小王",20);
        System.out.println(p3.equals(p2));
    }
}
