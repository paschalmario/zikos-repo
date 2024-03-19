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
public class Mythread extends Thread{

    public void run(){
      for(int i = 0; i <= 20; i++){
          try {
              Thread.sleep(5000);
              String formatedstring = String.format("The value is %d",i);
              System.out.println(formatedstring);
          } catch (InterruptedException ex) {
          }
     
      }  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Mythread t1 = new Mythread();
//        Mythread t2 = new Mythread();
//        t1.start();
//        t2.start();
//          Num t4 = new Num();
//          t4.start();
//          Novi t5 = new Novi();
//          t5.start();
//          Novi1 t6 = new Novi1();
//          t6.start();
            Num2 t7 = new Num2();
            t7.start();
//        
//        FiveHungryBabies baby1 = new FiveHungryBabies();
//        FiveHungryBabies baby2 = new FiveHungryBabies();
//        Thread t3 = new Thread(baby1,"victor");
//        Thread t4 = new Thread(baby2,"Akin");
//        t3.start();
//        t4.start();
          
    }
    
}
class FiveHungryBabies implements Runnable{
 
    public void run(){
        for(int k=0; k <= 30; k++){
            try{
             System.out.println("This is coming from runnable " + k);
             Thread.sleep(9000);
            }
            catch (InterruptedException ee){
                
            }  
        }
    }
}