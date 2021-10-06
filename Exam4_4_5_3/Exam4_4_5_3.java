public class Exam4_4_5_3{
    public static void main(String[] args) {
        int a,b=0,i;

        System.out.print("何点ですか？ > ");
        a = new java.util.Scanner(System.in).nextInt();

        if(a >= 1 && a <= 5){
            for(i = 0; i < a; i++){
                System.out.print(" ★ ");
            }
            for(i = 0; i < 5 - a; i++){
                System.out.print(" ☆ ");
            }
        }else{
            System.out.print("エラーです");
        }
    }
}