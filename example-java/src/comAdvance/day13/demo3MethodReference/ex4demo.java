package comAdvance.day13.demo3MethodReference;

/*
    类的构造器(构造方法)引用
 */
public class  ex4demo {
    public static void main(String[] args) {
     printName("迪丽热巴",(String name)->{
         return new Person(name);
        });

       /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
     printName("古力娜扎",Person::new);
    }
    //定义一个方法,参数传递姓名和PersonBuilder接口,方法中通过姓名创建Person对象
    public static   void printName(String name,PersonBuilder pb){
        Person p=pb.buildPerson(name);
        System.out.println(p.getName());
    }


}
