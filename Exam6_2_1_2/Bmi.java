public class Bmi{
    public static float bmi(float a,float b){
        float bmi=0;
        a *= 0.01;
        bmi = b / (a*a);
        return bmi;
    }
}