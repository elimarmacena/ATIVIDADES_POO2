/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author 20161BSI0314
 */
public class ControladorTelefone {
    private static ControladorTelefone instancia;
    private long  phone = 30000000;
    
    private ControladorTelefone(){}
    
    public synchronized static ControladorTelefone getInstance(){
        if(instancia == null){
           instancia = new ControladorTelefone();
        }
        return instancia;
    }
    
    public synchronized long getNewPhone(){
        return phone++;
    }
}
