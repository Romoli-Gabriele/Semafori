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
public class CodaC {
    private  Vector V;

    public CodaC() {
        V = new Vector();
    }
     
    public void addE(int e){
    V.add(e);
    }
    public int rmE(){
    int r = (int) V.get(V.size());
    V.remove(r);
    return r;
    }
     
}
