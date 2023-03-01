package abstraction.interfaces;

public class Bird extends Animal implements FlightEnabled, Trackable{
    @Override
    public void move(String speed) {
        System.out.println("Bird is moving " + speed);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird is chirping");
    }

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off.");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " is landing.");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying.");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinate recorded.");
    }
}
