/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidametodofabrica;

/**
 *
 * @author 20161bsi0314
 */
public class FabricaBebida {
    public static Tipo gerarBebida(String bebida){
        Tipo gerador = null;
        if(bebida.equalsIgnoreCase("cafe")){
            gerador = new Cafe();
        }
        else if(bebida.equalsIgnoreCase("cha")){
            gerador = new Cha();
        }
        else if(bebida.equalsIgnoreCase("Suco")){
            gerador = new Suco();
        }
        else if(bebida.equalsIgnoreCase("refrigerante")){
            gerador = new Refrigerante();
        }
        return gerador;
    }
}
