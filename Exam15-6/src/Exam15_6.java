import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Exam15_6 {
    public static void main(String[] args)  {
        JapaneseDate date = JapaneseDate.now();
        String wareki = DateTimeFormatter.ofPattern( "y-MM-dd" ).format(date);
        System.out.println("Japanese Reiwa " + wareki );
    }
}