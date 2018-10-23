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
public interface CashHandler {
    public void setNextNotes(CashHandler handler);
    public void processHandler(int value);
}
