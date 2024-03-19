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
public class Baby extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Baby key = new Baby();
//        See1 key2 = new See1();
////      key.start();
//        key2.start();
//          See2 key3 = new See2();
//          key3.start();
//          See3 key4 = new See3();
//          key4.start();
//          See4 key5 = new See4();
//          key5.start();

            See5 key6 = new See5();
            key6.start();
    }
    public void run(){
        for (int i = 0;i <= 10; i++){
            try {
                Thread.sleep(3000);
                System.out.println("The value of i is " + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Baby.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
