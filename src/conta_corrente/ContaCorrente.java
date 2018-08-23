/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta_corrente;

/**
 *
 * @author elmr
 */
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calcularTributo() {
        double saldo = getSaldo();
        double tributo = saldo + (saldo * 0.10);
        return tributo;
    }
    
    
}
