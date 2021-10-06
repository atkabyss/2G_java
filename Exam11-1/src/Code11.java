public class Code11 {
    public static void main(String[] args) {
        Dancer minear = new Dancer("ミネア") {
            @Override
            public void attack() {
            }
        };
        Matango m = new Matango();

        minear.dance();
        minear.attack(m);
        minear.run();
    }
}
