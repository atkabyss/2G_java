class Exam3_5_5_6{
    public static void main(String args[]){
        int a,b=0,c=0,d=0,e=0;

        while(true){
            System.out.print("１～３の整数を入力してください（０で終了）> ");
            a = new java.util.Scanner(System.in).nextInt();

            switch(a){
                case 0:
                    break;
                case 1:
                    b++;
                    break;
                case 2:
                    c++;
                    break;
                case 3:
                    d++;
                    break;
                default:
                    e++;
                    break;
            }

            if(a==0)break;
        }

        System.out.println("１が入力された回数            " + b + "回");
        System.out.println("２が入力された回数            " + c + "回");
        System.out.println("３が入力された回数            " + d + "回");
        System.out.println("その他の数値が入力された回数  " + e + "回");
    }
}