/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author usuario
 */
public class HistogramaBuilder<T> {

    public HashMap<T, Integer> histograma;

    public HistogramaBuilder() {
        histograma = new HashMap<>();
    }

    public void calculate(T[] data) {

        for (T item : data) {
            histograma.put(item, getCount(item) + 1);
        }
    }
     public void calculate(List<T> data) {
          
        for (T item : data) {
            histograma.put(item, getCount(item) + 1);
        }
    }
     

    public int getCount(T item) {
        if (histograma.containsKey(item)) {
            return histograma.get(item);
        }
        return 0;
    }

    public HashMap<T, Integer> getHistograma() {
        return histograma;
    }
}
