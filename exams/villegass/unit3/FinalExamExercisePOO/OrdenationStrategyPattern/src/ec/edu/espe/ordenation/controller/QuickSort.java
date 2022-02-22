package ec.edu.espe.Ordenation.controller;

import ec.edu.espe.ordenation.controller.SortingStrategy;

/**
 *
 * @author Salma Villegas DEEE-ESPE
 */

public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        
       quick(data, 0, 0);
       return null;
    }
    
        
    public void quick(int[] data, int a, int b){
        data = new int[data.length];
        int buf;
        int from = a;
        int to = b;
        int pivot = data[(from+to)/2];
        do{
            while(data[from] < pivot){
                from++;
            }
            while(data[to] > pivot){
                to--;
            }
            if(from <= to){
                buf = data[from];
                data[from] = data[to];
                data[to] = buf;
                from++; to--;
            }
        }while(from <= to);
        if(a < to){
            quick(data, a, to);
        }
        if(from < b){
            quick(data, from, b);
        }
        
    } 

}
