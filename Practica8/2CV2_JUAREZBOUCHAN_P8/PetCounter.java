import java.util.*;
class Pet {}
class Dog extends Pet {}
class Pug extends Dog {}
class Cat extends Pet {}
class Rodent extends Pet {}
class Gerbil extends Rodent {}
class Hamster extends Rodent {}
class Counter { int i; }

public class PetCounter {
    private String[] typenames;
    private ArrayList pets;
    private HashMap h;

    public PetCounter() {
        this.typenames = new String[]{
            "Pet", 
            "Dog", 
            "Pug", 
            "Cat", 
            "Rodent", 
            "Gerbil", 
            "Hamster"
        };
        this.pets = new ArrayList();
        this.h = new HashMap();
    }
    
    public PetCounter(String [] typenames) {
       this.typenames = typenames;
    }
    
    public PetCounter(PetCounter pc) { this(pc.typenames); }
    
    private void generatePets() throws Exception {
        try {
            Class[] petTypes = {
                Class.forName("pets.Dog"),
                Class.forName("pets.Pug"),
                Class.forName("pets.Cat"),
                Class.forName("pets.Rodent"),
                Class.forName("pets.Gerbil"),
                Class.forName("pets.Hamster"),};

            for (int i = 0; i < 15; i++) {
                pets.add(petTypes[(int) (Math.random() * petTypes.length)].newInstance());
            }
        } catch (InstantiationException e) {
            System.err.println("Cannot instantiate");
            throw e;
        } catch (IllegalAccessException e) {
            System.err.println("Cannot access");
            throw e;
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot find class");
            throw e;
        }

    }
    
    private void generateHashMap() {
        for(int i = 0; i < typenames.length; i++){
            h.put(typenames[i], new Counter());
        }
    }
    
    private void printResult() {
        for(int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).getClass());
        } 
            
        for(int i = 0; i < typenames.length; i++){
            System.out.println( typenames[i] + " quantity: " + ((Counter)h.get(typenames[i])).i);
        }
    }
    
    // Exceptions thrown out to console:
    public void countPets() throws Exception {
        generatePets();
        generateHashMap();
        for(int i = 0; i < pets.size(); i++) {
            Object o = pets.get(i);
            if(o instanceof Pet) ((Counter)h.get("Pet")).i++;
            if(o instanceof Dog) ((Counter)h.get("Dog")).i++;
            if(o instanceof Pug) ((Counter)h.get("Pug")).i++;
            if(o instanceof Cat) ((Counter)h.get("Cat")).i++;
            if(o instanceof Rodent) ((Counter)h.get("Rodent")).i++;
            if(o instanceof Gerbil) ((Counter)h.get("Gerbil")).i++;
            if(o instanceof Hamster) ((Counter)h.get("Hamster")).i++;
        }
        printResult();
    }
}
