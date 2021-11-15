package project_03;

public class MethodTest {
    public static void main(String[] args) {
        int result = getMax(15,60);
        System.out.println(result);

        System.out.println(getMax(50,99));

        System.out.println(sum(10,50,100));

    }
    public static int getMax(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public static String sum(int a,int b,int c){
        int sum = a+b+c;
        return "它们的总和为:"+sum;
    }
}
