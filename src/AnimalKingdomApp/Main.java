package animalKingdomApp;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1804));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("Bigfoot", 2021));

        animalList.add(new Birds("Pigeon",1837));
        animalList.add(new Birds("Peacock",1821));
        animalList.add(new Birds("Toucan",1758));
        animalList.add(new Birds("Parrot",1824));
        animalList.add(new Birds("Swan",1758));


        animalList.add(new Fish("Salmon",1758));
        animalList.add(new Fish("Catfish",1817));
        animalList.add(new Fish("Perch",1758));

        System.out.println(animalList);

        // Mammals myMammal = new Mammals("Panda", 1869);
        // System.out.println(myMammal.toString());

    }
}