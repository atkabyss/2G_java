import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exam15_4 {
    public static void main(String args[]){
        System.out.print("メールアドレスを入力してください＞");
        Scanner a = new Scanner(System.in);
        String str = a.next();

        Pattern p = Pattern.compile("^([a-zA-Z0-9])+([a-zA-Z0-9\\_-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$");
        Matcher m = p.matcher(str);

        if (m.find()) {
            System.out.println("正しい形式です");
        }else{
            System.out.println("不正な形式です");
        }
    }
}
