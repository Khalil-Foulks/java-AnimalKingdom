package AnimalKingdomApp;

public class Fish implements Animal {
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
        return "swimming";
    }

    @Override
    public String breathe() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
