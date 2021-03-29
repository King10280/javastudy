package day04.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethon();//调用printMethon方法
    }

//    printMethon方法
    public static void printMethon() {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 20; i1 > 0; i1--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
