/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essemaforo;
import java.util.Vector;
/**
 *
 * @author gabbo
 */
public class EsSemaforo {
    static CodaC buffer = new CodaC();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Semaforo pieno = new Semaforo(1);
        Semaforo vuoto = new Semaforo(0);
        ProduciDato prod = new ProduciDato(pieno,vuoto);
        ConsumaDato cons1 = new ConsumaDato(pieno,vuoto);
        ConsumaDato cons2 = new ConsumaDato(pieno,vuoto);
        ConsumaDato cons3 = new ConsumaDato(pieno,vuoto);
        Thread pro = new Thread(prod);
        Thread con1 = new Thread(cons1);
        Thread con2 = new Thread(cons1);
        Thread con3 = new Thread(cons1);
        pro.start();
        con1.start();
        con2.start();
        con3.start();
        System.out.println("Main: termine avvio thread");
    }
    
}
