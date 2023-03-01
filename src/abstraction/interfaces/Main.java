package abstraction.interfaces;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Bird();
        Bird bird = new Bird();
        FlightEnabled flier = new Bird();
        Trackable tracked = new Bird();

        animal.move("fast");
        animal.makeNoise();
        bird.move("slow");
        bird.makeNoise();
//        flier.move();
//        tracked.move();

        flier.takeOff();
        flier.fly();
        flier.land();
        tracked.track();




    }
}
