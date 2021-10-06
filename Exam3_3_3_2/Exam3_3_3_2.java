import java.util.Scanner;

class Exam3_3_3_2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("IDを入力してください＞");
        String a = scan.next();
        System.out.println("パスワードを入力してください＞");
        String b = scan.next();
  
        if(a.equals("java") && b.equals("0611")){
            System.out.println("ログインしました");
        }else{
            System.out.println("ログインできませんでした");
        }
    }
}