public class SpecialMember extends Member{
    String rank;

    @Override
    void display(){
        super.display();
        System.out.println("ランク　：" + rank);
    }
}