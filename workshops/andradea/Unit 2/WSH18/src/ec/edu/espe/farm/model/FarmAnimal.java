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
public class FarmAnimal {
    private int id;
    private String breed;
    private LocalDate born0n;
    public int getAgeInMonths(){
        return 0;
    }
    public FarmAnimal(int id, String breed, LocalDate born0n) {
        this.id = id;
        this.breed = breed;
        this.born0n = born0n;
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
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the born0n
     */
    public Date getBorn0n() {
        return born0n;
    }

    /**
     * @param born0n the born0n to set
     */
    public void setBorn0n(LocalDate born0n) {
        this.born0n = born0n;
    }
    
}
