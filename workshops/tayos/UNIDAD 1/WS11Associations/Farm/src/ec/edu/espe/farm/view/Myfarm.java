package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Egg;
import ec.edu.espe.farm.model.Poop;

/**
 *
 * @author SETayoRuiz
 */
public class Myfarm {

    public static void main(String[] args) {
        Egg egg = new Egg(1);
        Poop poop = new Poop();
        Chicken chicken = new Chicken();
        int id = 1;
        String name = "Lucy";
        String color = "white and brown";
        int age = 2;
        boolean isMolting = false;
        System.out.println("Author Sebastian Tayo");
        System.out.println("Egg ----->" + egg);
        System.out.println("Poop ----->" + poop);
        System.out.println("Chicken----->" + chicken);

        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("Chicken 2----->" + chicken2);

        id = 2;
        name = "Maruja";
        color = "black";
        age = 1;
        isMolting = true;
        chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("chicken 2 --->" + chicken2);
        System.out.println("Please enter id of the chicken");
    }
}