import java.util.Scanner;

class Exam3_3_2_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("整数を入力してください＞");
        String a = scan.next();

        int b = Integer.parseInt(a);

        if(b % 2 == 0){
            System.out.println(b + "は偶数です。");
        }else{
            System.out.println(b + "は奇数です。");
        }
    }
}