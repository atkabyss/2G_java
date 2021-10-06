public class Exam15_1 {
    public static void main(String[] args){
        System.out.print("文字列を入力してください＞");
        String s = new java.util.Scanner(System.in).nextLine();

        String s1 = s.substring(0,1);
        String s2 = s.substring(1);

        String a1 = s1.toUpperCase();
        String a2 = s2.toLowerCase();

        System.out.println(a1 + a2);
    }
}
