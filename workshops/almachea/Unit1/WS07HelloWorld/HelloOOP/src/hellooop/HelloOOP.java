/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellooop;

/**
 *
 * @author ASUS
 */
public class HelloOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World from Anderson Almache");
                
        int addend1;
        int addend2;
        int sum;

        addend1 = 10;
        addend2 = 20;

        sum = addend1 + addend2;

        System.out.println("**************");    
        System.out.println("the sum of " + addend1 + " + " + addend2 + " is -->" + sum);
        
        if (addend1 < 0) {
            System.out.println("This is a negattive addend");
        }      
    }  
}