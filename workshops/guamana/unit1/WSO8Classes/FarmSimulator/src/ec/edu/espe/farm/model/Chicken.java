package ec.edu.espe.farm.model;
/**
 *
 * @author Angel Guaman
 */
public class Chicken {
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    public void doStuff(){
        
    }
    
    public void cluck(){
        
    }
        
    public void wander(){
        
    }

    public void eat(){
        
    }

    private void drink(){
        
    }
    
    private Poop poop(){
        return new Poop();
    }
    
    private Egg ladyAnEgg(){
        return new Egg();
    }
}