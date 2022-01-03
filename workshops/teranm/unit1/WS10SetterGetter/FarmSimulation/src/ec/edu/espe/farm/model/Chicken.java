package ec.edu.espe.farm.model;

/**
 *
 * @author Melanie
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    public Chicken() {

    }

    public void doStuff(int forTime) {
        cluck();
        wander();
        eat();
    }

    private void cluck() {
        System.out.println("This chicken is clucking...");
    }

    private void wander() {
        System.out.println("This chicken is wandering...");
    }

    private void eat() {
        System.out.println("Thi chicken is eating...");
    }

    private void drink() {

    }

    private Poop poop() {
        return new Poop();
    }

    private Egg lanAnEgg() {
        return new Egg();
    }

    public Chicken(String name, String color, int age, boolean isMolting) {
        id = 0;
        name = "ch";
        color = "white";
        age = 0;
        isMolting = false;
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