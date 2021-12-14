/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Angel Guaman
 */
public class ChickenCoop {
    private int id ;
    private ArrayList<Chicken> chickens;
    
    public void add(Chicken chicken){
        chickens.add(chicken);
        }
    public int countChickens(){
        return chickens.size();
   }

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
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
    
    
 
    
}