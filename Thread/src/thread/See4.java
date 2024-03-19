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
public class See4 extends Thread{
    public void run(){
        String[] plain = {"Valinna", "choclate", "Banana", "peanut", "caramel", "Strawberry"};
        for(int i = 0; i <= 5; i++){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(See4.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("The Flavour of this icecream is "+ plain[i]);
        }
    }
}
