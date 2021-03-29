package day04.demo04;
/*
* 方法重载：多个方法名称一样，但参数列表不一样
* 方法重载的注意事项：
* 方法重载与三个因素有关：
* 1.参数的个数
* 2.参数的类型
* 3.参数类型的顺序不同
* 方法重载与其他因素无关：
* 1.参数的名称
* 2.方法的返回值类型*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println("三个参数的方法输出结果:" + sum(10,20,30));
        System.out.println("参数类型不同的输出结果:" + sum(10.0,20));
        System.out.println("参数类型顺序不同的输出结果：" + sum(10,20.0));


    }
//两个参数的方法
    public static int sum(int a,int b){
        int result = a + b;
        System.out.println("两个参数的方法输出结果：");
        return result;
    }
//三个参数的方法
    public static int sum(int a,int b,int c){
        int result = a + b +c;
        return result;
    }
//参数类型不同
    public static int sum(double a,int b){
        int result = (int)(a + b);
        return result;
    }
//参数类型的顺序不同
    public static int sum(int a,double b){
        int result = (int)(a + b);
        return result;
    }


}
