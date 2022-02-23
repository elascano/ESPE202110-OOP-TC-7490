/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.TemplateMethod.model;

/**
 *
 * @author Jose Guzman
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourlnCup();
        if(wantsCondiments()){addCondiments();}
    }
    void boilWater(){System.out.println("Boiling water");};
    abstract void brew();
    void pourlnCup(){System.out.println("Pouring into cup");};
    abstract void addCondiments();
    boolean wantsCondiments(){return true;};
}
