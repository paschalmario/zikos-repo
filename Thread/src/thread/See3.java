/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class See3 extends Thread{
    public void run(){
        int x = 0;
        while(x <= 1000){
            try {
                Thread.sleep(2000);
                System.out.println("Stanger things " + x);
                x++;
            } catch (InterruptedException ex) {
                Logger.getLogger(See3.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
