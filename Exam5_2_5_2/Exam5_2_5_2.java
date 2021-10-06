class Exam5_2_5_2{
    public static void main(String args[]){
        System.out.println("整数を入力してください＞");
        int a = new java.util.Scanner(System.in).nextInt();
        judge(a);
    }
    public static void judge(int a){
        if(a % 2 == 0){
            System.out.println("偶数です");
        }else{
            System.out.println("奇数です");
        }
    }
}