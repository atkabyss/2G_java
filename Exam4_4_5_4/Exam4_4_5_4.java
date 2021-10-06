public class Exam4_4_5_4{
    public static void main(String[] args) {
        int a,b,i,j;

        System.out.print("縦の長さを入力してください > ");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.print("横の長さを入力してください > ");
        b = new java.util.Scanner(System.in).nextInt();

        for(i = 0; i < a; i++){
            for(j = 0; j < b; j++){
                System.out.print(" ■ ");
            }
            System.out.println();
        }
    }
}