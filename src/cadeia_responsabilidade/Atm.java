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
public class Atm {
    private CashHandler note100;
    public Atm(){
        this.note100 = new Cash100Handler();
        CashHandler note50 = new Cash50Handler();
        CashHandler note20 = new Cash20Handler();
        CashHandler note10 = new Cash10Handler();
        this.note100.setNextNotes(note50);
        note50.setNextNotes(note20);
        note20.setNextNotes(note10);
    }
    public static void main(String[] args) {            
        int valorSaque = 115;
        Atm caixa = new Atm();
        caixa.note100.processHandler(valorSaque);
        System.out.println("SAQUE FINALIZADO");
        
    }
}
