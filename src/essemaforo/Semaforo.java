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
public class Semaforo {
    int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }
    
synchronized public void P (){
while(valore == 0){
try {wait();}
catch(InterruptedException e){}
}
}
synchronized public void V (){
valore++;
notify();
}
}
