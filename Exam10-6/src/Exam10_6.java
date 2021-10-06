public class Exam10_6 {
    public static void main(String[] args) {
        CalcTax mytax = new CalcTax(20000, 3);
        int a = mytax.subTotal();
        int b = mytax.tax();
        int c = mytax.total();
        System.out.println("小計　：" + a);
        System.out.println("消費税　：" + b);
        System.out.println("合計　：" + c);
    }
}
