class Exam3_5_5_3{
    public static void main(String args[]){
        int a,b=1,i;

        System.out.print("整数を入力してください > ");
        a = new java.util.Scanner(System.in).nextInt();

        for(i=1; i<=a; i++) b = b * i;

        System.out.print(a + "! = " + b);
    }
}