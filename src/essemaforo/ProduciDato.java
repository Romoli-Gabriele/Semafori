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
public class ProduciDato implements Runnable {
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    @Override
    public void run() {
        for(int k=0; k<tanti; k++){
            vuoto.P();
            EsSemaforo.buffer.addE(k);
            System.out.println("Scrittore : dato scritto:"+k);
            pieno.V();
            try{Thread.sleep(attesa);}
            catch(Exception e){}
            System.out.println("Scrittore : termine scrittura dati");
        }
    }
    
}
