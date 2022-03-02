package ec.edu.espe.controller;

/**
 *
 * @author Leonel.M
 */
public class BubbleSort implements Strategy{

    @Override
    public int[] sort(int[] data) {
        int temp;
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        int[] sortedData = data;  
        System.out.print("Ordening[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "/" );
       
        }
        System.out.print("] ,  by Bubble Sort" + "\n");
        return sortedData;
    }
        
        
}
    