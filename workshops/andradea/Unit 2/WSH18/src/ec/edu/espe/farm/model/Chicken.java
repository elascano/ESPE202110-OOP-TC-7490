/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(boolean isMolting, int id, String breed, LocalDate born0n) {
        super(id, breed, born0n);
        
        this.isMolting = isMolting;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
}