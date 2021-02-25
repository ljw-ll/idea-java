package cn.annotation;

import java.util.Date;

@SuppressWarnings("all")
public class ex1demo {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        // 有缺陷
    }

 //   @MyAnno
    public void show() {
        // 替代show1方法
    }


        public void demo () {
            show1();

            Date date = new Date();

        }

}
