package day04.demo02;

public class Demp04MethodReturn {
    public static void main(String[] args) {
        System.out.println("有返回值的结果为" + sum1(10,20));
        sum2(10,22);
    }
//有返回值的方法
    public static int sum1(int a,int b){
        int result = a + b;
        return result;
    }
//无返回值的方法
    public static void sum2(int a,int b){
        int result = a + b;
        System.out.println("无返回值只能进行单独调用,其结果为:" + result);
        return;
    }
}
