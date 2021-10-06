public class Exam15_2 {
    public static void main(String[] name){
        System.out.print("ファイル名を入力してください＞");
        String s = new java.util.Scanner(System.in).nextLine();

        int s1 = s.lastIndexOf(".");

        if(s1 == -1){
            System.out.println("拡張子がありません");
        }else{
            System.out.println("拡張子は" + s.substring(s1 + 1) + "です");
        }
    }
}
