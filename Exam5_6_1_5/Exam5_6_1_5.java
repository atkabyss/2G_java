public class Exam5_6_1_5{
    public static int euclidGcd(int a,int b){
        if (b == 0) return a;
        else return euclidGcd(b, a % b);
    }
    public static void main(String[] args){
        int a=0,b=0,c;
        System.out.println("整数aを入力してください＞");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.println("整数bを入力してください＞");
        b = new java.util.Scanner(System.in).nextInt();

        c = euclidGcd(a,b);
        System.out.println(a + "と" + b + "の最大公約数は" + c + "です");
    }
}