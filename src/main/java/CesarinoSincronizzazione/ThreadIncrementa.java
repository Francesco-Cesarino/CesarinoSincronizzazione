/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CesarinoSincronizzazione;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco
 */
public class ThreadIncrementa implements Runnable
{
    Counter contatore = new Counter();

    @Override
    public void run() {
        
        for(int i = 0; i < 10000; i++){
        
            contatore.incDec(true);
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadIncrementa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
