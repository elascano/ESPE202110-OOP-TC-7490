package ec.edu.espe.practicalTestUnit3.control;

import java.util.ArrayList;
import static java.util.Collections.swap;

/**
 *
 * @author GUITARRA JHON, DEEE-ESPE
 */
public class BubbleSort implements SortingStrategy {

    public void bubblekSort(ArrayList<Integer> list) {
        int i, j;
        for (i = 0; i <= list.size() - 1; i++) {
            for (j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    swap(list, j, j + 1);
                }
            }
        }
    }

    @Override
    public int[] sort(int[] data) {

        return null;

    }
}
