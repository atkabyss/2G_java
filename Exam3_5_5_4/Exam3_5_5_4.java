class Exam3_5_5_4{
    public static void main(String args[]){
        int a;

        System.out.print("整数を入力してください > ");
        a = new java.util.Scanner(System.in).nextInt();

        String s = String.valueOf(a);

        System.out.print(s.length() + "桁です");
    }
}