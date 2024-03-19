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
public  abstract class Television {
    public abstract void ToOnOff();
    
    public void showFilm(){
        System.out.println("This my TV Shows all movies in the world");
    }
}

class Child extends Television{
    @Override
    public void ToOnOff(){
        System.out.println("This is use to switch on and off ht TV");
    }
}
