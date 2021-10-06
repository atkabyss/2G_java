public class Code13_1 {
    public static void main(String[] args){
        Hero h = new Hero();
        h.setName("ミナト") ;
        h.setHp(100);

        Matango m1 = new Matango();
        m1.setHp(50);
        m1.setSuffix('A');

        Matango m2 = new Matango();
        m2.setHp(48);
        m2.setSuffix('B');

        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}
