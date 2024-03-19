/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner man1 = new Scanner(System.in);
        System.out.println("What is your name");
        String name = man1.nextLine();
        System.out.println("Hello " + name);
        
    }
   
}