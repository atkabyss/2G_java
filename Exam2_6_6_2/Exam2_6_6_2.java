import java.util.Scanner;

class Exam2_6_6_2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("月数を入力してください＞");
        String d = scan.next();

        int b,c;
        int a = Integer.parseInt(d);

        b = a / 12;
        c = a % 12;
  
        System.out.println(a + "か月は" + b + "年" + c + "か月です");
    }
}