package project_04;

/*
    方法注意事项：
    方法的通用格式：public static 返回值类型 方法名（参数）{
                            方法体;
                            return 数据;
                        }
     定义方法时，要做到两个明确：
            明确返回值类型：主要是明确方法操作完毕之后是否有数据返回，如果没有，写void；如果有，写对应的数据类型
            明确参数：主要是明确参数的类型和数量
     调用方法时：void类型的方法，直接调用；非void类型的方法，推荐用变量接受调用
     方法不能嵌套定义,但可以相互调用;
     void表示无返回值，可以省略return，也可以单独书写return，后面不加数据。
*/
public class MethodDemo {
    public static void main(String[] args) {
        MethodOne(20);
    }
    public static void MethodOne(int number){
        MethodTwo(10);
    }

    public static void MethodTwo(int number) {
        System.out.println("number:"+number);
    }
    public static void MethodThree(){
        return;
    }
}
