package advanced.ten;

public class Penguin extends Animal implements Swimmable {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: KVAK");
    }

    @Override
    public void swim() {
        System.out.println(name + " is diving into the ocean");
    }
}
