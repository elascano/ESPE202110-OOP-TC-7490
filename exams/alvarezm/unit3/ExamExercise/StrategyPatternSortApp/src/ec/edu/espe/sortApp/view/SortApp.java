
package ec.edu.espe.sortApp.view;

import ec.edu.espe.sortApp.model.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */

public class SortApp {
    
    Scanner input;
    int[] data;
    int sortedList[];
    
      
    public void insertData(){
        input=new Scanner(System.in);
        System.out.print("How many number are you goin to order: ");
        int quantity;
        quantity=input.nextInt();
        data=new int[quantity];
        System.out.print("Insert the numbers: ");
        for(int f=0;f<data.length;f++) {
            data[f]=input.nextInt();
        }	
    }
	
    public void printData() {
        for(int f=0;f<data.length;f++) {
            System.out.println(data[f]);
        }
    }
    
     public static void main(String args[ ]) {
         
        SortApp sortapp = new SortApp();
        sortapp.insertData();
        System.out.println("The disorder numbers are:");
        sortapp.printData();
        
        SortingContext sc = new SortingContext();
        
        //sortedList[] = sc.sort(int[] data);
        
    }  
}


