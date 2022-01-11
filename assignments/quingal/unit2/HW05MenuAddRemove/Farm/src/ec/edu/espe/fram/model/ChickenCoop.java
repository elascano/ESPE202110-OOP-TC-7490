
package ec.edu.espe.fram.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leandro Quinga 
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken> chickens;

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }
   
    
    public void add(Chicken chicken) {
        getChickens().add(chicken);
    }

    public void remove(int id) {
        getChickens().removeIf(chicken -> chicken.getId() == id);
    }

    public int countChickens() {
        return getChickens().size();
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + chickens + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void remove(Chicken chicken) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}