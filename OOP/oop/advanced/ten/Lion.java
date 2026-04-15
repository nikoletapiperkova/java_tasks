package advanced.ten;

public class Lion extends Mammal implements Climbable {
    public Lion(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " says: ROAR!");
    }

    @Override
    public void climb() {
        System.out.println(name + " is climbing a tree.");
    }
}