/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author elmr
 */
public class FlyweightStatusItem {
    HashMap<String,StatusItem> cacheStatus = new HashMap<>();
    public FlyweightStatusItem(){
        StatusItem carrinho= new StatusItem(StatusItem.Estado.CARRINHO , true, false);
        this.addStatus(carrinho);
        StatusItem fechado= new StatusItem(StatusItem.Estado.FECHADO , true, false);
        this.addStatus(fechado);
        StatusItem pago= new StatusItem(StatusItem.Estado.PAGO , true, false);
        this.addStatus(pago);
        StatusItem enviado = new StatusItem(StatusItem.Estado.ENVIADO , true, false);
        this.addStatus(enviado);
        StatusItem entregue = new StatusItem(StatusItem.Estado.ENTREGUE , true, false);
        this.addStatus(entregue);
    }
    public void addStatus(StatusItem status){
        this.cacheStatus.put(status.getEstado().toString(),status);
    }
    public StatusItem getEstadoStatus(String estado){
        return (StatusItem)cacheStatus.get(estado);
    }
}
