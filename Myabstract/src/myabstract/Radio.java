/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author USER
 */
public abstract class Radio {
    public abstract void ToHear();
    
    public void Listen(){
        System.out.println("Thsi is my radio i use to listen to mmusic");
    }
}

class Child2 extends Radio{
    @Override
    public void ToHear(){
       System.out.println("I love to hear music");
    }
}
