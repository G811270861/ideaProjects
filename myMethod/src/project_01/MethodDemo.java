package project_01;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            isEvenNumber();
        }
    }

    public static void isEvenNumber() {
        Random r = new Random();
        int number = r.nextInt(100);

        if (number % 2 == 0) {
            System.out.println("该数为偶数。" + number);
        } else {
            System.out.println("该数为奇数。" + number);
        }
    }
}
