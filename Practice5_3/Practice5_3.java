public class Practice5_3{
    public static void email(String address,String text){
        System.out.println(address + "に以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }
    public static void main(String[] args){
        String address = "k019c1068@it-neec.jp";
        String text = "Hello,world";
        email(address,text);
    }
}