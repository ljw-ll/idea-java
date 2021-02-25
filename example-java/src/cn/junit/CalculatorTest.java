package cn.junit;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator c=new Calculator();
        int ans = c.add(1, 2);
        System.out.println(ans);

        int ans1 = c.sub(1, 10);
        System.out.println(ans1);
    }
}
