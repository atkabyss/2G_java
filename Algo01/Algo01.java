public class Algo01{
    public static void main(String[] args) {
        int ans = -1;
        int p = 0;
        int x = 99;
        int y[] =  {18,5,9,2,20,30,15,27,11,22};

        while(ans == -1 && p < 10){
            if(y[p] == x){
                ans = p;
            }
            p += 1;
        }

        if(ans != -1){
            System.out.println(x + "は" + ans + "番目にありました");
        }else{
            System.out.println(x + "は見つかりませんでした");
        }
    }
}