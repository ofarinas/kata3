/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import sun.java2d.pipe.BufferedBufImgOps;

/**
 *
 * @author usuario
 */
  public class MailReader {
    
    public static void readDomain(String Filenname){
        ArrayList<String> list= new ArrayList<>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(Filenname));
            while (true) {                
                String mail =reader .readLine();
                if(mail==null)break;
                list.add(mail.split("@")[1].toLowerCase());
            }
        } catch (Exception e) {
        }
            
}

    public MailReader() {
    }
}

