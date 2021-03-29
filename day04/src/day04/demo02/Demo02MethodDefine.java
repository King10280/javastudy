package day04.demo02;
/*
* 方法就是若干语句的集合
* 方法-工厂
* 参数（原料）：进入方法的数据-输入
* 返回值（产物）：从方法中出来的数据-输出
*
* 定义方法的完整格式
* 修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
*   方法体
* return 返回值；
* }
*
* 修饰符：public static
* 返回值类型：
* 方法名称：
* 参数类型：
* 参数名称：
* 方法体：
* return：1.停止当前方法 2.将后面的返回值还给调用处
* 返回值：必须和方法名称前的返回值类型相同
*
* 三要素：
* 返回值类型：
* 方法名称：
* 参数：
*
* 例：定义一个两个int数字相加的方法
*
* 方法调用的三种格式：
* 1.单独调用：方法名称（参数）
* 2.打印调用：system.out.println(方法名称，参数);
* 3.赋值调用：数据类型 变量名称 = 方法名称（参数）；
*
* ps：返回值类型为void的方法只能进行单独调用
* */
public class Demo02MethodDefine {
    public static void main(String[] args) {
//        单独调用，只进行调用
        sum(10,1);
        System.out.println("=========");
//        打印调用
        System.out.println("打印调用输出的值为" + sum(10,19));
        System.out.println("=========");
//        赋值调用
        int num = sum(10,10);
        System.out.println("赋值调用输出的值为" + num);
    }

    public static int sum(int a,int b){
        int result = a + b;
        return result;
    }

}
