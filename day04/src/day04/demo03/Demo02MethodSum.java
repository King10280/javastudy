package day04.demo03;

/*
* 题目要求：
* 定义一个个方法，求出1~100的和*/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("1~100的和为" + getSum());
    }
    /*
    * 三要素：
    * 返回值类型：int
    * 方法名称：sum
    * 参数列表：无*/
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum +i;
        }
        return sum;
    }
}
