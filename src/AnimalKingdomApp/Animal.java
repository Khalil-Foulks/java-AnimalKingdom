package AnimalKingdomApp;

public abstract class Animal {
    protected static int maxId = 1;
    protected int id;
    protected String name;
    protected int year;

    //Constructor
    public Animal(String name, int year){
        id = maxId;
        maxId++;
        this.name = name;
        this.year = year;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();
}
