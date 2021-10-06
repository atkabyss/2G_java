import java.util.Scanner;

class Exam2_6_6_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("整数１を入力してください＞");
        String c = scan.next();
        System.out.println("整数２を入力してください＞");
        String d = scan.next();

        int a = Integer.parseInt(c);
        int b = Integer.parseInt(d);
  
        System.out.println(Math.max(a, b) + "の方が大きいです");
    }
}