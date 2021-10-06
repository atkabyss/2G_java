public class Exam6_2_1_1{
    public static void main(String[] args){
        int x,y;
        System.out.println("整数１を入力してください＞");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.println("整数２を入力してください＞");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println(Compare.compare(x,y) + "のほうが大きいです");
    }
}