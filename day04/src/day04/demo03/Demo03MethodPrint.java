package day04.demo03;

/*
* 题目要求：
* 定义一个方法，打印指定次数的内容*/
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(4);
    }

//    三要素：
//    返回值类型：void
//    方法名称：printCount
//    参数列表：因为要打印出指定次数的内容，所以参数就是要打印次数int


    public static void printCount(int num){

        for (int i = 1; i <= num; i++) {
            System.out.println("我是fw" + i);
        }
    }
}
