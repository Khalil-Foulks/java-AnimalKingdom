package animalKingdomApp;
import java.util.*;

public class Main {
    public static List<Animal> animalList = new ArrayList<Animal>();

    public static void makeAnimals(){
        //Mammals
        Mammal panda = new Mammal("Panda", 1869);
        animalList.add(panda);
        Mammal zebra = new Mammal("Zebra", 1778);
        animalList.add(zebra);
        Mammal koala = new Mammal("Koala", 1816);
        animalList.add(koala);
        Mammal sloth = new Mammal("Sloth", 1804);
        animalList.add(sloth);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        animalList.add(armadillo);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        animalList.add(raccoon);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);
        animalList.add(bigfoot);
    
        //Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        animalList.add(pigeon);
        Bird peacock = new Bird("Peacock", 1821);
        animalList.add(peacock);
        Bird toucan = new Bird("Toucan", 1758);
        animalList.add(toucan);
        Bird parrot = new Bird("Parrot", 1824);
        animalList.add(parrot);
        Bird swan = new Bird("Swan", 1758);
        animalList.add(swan);
    
        //Fish
        Fish salmon = new Fish("Salmon", 1758);
        animalList.add(salmon);
        Fish catfish = new Fish("Catfish", 1817);
        animalList.add(catfish);
        Fish perch = new Fish("Perch", 1758);
        animalList.add(perch);
    }
    
    public static void sortAnimalsYear(){
        animalList.sort((item1, item2) -> item2.getYear() - item1.getYear());
        System.out.println(animalList);
    }

    public static void sortAnimalsAlphabetically(){
        animalList.sort((item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
        System.out.println(animalList);
    }

    public static void sortAnimalsByMove(){
        animalList.sort((item1, item2) -> item1.move().compareToIgnoreCase(item2.move()));
        System.out.println(animalList);
    }

    public static List<Animal> filteredList = new ArrayList<>();

    public static void sortAnimals(List<Animal> animals, CheckAnimal tester, boolean printBool){
        filteredList.clear();

        for (Animal eachAnimal: animals){//for every item in the Animal arrayList
            if (tester.test(eachAnimal)){//if the test parameter returns true
                if (printBool){//print if the printBool param is true
                    System.out.println(eachAnimal.getName() + " " + eachAnimal.reproduce() + " " + eachAnimal.move() + " " + eachAnimal.breathe() + " " + eachAnimal.getYear());
                }
            }
        }
    }

    public static void main(String[] args){
        makeAnimals();// construct the animals
    
        System.out.println("\n*** Sorted by Year ***");
        sortAnimalsYear();
    
        System.out.println("\n*** Sorted Alphabetically ***");
        sortAnimalsAlphabetically();
    
        System.out.println("\n*** Sorted by Movement ***");
        sortAnimalsByMove();
    
        System.out.println("\n*** Animals With Lungs ***");
        sortAnimals(animalList, each -> each.breathe() == "lungs", true);
    
        System.out.println("\n*** Animals With Lungs and From 1758 ***");
        sortAnimals(animalList, each -> (each.breathe() == "lungs" && each.getYear() == 1758), true);
    
        System.out.println("\n*** Animals With Eggs and Lungs ***");
        sortAnimals(animalList, each -> (each.reproduce() == "eggs" && each.breathe() == "lungs"), true);
    
        System.out.println("\n*** Animals from 1758  ***");
        animalList.sort((item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
        sortAnimals(animalList, each -> each.getYear() == 1758, true);
    
        System.out.println("\n*** Stretch Goal ***");
        sortAnimals(animalList, each -> each instanceof Mammal, true);
    }
}