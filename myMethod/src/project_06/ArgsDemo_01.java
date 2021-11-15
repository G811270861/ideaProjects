package project_06;

/*
    对于基本数据类型的参数，形式参数的改变，不影响实际参数的值；
    形参：方法定义中的参数
         等同于变量定义格式，例如 int number；
    实参：方法调用中的参数
         等同于使用变量和常量，例如 100 number；
*/


public class ArgsDemo_01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前："+ number);
        change(number);
        System.out.println("调用change方法后："+ number);
    }
    public static void change(int number){
        number = 200;
    }
}
