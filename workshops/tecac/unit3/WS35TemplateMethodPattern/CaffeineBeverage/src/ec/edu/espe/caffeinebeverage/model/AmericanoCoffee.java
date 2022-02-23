package ec.edu.espe.caffeinebeverage.model;


import java.util.Scanner;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class AmericanoCoffee extends CaffeineBeverage{
    public void brew() {
        System.out.println("2. Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("4. Adding sugar and water");
    }
    
    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.startsWith("yes")) {
            return true;
        }
        else{
                return false;
                }
    }

    private String getUserInput() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        System.out.println("Would you like lemon with your coffee (yes/no)?");
        answer= keyboard.next();
        return answer;
    }
}
