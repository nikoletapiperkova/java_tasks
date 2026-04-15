package advanced.ten;

public class Dolphin extends Mammal implements Swimmable {
    public Dolphin(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + " says: YEE");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the ocean");
    }
}