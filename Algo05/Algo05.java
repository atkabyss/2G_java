public class Algo05{
    public static void main(String[] args) {
        int a[] = {5,2,7,1,4};
        int k = 0;
        int n = 5;
        int m = 0;
        int w = 0;
        int i = 0;

        System.out.println("ソート前のデータ");
        for(i=0;i<=4;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        k = n - 1;
        while(k > 0){
            m = 0;
            while(m < k){
                if(a[m] > a[m+1]){
                    w = a[m+1];
                    a[m+1] = a[m];
                    a[m] = w;
                }else{
                    m = m + 1;
                }
            }
            k = k - 1;
        }
    System.out.println("ソート後のデータ");
    for(i=0;i<=4;i++){
        System.out.print(a[i] + " ");
    }
    }
}