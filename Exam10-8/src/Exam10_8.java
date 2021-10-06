public class Exam10_8 {
    public static void main(String[] args){
        Bus bus = new Bus();
        PatrolCar pc = new PatrolCar();
        bus.pickUp(3);
        bus.drive(5);
        bus.dropOff(1);
        pc.siren();
        pc.drive(10);
    }
}
