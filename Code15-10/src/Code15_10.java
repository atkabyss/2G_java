public class Code15_10 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2147483647; i++) {
        }
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間は..." + (end-start) + "ミリ秒でした");
    }
}
