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
public class See5 extends Thread{
    public void run(){
        Float[] ruby = {12.23f, 12.43f, 13.43f, 12.43f};
        for(int v = 0;v <= 3; v++ ){
            try {
                Thread.sleep(3000);
                System.out.println("The float is " + ruby[v]);
            } catch (InterruptedException ex) {
                Logger.getLogger(See5.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
