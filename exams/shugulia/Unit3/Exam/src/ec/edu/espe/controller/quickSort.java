
package ec.edu.espe.controller;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class quickSort {

    private int[] data;

    public quickSort() {
        quick(data, 0, 0);
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
