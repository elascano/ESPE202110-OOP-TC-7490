package ec.edu.espe.farm.view;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Andrea Tapia
 */
public class FarmSystem {

    public static void main(String[] args) {
        int a;
        Integer i = 58;//deprecated
        float b;
        Float f = 3.9F;
        double c;
        Double d = 12.4D;
        String s = "Andrea";

        System.out.println("--->Workshop 16 <--->Andrea Tapia--->");
        System.out.println("the int of the float ->" + f.intValue());
        b = 7.9F;
        System.out.println("float b ->" + b);
        System.out.println("float b ->" + (int) b); //casting

        a = 10;
        System.out.println("int a ->" + a);
        System.out.println("int a ->" + (float) a);
        System.out.println("int a ->" + a);

        System.out.println("String s + Integer i ->" + (s + i.toString()));

        System.out.println("int a + Integer i ->" + (a + i.toString()));
        System.out.println("int a + Integer i ->" + (a + i.intValue()));

        //Collection numbers;
        // Collection numbers = new Collection (); its not possible
        //ArrayList <int>numbers = new ArrayList <>();
    }
}
