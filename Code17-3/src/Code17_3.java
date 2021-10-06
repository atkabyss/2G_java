import java.io.*;

public class Code17_3 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("./test/data.txt");
            fw.write("hello!");
            fw.close();
        } catch(Exception e) {
            System.out.println("何らかの例外が発生しました");
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
