public class Car implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        Vehicle.blowHorn();
        FourWheeler.super.print();
        System.out.println("I am a car");
    }
}
