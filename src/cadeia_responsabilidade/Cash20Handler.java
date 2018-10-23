/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeia_responsabilidade;

/**
 *
 * @author elmr
 */
public class Cash20Handler implements CashHandler{
    private CashHandler handler;
    @Override
    public void setNextNotes(CashHandler handler) {
        this.handler = handler;
    }

    @Override
    public void processHandler(int value) {
        if (value >=20){
            int totalNotes = value / 20;
            int rest = value % 20;
            System.out.println("TOTAL DE NOTAS DE 20: "+totalNotes);
            if(rest > 0){
                this.handler.processHandler(rest);
            }
        }
        else{
            this.handler.processHandler(value);
        }
    }
    
}
