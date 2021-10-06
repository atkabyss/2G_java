import java.util.*;

public class Exam5_6_1_2{
    static boolean IsPrime(int n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n%2 == 0) return false;
        double sqrtNum = Math.sqrt(n);
        for (int i=3; i<=sqrtNum; i+=2) {
            if (n%i == 0) {return false;}
        }
        return true;
    }
    public static void main(String[] args){
        int x=0;
        boolean y;
        while(x <= 1){
            System.out.println("整数を入力してください＞");
            x = new java.util.Scanner(System.in).nextInt();
        }

        if(IsPrime(x)){
            System.out.println(x + "は素数です");
        }else{
            System.out.println(x + "は素数ではありません");
        }
    }
}