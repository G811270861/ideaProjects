package project_02;

public class MethodTest {
    public static void main(String[] args) {
        getMax(10,8);
        int x = 20;
        int y = 80;
        getMax(x,y);
    }
    public static void getMax(int a, int b){
        if (a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
