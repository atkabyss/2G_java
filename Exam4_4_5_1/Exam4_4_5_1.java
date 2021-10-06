public class Exam4_4_5_1{
    public static void main(String[] args) {
        int a,i;

        System.out.print(" ★ をいくつ出力しますか？ > ");
        a = new java.util.Scanner(System.in).nextInt();

        for(i = 0; i < a; i++){
            System.out.print(" ★ ");
        }
    }
}