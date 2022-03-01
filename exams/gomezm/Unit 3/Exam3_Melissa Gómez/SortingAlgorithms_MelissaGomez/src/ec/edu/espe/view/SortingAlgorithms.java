
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;
import ec.edu.espe.controller.SortingStrategy;

/**
 *
 * @author Melissa Gómez
 */
public class SortingAlgorithms {
    
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext();
        
        int data [] ={3,5,6,7};
        int sortedList[]= sortingContext.sort(data);
        
        int data2 [] ={3,5,6,7,5,7};
        sortingContext.sort(data2);
        
        int data3 [] ={3,5,6,7,5,7,10,12,34,45,12,23};
        sortingContext.sort(data3);
    }
    
}
