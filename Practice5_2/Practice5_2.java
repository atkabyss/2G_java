public class Practice5_2{
    public static void email(String title, String address,String text){
        System.out.println(address + "に以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
    public static void main(String[] args){
        String title = "java";
        String address = "k019c1068@it-neec.jp";
        String text = "Hello,world";
        email(title,address,text);
    }
}