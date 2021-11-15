package project_05;

/*
    数据类型自动转换：数值型数据的转换：byte→short→int→long→float→double;
                    字符型转换为整型:char→int;
*/

public class MethodTest {
    public static void main(String[] args) {
        System.out.println(compare(10,20));

        System.out.println(compare((byte) 10,(byte) 20));

        System.out.println(compare((short) 10,(short) 20));

        System.out.println(compare(10L,20L));

        System.out.println(compare(10,(short)20));

    }
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a == b;
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(short a, short b){
        System.out.println("short");
        return a == b;
    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a == b;
    }
}
