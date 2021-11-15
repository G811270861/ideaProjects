package project_02;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber(10);

        int number = 3;
        isEvenNumber(number);

        int num = 4;
        isEvenNumber(num);
    }
    public static void isEvenNumber(int number){
        if (number % 2 == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
