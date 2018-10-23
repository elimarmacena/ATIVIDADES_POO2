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
public class Cash10Handler implements CashHandler{
    private CashHandler handler;
    @Override
    public void setNextNotes(CashHandler handler) {
        throw new UnsupportedOperationException("NAO EH POSSIVEL EFETUAR O SAQUE PARA ESTE VALOR");
    }

    @Override
    public void processHandler(int value) {
        if (value >= 10){
            int totalNotes = value/10;
            int rest = value % 10;
            System.out.println("TOTAL DE NOTAS DE 10: "+totalNotes);
            if (rest >0){
                setNextNotes(handler);
            }
        }
        else{
            throw new UnsupportedOperationException("NAO EH POSSIVEL EFETUAR O SAQUE PARA ESTE VALOR");
        }
    }
    
}
