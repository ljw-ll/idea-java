package com.api5;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Random;

public class ex4demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        arr=creat1();

        ArrayList<Person> arr3;
        arr3=creat2();

    }

    public static  ArrayList<Integer> creat1(){
        ArrayList<Integer> arr1=new ArrayList<>();
        Random r=new Random();
        int num;
        for(int i=1;i<=20;i++){
            num=r.nextInt(1000)+1;
            arr1.add(num);
        }
        System.out.println(arr1);
        return arr1;

    }

    public static ArrayList<Person> creat2(){
         ArrayList<Person> arr2=new ArrayList<>();

         Person one=new Person("李名",25);
         Person two=new Person("张红",23);
         Person three=new Person("王伟",15);

         arr2.add(one);
         arr2.add(two);
         arr2.add(three);

         //遍历
        for (int i = 0; i < arr2.size(); i++) {
            Person x=arr2.get(i);
            System.out.println("姓名："+x.getName()+" "+"年龄"+x.getAge());
        }
         return arr2;
    }
}
