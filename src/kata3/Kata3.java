
package kata3;

public class Kata3 {

  
    public static void main(String[] args) {
        String filename =args[0];
        HistogramaBuilder<String> build= new HistogramaBuilder<>();
        build.calculate(MailReader.readDomain(filename));
        histogramViewer <String> viewer=new histogramViewer<>;
        
        
               
    }
}
