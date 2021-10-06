public abstract class Character {
    String name;
    int hp;

    public Character(){
        this.name = name;
    }
    public Character(String name){
        this.name = name;
        this.hp = hp;
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }
}