package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;
import ec.edu.espe.farm.model.Chicken;
/**
 *
 * @author darling.cruz
 */
public class FarmSimulator {

    public static void main(String[] args) {
        System.out.println("WS10 Associations --> Darling Cruz <--");
        
        Egg egg = new Egg();
        Poop poop = new Poop();
        Chicken chicken = new Chicken();    //intantation
        
        System.out.println("the egg");
        System.out.println("-->"+ egg);
        
        System.out.println("the poop");
        System.out.println("-->"+ poop);     
        
        System.out.println("the chicken");
        System.out.println("-->"+ chicken);  
        
        System.out.println("Chicken activities");
        chicken.doSuff(0);
    }
}
   






