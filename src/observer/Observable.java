/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author elmr
 */
public class Observable {
    private ArrayList<Observer> monitores;
    
    public Observable(){
        this.monitores = new ArrayList<>();
    }
    
    public void setObserver(Observer or){
        this.monitores.add(or);
    }
    
    public void removeObserver(Observer or){
        this.monitores.remove(or);
    }
    
    public void notifyObserver(){
        for (Observer ob : this.monitores){
            ob.update(this);
        }
    }
}
