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
public class MetodoFabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tipo bebida;
        bebida = FabricaBebida.gerarBebida("cafe");
        bebida.gerar();
        
        bebida = FabricaBebida.gerarBebida("cha");
        bebida.gerar();
        
        bebida = FabricaBebida.gerarBebida("refrigerante");
        bebida.gerar();
        
        bebida = FabricaBebida.gerarBebida("suco");
        bebida.gerar();
    }
    
}
