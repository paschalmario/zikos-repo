package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Novi extends Thread {
    public void run(){
    for(char x = 'z'; x >= 'a'; x--){
        
        try {
            Thread.sleep(5000);
            System.out.println("The output is "+ x);
        } catch (InterruptedException ex) {
            Logger.getLogger(Novi.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
}
