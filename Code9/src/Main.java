public class Main{
    public static void main(String[] args){
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        h1.sword = s;
        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        System.out.println(h1.name + "のHP：" + h1.hp);
        System.out.println(h2.name + "のHP：" + h2.hp);

        //h1.attack();
    }
}