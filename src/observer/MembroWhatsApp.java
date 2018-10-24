/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author elmr
 */
public class MembroWhatsApp implements Observer{
    private int numero;
    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo caixaEntrata = (CaixaEntradaGrupo)obs;
        System.out.println("NOVA MENSAGEM NO WHATSAPP");
        System.out.println(caixaEntrata.getMensagem());
        
    }
    
}
