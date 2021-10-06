import java.util.Scanner;

class Exam3_4_3_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("月を入力してください＞");
        String d = scan.next();

        int a = Integer.parseInt(d);

        if(a >= 3 && a <= 5){
            System.out.println("春");
        }else if(a >= 6 && a <= 8){
            System.out.println("夏");
        }else if(a >= 9 && a <= 11){
            System.out.println("秋");
        }else if(a == 12 || a == 1 || a == 2 ){
            System.out.println("冬");
        }else{
            System.out.println("そのような月はありません");
        }
    }
}