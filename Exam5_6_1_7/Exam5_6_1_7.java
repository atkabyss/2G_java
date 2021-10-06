public class Exam5_6_1_7{
    public static float bmi(float a,float b){
        float bmi=0;
        a *= 0.01;
        bmi = b / (a*a);
        return bmi;
    }
    public static void main(String[] args){
        float a=0,b=0,c;
        while(a <= 0){
            System.out.println("身長を入力してください(cm)＞");
            a = new java.util.Scanner(System.in).nextInt();
        }
        while(b <= 0){
            System.out.println("体重を入力してください(kg)＞");
            b = new java.util.Scanner(System.in).nextInt();
        }
        System.out.println();
        c = bmi(a,b);
        
        if(c < 18.5){
            System.out.println("痩せ気味です");
        }else if(c >= 18.5 && c < 25){
            System.out.println("標準体型です");
        }else if(c >= 25 && c < 35){
            System.out.println("肥満です");
        }else{
            System.out.println("高度肥満です");
        }
    }
}