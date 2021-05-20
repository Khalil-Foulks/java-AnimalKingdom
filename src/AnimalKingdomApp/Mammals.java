package animalKingdomApp;

public class Mammals extends Animal {
    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public void move() {
        System.out.println("walking");
    }

    @Override
    public void breathe() {
        System.out.println("lungs");
    }

    @Override
    public void reproduce() {
        System.out.println("live births");
    }
}
