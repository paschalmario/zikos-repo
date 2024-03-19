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
public class Novi1 extends Thread {
    public void run(){
         for(int i = 20; i >= 0; i--){
        try {
            Thread.sleep(3000);
                System.out.println("The number is " + i);
         } catch (InterruptedException ex) {
            Logger.getLogger(Novi1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
