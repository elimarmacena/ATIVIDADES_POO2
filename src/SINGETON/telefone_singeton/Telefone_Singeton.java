/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SINGETON.telefone_singeton;

import SINGETON.Controlador.ControladorTelefone;

/**
 *
 * @author 20161BSI0314
 */
public class Telefone_Singeton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("SINGETON APLICADO NA GERACAO DE NUMEROS DE TELEFONE UNICO");
       System.out.println("INICIALIZACAO DO SINGETON"); 
       ControladorTelefone gerenciador = ControladorTelefone.getInstance();
       System.out.println("SINGETON INICIADO");
       System.out.println("\n\nINICIO DA CRIACAO DOS NUMERO");
       while(true){
        System.out.println(gerenciador.getNewPhone());
       }
        
    }
    
}
