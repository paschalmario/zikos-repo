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
public class Num extends Thread{
    public void run(){
    
    for(char p = 'a'; p <= 'z'; p++){
        
        try {
            Thread.sleep(5000);
            System.out.println("This value of the character " + p);
        } catch (InterruptedException ex) {
            Logger.getLogger(Num.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
}
