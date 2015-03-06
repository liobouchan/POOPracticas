import java.util.*;

public class PetCounter2 {
    private ArrayList pets;
    private Class[] petTypes;
    private HashMap h;
    private Iterator keys;
      
    public PetCounter2() {
       this.h = new HashMap();
       this.petTypes = new Class[]{
           Pet.class, 
           Dog.class, 
           Pug.class, 
           Cat.class, 
           Rodent.class, 
           Gerbil.class, 
           Hamster.class
       };
       this.pets = new ArrayList();
    }
    
    public PetCounter2(Class[] petTyps) { 
        this.h = new HashMap();
        this.petTypes = petTyps;
        this.pets = new ArrayList();
    };
    
    public PetCounter2(PetCounter2 pc2) { this(pc2.petTypes); }
    
    private void generatePets() throws Exception {
        try {
            for(int i = 0; i < 15; i++) {
            // Offset by one to eliminate Pet.class:
                int rnd = 1 + (int)(Math.random() * (petTypes.length - 1));
                pets.add(petTypes[rnd].newInstance());
            }
        } catch(InstantiationException e) {
            System.err.println("Cannot instantiate");
            throw e;
        } catch(IllegalAccessException e) {
            System.err.println("Cannot access");
            throw e;
        }
    }
    
    private void generateHashMap() {
        for(int i = 0; i < petTypes.length; i++){
            System.out.println(petTypes[i].toString());
            h.put(petTypes[i].toString(),new Counter());
        }
    }
    
    private void printResult() {
        for(int i = 0; i < pets.size(); i++){
            System.out.println(pets.get(i).getClass());
        }

        keys = h.keySet().iterator();
        
        while(keys.hasNext()) {
            String nm = (String)keys.next();
            Counter cnt = (Counter)h.get(nm);
            System.out.println(nm.substring(nm.lastIndexOf('.') + 1) + " quantity: " + cnt.i);
        }
    }
    
    public void countPets() throws Exception {
        generatePets();
        generateHashMap();
        for(int i = 0; i < pets.size(); i++) {
            Object o = pets.get(i);
            if(o instanceof Pet)
                ((Counter)h.get("class pets.Pet")).i++;
            if(o instanceof Dog)
                ((Counter)h.get("class pets.Dog")).i++;
            if(o instanceof Pug)
                ((Counter)h.get("class pets.Pug")).i++;
            if(o instanceof Cat)
                ((Counter)h.get("class pets.Cat")).i++;
            if(o instanceof Rodent)
                ((Counter)h.get("class pets.Rodent")).i++;
            if(o instanceof Gerbil)
                ((Counter)h.get("class pets.Gerbil")).i++;
            if(o instanceof Hamster)
                ((Counter)h.get("class pets.Hamster")).i++;
        }
        printResult();
    }
}
