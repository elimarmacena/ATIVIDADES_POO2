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
public class Cash100Handler implements CashHandler{
    private CashHandler handler;
    @Override
    public void setNextNotes(CashHandler handler) {
        this.handler = handler;
    }

    @Override
    public void processHandler(int value) {
        if (value >=100){
            int totalNotes = value / 100;
            int rest = value % 100;
            System.out.println("TOTAL DE NOTAS DE 100: "+totalNotes);
            if(rest > 0){
                this.handler.processHandler(rest);
            }
        }
        else{
            this.handler.processHandler(value);
        }
    }
}
