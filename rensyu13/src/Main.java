public class Main {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Wand r = new Wand();
        Hero h = new Hero();
        w.setHp(100);
        w.setMp(500);
        w.setName("wiz");
        w.setWand(r);
        r.setName("tue");
        r.setPower(50);
        h.setHp(50);
        h.setName("her");

        System.out.println("魔法使いのHP　：" + w.getHp());
        System.out.println("魔法使いのMP　：" + w.getMp());
        System.out.println("魔法使いの名前：" + w.getName());
        System.out.println("杖の名前　　　：" + r.getName());
        System.out.println("杖の魔力　　　：" + r.getPower());
        w.heal(h);

    }
}