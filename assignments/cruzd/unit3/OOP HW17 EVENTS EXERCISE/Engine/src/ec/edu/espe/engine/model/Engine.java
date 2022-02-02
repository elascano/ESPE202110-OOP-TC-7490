/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.engine.model;

/**
 *
 * @author darling.cruz
 */
public class Engine {

    private int id;
    private String name;
    private String color;
    private String age;
    private String date;
    


    public Engine(int id, String name, String color, String age, String sex) {
        this.id = id;
        this.name = name;
        this.color= color;
        this.age = age;
        this.date = date;
        

    }

    public Engine() {
        
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getcolor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setcolor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public String age() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setage(String age) {
        this.age = age;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

   
    
}

    
    
    
    

