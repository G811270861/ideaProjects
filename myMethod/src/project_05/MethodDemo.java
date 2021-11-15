package project_05;

public class MethodDemo {
    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println(result);

        double result02 = sum(10.0,20.0);
        System.out.println(result02);

        int result03 = sum(10,20,30);
        System.out.println(result03);

    }
    public static int  sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static double sum(double a,double b){
        double sum = a + b;
        return sum;
    }
    public static int sum(int a,int b,int c){
        int sum =  a+ b+ c;
        return sum;
    }
}
