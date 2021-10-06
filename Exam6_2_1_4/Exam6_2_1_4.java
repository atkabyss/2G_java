public class Exam6_2_1_4{
    public static void main(String[] args){
        int a;
        double b=0,c=0;

        System.out.println("変換方法を数字で入力してください");
        System.out.println("１　マイル→キロメートル");
        System.out.println("２　キロメートル→マイル");
        a = new java.util.Scanner(System.in).nextInt();
        if(a == 1){
            System.out.println("マイルを入力してください");
            b = new java.util.Scanner(System.in).nextInt();
            c = DistConverter.mileToKm(b);
            System.out.println(b + "マイルは" + c + "kmです");
        }else if(a == 2){
            System.out.println("キロメートルを入力してください");
            b = new java.util.Scanner(System.in).nextInt();
            c = DistConverter.KmTomile(b);
            System.out.println(b + "kmは" + c + "マイルです");
        }
    }
}