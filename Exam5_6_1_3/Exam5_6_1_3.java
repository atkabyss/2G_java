public class Exam5_6_1_3{
    public static void sortArray(int data[]){
        
        for(int i=0; i < data.length-1; i++) {
            for(int j=0; j < data.length-i-1; j++) {
            	if(data[j] > data[j+1]) {
            		int asc = data[j];
            		data[j] = data[j+1];
            		data[j+1] = asc;
            	}
            }
        }
    }
    public static void main(String[] args){
        int x=0,z=1;
        int[] y = new int[5];
        while(x <= 4){
            System.out.println("整数" + z + "を入力してください＞");
            y[x] = new java.util.Scanner(System.in).nextInt();
            x++;
            z++;
        }

        System.out.println("ソート前");
        for(int i = 0; i < y.length; i++) {
        	System.out.print(y[i]+" ");
        }

        System.out.println();
        sortArray(y);

        System.out.println("ソート後");
        for(int i = 0; i < y.length; i++) {
        	System.out.print(y[i]+" ");
        }
    }
}