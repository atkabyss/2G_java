class Exam3_5_5_7{
    public static void main(String args[]){
        int a,i;

        System.out.print("整数を入力してください > ");
        a = new java.util.Scanner(System.in).nextInt();

        if(a <= 1){
            System.out.println("２以上の整数を入力してください");
            return;
        }

        for(i = 2; i < a; i++) {
            if(a % i == 0) {
                System.out.println(a + "は素数ではありません");
                return;
            }else{
                System.out.println(a + "は素数です");
                return;
            }
        }
    }
}