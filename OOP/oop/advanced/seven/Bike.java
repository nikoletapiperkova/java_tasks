package advanced.seven;

public class Bike implements Vehicle{
    private int wheels = 2;
    @Override
    public void honk(){
        System.out.println("Bike is honking");
    }
}
