package advanced.ten;

public abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void nurse() {
        System.out.println(name + " is nursing its young.");
    }
}
