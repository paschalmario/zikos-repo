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
public class See2 extends Thread {
    public void run() {
        int y = 0;
        while(y <= 20){
            try {
                Thread.sleep(2000);
                System.out.println("number = " + y);
                y++;
            } catch (InterruptedException ex) {
                Logger.getLogger(See2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
