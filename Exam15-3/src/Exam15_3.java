import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exam15_3 {
    public static void main(String args[]){
        System.out.print("郵便番号を入力してください＞");
        Scanner a = new Scanner(System.in);
        String str = a.next();

        Pattern p = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        Matcher m = p.matcher(str);

        if (m.find()) {
            System.out.println("正しい形式です");
        }else{
            System.out.println("不正な形式です");
        }
    }
}
