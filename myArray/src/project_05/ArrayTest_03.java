package project_05;

public class ArrayTest_03 {
    public static void main(String[] args){
        int[] arr = {98, 45, 12, 73, 60};

        for(int i = 1; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for (int x=0;x<arr.length;x++){
                    System.out.print(arr[x]+",");
                }
                System.out.println();

            }
            System.out.println("------");
        }
    }
}
