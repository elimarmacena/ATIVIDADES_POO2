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
public class ObserverOnAction {
    public static void main (String[] args) {
        MembroEmail me = new MembroEmail();
        MembroWhatsApp mw = new MembroWhatsApp();
        CaixaEntradaGrupo ce = new CaixaEntradaGrupo();
        ce.setObserver(mw);
        ce.setNovaMensagem("bababababa");
        ce.setNovaMensagem("bababababa");
        ce.setNovaMensagem("bababababa");
        CaixaEntradaGrupo ce2 = new CaixaEntradaGrupo();
        ce2.setObserver(me);
        ce2.setNovaMensagem("popopopop");
        ce2.setNovaMensagem("popopopopa");
        ce2.setNovaMensagem("popopopopa");
    }            
}
