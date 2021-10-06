public class Exam4_4_5_5{
    public static void main(String[] args) {
        int i,j=0;
        int[] scores = new int[3]; 

        System.out.print("１人目の点数を入力してください > ");
        scores[0] = new java.util.Scanner(System.in).nextInt();
        System.out.print("２人目の点数を入力してください > ");
        scores[1] = new java.util.Scanner(System.in).nextInt();
        System.out.print("３人目の点数を入力してください > ");
        scores[2] = new java.util.Scanner(System.in).nextInt();

        for(i=0;i<scores.length;i++){
            j = Math.max(j,scores[i]);
        }

        System.out.print("最高得点は" + j + "点です");
    }
}