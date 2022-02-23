package ec.edu.espe.coffeShop.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Javier Paucar
 */
public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("Steep the tea");
    }


    public void addCondiments() {
        System.out.println("Adding lemon");
    }


    @Override
    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }

    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return answer;
    }
}
