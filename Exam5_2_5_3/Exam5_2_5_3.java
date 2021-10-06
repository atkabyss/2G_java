class Exam5_2_5_3{
    public static void main(String args[]){
        System.out.println("税抜き価格を入力してください＞");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("税率を入力してください＞");
        double b = new java.util.Scanner(System.in).nextDouble();
        math(a,b);
    }
    public static void math(int a,Double b){
        double c = a + a * b;
        System.out.println("税込み価格は" + (int)c + "円です");
    }
}