import java.util.*;

public class PetCounter3 {
    private ArrayList pets;
    private Class[] petTypes;
    private HashMap h;
    private Iterator keys;
    
    public PetCounter3() {
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
    
    public PetCounter3(Class[] petTyps ) { 
        this.petTypes = petTyps;
        this.h = new HashMap();
        this.pets = new ArrayList();
    };
    
    public PetCounter3(PetCounter3 pc3) { this(pc3.petTypes); }
    
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
            h.put(petTypes[i].toString(), new Counter());
        }
    }
    
    public void printResult() throws Exception {
        count();
        
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
    
    private void count() throws Exception {
        generatePets();
        generateHashMap();
        for(int i = 0; i < pets.size(); i++) {
            Object o = pets.get(i);
            // Using isInstance to eliminate individual
            // instanceof expressions:
            for (int j = 0; j < petTypes.length; ++j)
                if (petTypes[j].isInstance(o)) {
                    String key = petTypes[j].toString();
                    ((Counter)h.get(key)).i++;
                }
        }
    }
}