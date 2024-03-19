/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Num2 extends Thread {
    public void run(){
        for(int b = 0;b <= 10; b++){
        try {
            Thread.sleep(3000);
            System.out.print("This sis the value of b = " + b);
        } catch (InterruptedException ex) {
            Logger.getLogger(Num2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        }
    }
}
