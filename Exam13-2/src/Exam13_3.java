public class Exam13_3 {
    public static void main(String[] args) {
        Stationery s = new Stationery();
        s.setMaker("ZEBRA");
        s.setName("マッキー");
        s.setColor("黒");

        String a = s.getMaker();
        String b = s.getName();
        String c = s.getColor();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
