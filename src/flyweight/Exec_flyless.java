/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.ArrayList;

/**
 *
 * @author elmr
 */
public class Exec_flyless {
    public static void main(String[] args) {            
        ArrayList<Pedido> listaPedidos = new ArrayList();        
        for(int i=0; i< 500000; i++){             
            Pedido pedido = new Pedido();
            Item item1 = new Item();
            item1.setSttItem(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            Item item2 = new Item();
            item2.setSttItem(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            Item item3 = new Item();
            item3.setSttItem(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);                                   
            listaPedidos.add(pedido);
        }
        //calcula a quantidade de memória consumida pelo programa java
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(listaPedidos.size());    
    }
}
