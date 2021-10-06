public class Algo03{
    public static void main(String[] args) {
        int t[] = {1,3,5,7,9,11,13,15,17,19};
        int high = t.length-1;
        int low = 0;
        int s = -1;
        int x = 0;
        int m = 0;

        System.out.println("探索する値を入力してください＞");
        x = new java.util.Scanner(System.in).nextInt();

        while(s == -1 && low <= high){
            m = (low + high)/2;
            if(x == t[m]){
                s = m;
            }else if(x < t[m]){
                high = m-1;
            }else{
                low = m+1;
            }
        }

        if(s == -1){
            System.out.println(x + "は見つかりませんでした");
        }else{
            System.out.println(x + "は" + s + "番目にありました");
        }
    }
}