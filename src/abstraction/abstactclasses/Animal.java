package abstraction.abstactclasses;

public abstract class Animal {

    protected String type;
    private String name;
    private String size;

    public Animal(String type, String name, String size) {
        this.type = type;
        this.name = name;
        this.size = size;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();
}
