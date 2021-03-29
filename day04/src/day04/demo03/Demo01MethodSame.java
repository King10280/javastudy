package day04.demo03;
/*
* 题目要求：
* 定义一个方法，来判断两个数是否相同
* */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println("33和22比较的结果" + compare(33,22));
        System.out.println("33和33比较的结果" + compare(33,33));

    }
    /*
    * 三要素：
    * 返回值类型：boolean
    * 方法名称：compare
    * 参数列表：int a,int b
    * */
    public static boolean compare(int a,int b){
        boolean result;
        if (a == b){
            result = true;
        }else{
            result = false;
        }

        return result;
    }
}
