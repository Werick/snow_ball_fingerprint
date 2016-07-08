/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.faces;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author werick
 * @version 1.0
 * @date 08-07-2016
 */
public class SnowBall {

   /**
     * @param args the command line arguments
     */
    
    public static final Logger logger = Logger.getLogger(SnowBall.class.getName());  
    public static FileHandler fh;
    public static void main(String[] args) {
        
        // TODO code application logic here
        try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("Snowball FingerPrintProjectLog.log",true);  //create file if does not exist
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            logger.info("Snowball Fingerpint Application logs...");  

            } catch (SecurityException e) {  
                e.printStackTrace();  
                //Logger.getLogger(FacesFingerPrintProject.class.getName()).log(Level.SEVERE, "ERROR", e);
                logger.log(Level.SEVERE, "ERROR", e);
                //logger.w
            } catch (IOException e) {  
                e.printStackTrace();
                logger.log(Level.SEVERE, "ERROR", e);
            }  

            logger.info("Application Starting..."); 
            
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {                
//               LoginDialog.createAndShowGUI();
//            }
//        });
    }
}
