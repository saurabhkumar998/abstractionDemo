package abstraction.abstactclasses;

import abstraction.abstactclasses.Animal;

public class Dog extends Animal {

    public Dog() {
        super("Default Type", "Unknown abstraction.abstactclasses.Dog", "Big");

    }
    public Dog(String type, String name, String size) {
        super(type, name, size);
    }

    @Override
    public void move(String speed) {
        System.out.println("abstraction.abstactclasses.Dog moves "+ speed);
    }

    @Override
    public void makeNoise() {
        System.out.println("abstraction.abstactclasses.Dog Barks!!!");
    }

    public void wagTail() {
        System.out.println("Dog is wagging its tail.");
    }
}
