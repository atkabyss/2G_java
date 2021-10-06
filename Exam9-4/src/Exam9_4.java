public class Exam9_4 {
    public static void main(String[] args){
        System.out.println("何語で挨拶しますか？");
        System.out.println("1.日本語");
        System.out.println("2.英語");
        System.out.println("3.フランス語");
        int a = new java.util.Scanner(System.in).nextInt();
        switch (a){
            case 1:
                Greeting.jpn();
                break;
            case 2:
                Greeting.usa();
                break;
            case 3:
                Greeting.fra();
                break;
        }
    }
}
