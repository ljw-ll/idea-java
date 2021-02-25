package cn.test;

import cn.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /**
     * 初始化方法
     *  用于资源申请，所有测试方法在执行之前都会先执行该方法
      */
    @Before
    public void init(){
        System.out.println("Init...");
    }

    /**
     * 释放资源方法：
     *  在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }




    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        System.out.println("testAdd被执行");

        Calculator c=new Calculator();
        int ans = c.add(1, 2);
       // System.out.println(ans);
        Assert.assertEquals(3,ans);



    }

    @Test
    public void testSub(){
        System.out.println("testSub被执行");

        Calculator c=new Calculator();
            int ans1 = c.sub(1, 10);
            Assert.assertEquals(-9,ans1);
     //   System.out.println(ans1);

    }
}
