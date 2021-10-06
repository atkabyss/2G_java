public class Algo06 {
    public static void main (String[] args){
        int[][] seiseki={{80,100,70},{65,80,100},{45,30,80},{100,70,80},{70,90,80}};
        int n=seiseki.length;
        int k=seiseki[0].length;

        int[] gokei=new int[n];
        int[] jyuni=new int[n];
        int[] kamoku_gokei=new int[k];

        int i;
        int j;
        int cnt;

        for(i=0;i<k;i++){
            kamoku_gokei[i]=0;
        }

        for(i=0;i<n;i++){
            gokei[i]=0;
            for(j=0;j<k;j++){
                gokei[i]=gokei[i]+seiseki[i][j];
                kamoku_gokei[j]=kamoku_gokei[j]+seiseki[i][j];
            }
        }

        for(i=0;i<n;i++){
            cnt=1;
            for(j=0;j<n;j++){
                if(gokei[i]<gokei[j]){
                    cnt++;
                }
            }
            jyuni[i]=cnt;
        }
        System.out.println("科目1\t科目2\t科目3\t合計\t順位");
        System.out.println("-------------------------------------");
        for(i=0;i<n;i++){
            for(j=0;j<k;j++){
                System.out.print(seiseki[i][j]+"\t");
            }
            System.out.print(gokei[i]+"\t");
            System.out.println(jyuni[i]);
        }
        System.out.println("-------------------------------------");
        for(j=0;j<k;j++){
            System.out.print(kamoku_gokei[j]+"\t");
        }
    }
}