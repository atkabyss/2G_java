public class Exam5_6_1_4{
    public static int factorial(int n){
        int ans = 1;
        for (int i=1;i<=n;++i){
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String[] args){
        int a=0,b;
        System.out.println("整数を入力してください＞");
        a = new java.util.Scanner(System.in).nextInt();

        b = factorial(a);
        System.out.println(a + "! = " + b);
    }
}