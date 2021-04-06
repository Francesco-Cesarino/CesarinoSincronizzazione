/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CesarinoSincronizzazione;

import java.util.Random;

/**
 *
 * @author Francesco
 */
public class Main {

    private static Object run;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Counter c = new Counter();
        Thread thr1 = new Thread(new ThreadDecrementa());
        Thread thr2 = new Thread(new ThreadIncrementa());

        thr1.start();
        thr2.start();

        try 
        {
            thr1.join();
            thr2.join();
        } catch (InterruptedException ex){}
        
        c.stampaValoreFinale();
    }
    
}
