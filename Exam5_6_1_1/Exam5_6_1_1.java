public class Exam5_6_1_1{
    public static int compare(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String[] args){
        int x,y;
        System.out.println("整数１を入力してください＞");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.println("整数２を入力してください＞");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println(compare(x,y) + "のほうが大きいです");
    }
}