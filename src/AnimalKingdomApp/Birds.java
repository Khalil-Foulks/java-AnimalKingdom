package animalKingdomApp;

public class Birds extends Animal {
    public Birds(String name, int year) {
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
