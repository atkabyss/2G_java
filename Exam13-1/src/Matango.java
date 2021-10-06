public class Matango {
    public void setSuffix(char suffix){
        this.suffix = suffix;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    private int hp;
    private final int level = 10;
    private char suffix;
    public void run(){
        System.out.println("おばけキノコ" + this.suffix + "は逃げ出した！");
    }
}
