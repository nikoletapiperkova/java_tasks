package advanced.ten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion("Simba"));
        zoo.add(new Dolphin("Pesho"));
        zoo.add(new Penguin("Pingu"));


        for (Animal a : zoo) {
            a.makeSound();

            if (a instanceof Swimmable s) {
                s.swim();
            }

            if (a instanceof Climbable c) {
                c.climb();
            }

            if (a instanceof Mammal m) {
                m.nurse();
            }
        }
    }
}