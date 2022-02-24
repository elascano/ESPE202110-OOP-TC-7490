package ec.edu.espe.exam.model;

import ec.edu.espe.exam.controller.BubbleSort;
import ec.edu.espe.exam.controller.InsertionSort;
import ec.edu.espe.exam.controller.QuickSort;
import ec.edu.espe.exam.controller.SortingStrategy;

/**
 *
 * @author ALEJANDRO DELACRUZ
 */
public class SortingContext {
    private SortingStrategy strategy;
    
    public int[] sort( int data[] ) {
        int size;
        size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n) {
        if( n >0 && n < 6 ){
        strategy = (SortingStrategy) new BubbleSort();}

        if( n >= 6 && n < 10 ){
        strategy = (SortingStrategy) new InsertionSort();}

        if( n >= 11 ){
        strategy = (SortingStrategy) new QuickSort();}

        return strategy;
    }
}
