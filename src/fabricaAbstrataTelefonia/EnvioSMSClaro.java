/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstrataTelefonia;

/**
 *
 * @author 20161BSI0314
 */
public class EnvioSMSClaro implements EnvioSMS{

    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone Claro:" + telefone );
        return true;
    }
    
}
