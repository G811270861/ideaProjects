package project_06;
/*
        对于引用类型的参数，形式参数的改变，影响实际参数的值
*/

public class ArgsDemo_02 {
    public static void main(String[] args) {
        int[] arr = {11,12,13};
        System.out.println("调用change方法前为："+arr[1]);
        change(arr);
        System.out.println("调用change方法后为："+arr[1]);
    }
    public static void change(int[] arr){

        arr[1] =  100;
    }
}
