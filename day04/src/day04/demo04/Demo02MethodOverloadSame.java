package day04.demo04;

/*
* 题目要求：
* 比较两个数据是否相同
* 参数类型分别为两个byte，两个short，两个int，两个long
* 并在main方法中进行测试*/
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(compare(a,b));
        System.out.println(compare(10,11));
        System.out.println(compare((short)10,(short)10));
        System.out.println(compare(20L,20L));
    }

    public static boolean compare(byte a,byte b){
        System.out.println("两个byte参数的方法执行");
        boolean result;
        if (a == b){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    public static boolean compare(short a,short b){
        System.out.println("两个short参数的方法执行");
        return a == b;
    }

    public static boolean compare(int a,int b){
        System.out.println("两个int参数的方法执行");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean compare(long a,long b){
        System.out.println("两个long参数的方法执行");
        boolean result = a == b ? true :false;
        return result;
    }
}
