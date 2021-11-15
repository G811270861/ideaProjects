package project_03;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(100));

        boolean flag = isEvenNumber(11);
        System.out.println(flag);

        int number = 12;
        System.out.println(isEvenNumber(number));
    }
    public static boolean isEvenNumber(int number){
        if (number %2 ==0){
            return true;
        }else {
            return false;
        }
    }
}
