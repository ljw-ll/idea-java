package comAdvance.day13.demo1Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用传统的方式,遍历集合,对集合中的数据进行过滤
 */
public class ex1demo {
    public static void main(String[] args) {
        //创建一个List集合,存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String> list1=new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张"))
                list1.add(s);
        }

        List<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length()==3){
                list2.add(s);
            }
        }

        //遍历listB集合
        for (String s : list2) {
            System.out.println(s);
        }

    }
}
