package day04.demo02;
/*
* 有参数：方法需要数据才能完成任务
* 无参数：方法不需要任何数据就能独立完成
* */
public class Demo03MethodParam {
//    无参数：例打印输出66十次
    public static void main(String[] args) {
        printnum();
        System.out.println("=====================");
        System.out.println("有参数输出示例：" + sum(10,11));
    }

    public static void printnum(){
        for (int i = 0; i < 10; i++) {
            System.out.println("无参数输出示例" + i);
        }
    }

    public static int sum(int a,int b){
        int result = a + b;
        return result;
    }
}
