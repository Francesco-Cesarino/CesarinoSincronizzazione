/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CesarinoSincronizzazione;
/**
 *
 * @author Francesco
 */
public class Counter 
{
    private static int count = 0;

    public synchronized static void incDec(boolean b)
    {
        if(b)
        {
            incrementa();
        }
        else
        {
            decrementa();
        }
    }
    private static void incrementa() {
        count++;
    }

    private static void decrementa() {
        count--;
    }

    void stampaValoreFinale() {
        System.out.println("Il contatore è: " + count);
    }
}
