package AnimalKingdomApp;

public class Mammals implements Animal {
    private int id;
    private String name;
    private int year;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String move() {
        return "walking";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }
}
