public class Algo02{
    public static void main(String[] args) {
        int ans = -1;
        int a = 0;
        int p = 0;
        int x = 99;
        int y[] =  {18,5,9,2,20,30,15,27,11,22};
        int z[] = new int[11];

        while(a <= 9){
            z[a] = y[p];
            a += 1;
            p += 1;
        }

        z[a] = x;

        p=0;

        while(z[p] != x){
            p += 1;
        }

        if(p < 10){
            ans = p;
        }else{
            ans = -1;
        }

        if(ans != -1){
            System.out.println(x + "は" + ans + "番目にありました");
        }else{
            System.out.println(x + "は見つかりませんでした");
        }
    }
}