package advanced.seven;

public class Truck implements Vehicle {
    private int wheels = 6;
    @Override
    public void honk(){
        System.out.println("Truck is honking");
    }
}
