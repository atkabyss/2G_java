public class CalcTax {
    int price;
    int num;

    public CalcTax(int v_price,int v_num){
        price = v_price;
        num = v_num;
    }

    public int subTotal(){
        int a = this.price * this.num;
        return a;
    }

    public int tax(){
        float b = (float) (price * 0.10 * num);
        int c = (int) b;
        return c;
    }

    public int total(){
        float b = (float) (price * 1.10 * num);
        int c = (int) b;
        return c;
    }
}
