/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essemaforo;

/**
 *
 * @author gabbo
 */
public class ConsumaDato implements Runnable {
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    @Override
    public void run() {
       while (true){
       pieno.P();
       dato = EsSemaforo.buffer.rmE();
       System.out.println("Lettore: dato letto: "+dato);
       }
    }
    
}
