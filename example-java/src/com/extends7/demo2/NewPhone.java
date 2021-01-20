package com.extends7.demo2;

public class NewPhone extends Phone {

    public NewPhone(){
        super();    // 即使不写，系统会默认调用 父类的无参构造函数
        System.out.println("子类");
    }
    public NewPhone(int num){
        this();

    }

    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
