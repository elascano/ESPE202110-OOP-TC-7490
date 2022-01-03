/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Joel
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }
    
        
    public void doStuff(int forTime) {
        cluck();
        wander();
        eat();
    }

    private void cluck() {
        System.out.println("This chicken is clucking ...");
    }

    private void wander() {
        System.out.println("This chicken is wandering ...");
    }

    private void eat() {
        System.out.println("This chicken is eating ...");
    }

    private void drink() {
        System.out.println("This chicken is drinking ...");
    }

    private Poop poop() {
        return new Poop();
    }

    private Egg layAnEgg() {
        return new Egg(1);
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

    public Chicken(int id, String name, String color, int age, boolean molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }

     public Chicken() {
        id=0;
        name="ch";
        color="white";
        age=0;
        molting=true;
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
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

}