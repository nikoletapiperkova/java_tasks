package advanced.seven;

public class Car implements Vehicle {
    private int wheels = 4;
    @Override
    public void honk(){
        System.out.println("Car is honking");
    }
}
