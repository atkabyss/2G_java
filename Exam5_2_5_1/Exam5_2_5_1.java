class Exam5_2_5_1{
    public static void main(String args[]){
        System.out.println("名前を入力してください＞");
        String a = new java.util.Scanner(System.in).nextLine();
        System.out.println("メソッドを呼び出します");
        hello(a);
        System.out.println("メソッドの呼び出しが終わりました");
    }
    public static void hello(String name){
        System.out.println(name + "さん、こんにちわ");
    }
}