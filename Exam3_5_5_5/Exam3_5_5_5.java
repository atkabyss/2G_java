import java.util.Scanner;

class Exam3_5_5_5{
    public static void main(String args[]){
        System.out.print("文字列を入力してください > ");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        StringBuffer rts = new StringBuffer(str);
        String aaa = rts.reverse().toString();

        System.out.print(aaa);
    }
}