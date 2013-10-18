/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class histogramViewer<T> {

     private Histograma histogram;

    public    histogramViewer(Histograma histogram) {
        this.histogram = histogram;
    }

    public void show  (){
        for ( Object item : histogram.keySet()) {
            System.out.println("la llave es :"+item+"la cantidad de veces que se repite ess "+
                    histogram.get(item));
        }
    
    }

    
     
      
    
}
