public class Exam4_4_5_2{
    public static void main(String[] args) {
        int a,b=0,i;

        System.out.print(" ★ をいくつ出力しますか？ > ");
        a = new java.util.Scanner(System.in).nextInt();

        for(i = 0; i < a; i++){
            System.out.print(" ★ ");
            b++;
            if(b % 5 == 0)System.out.println();
        }
    }
}