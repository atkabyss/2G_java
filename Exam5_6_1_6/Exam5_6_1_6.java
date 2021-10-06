public class Exam5_6_1_6{
    public static double average(int array[]){
        double a;
        double sum=0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        a = sum / array.length;
        return a;
    }
    public static void main(String[] args){
        int array[] = {3,2,1,4,8,5,6};
        double a;
        a = average(array);
        System.out.println("平均は" + a + "です");
    }
}