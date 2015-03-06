class PetsMain {
    public static void main(String[] args) {
        System.out.println("PetCounter:");
        PetCounter petc = new PetCounter();
        try {
            petc.countPets();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println();
        
        System.out.println("PetCounter2:");
        PetCounter2 petc2 = new PetCounter2();
        
        try {
            petc2.countPets();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println();
        
        System.out.println("PetCounter3:");
        PetCounter3 petc3 = new PetCounter3();
        
        try {
            petc3.printResult();
        }
        catch (Exception e) {
            e.printStackTrace();
        }   
        
    }
        
}
    
