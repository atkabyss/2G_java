public class Algo04{
    public static void main (String[] args){
        int[] t={28,84,73,16,51,19};
        int n=t.length;
        int j;
        int work;
        int roop;
        System.out.println("ソート前のデータ");
        for(roop=0;roop<n;roop++){
            System.out.print(t[roop]+" ");
        }
        System.out.println();

        int i=0;

        while(i<n-1){
            j=i+1;
            while(j<n){
                if(t[i]>t[j]){
                    work=t[i];
                    t[i]=t[j];
                    t[j]=work;
                }
                j=j+1;
            }
            i=i+1;
        }
        System.out.println("ソート後のデータ");
        for(roop=0;roop<n;roop++){
            System.out.print(t[roop]+" ");
        }
        
    }
}