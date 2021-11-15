package project_01;

import java.util.Random;

public class MethodTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            getMax();
        }
    }

    public static void getMax() {
        Random r = new Random();
        int number1 = r.nextInt(100);
        int number2 = r.nextInt(100);
        System.out.println("number1:number2  "+number1+":"+number2);
        int max = number1 > number2 ? number1 : number2;
        System.out.println("max:"+max);
    }
}
