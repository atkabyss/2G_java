import java.util.Scanner;

class Exam3_3_3_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("文字列１を入力してください＞");
        String a = scan.next();
        System.out.println("文字列２を入力してください＞");
        String b = scan.next();
  
        if(a.equals(b)){
            System.out.println("同じ文字列が入力されました");
        }else{
            System.out.println("異なる文字列が入力されました");
        }
    }
}