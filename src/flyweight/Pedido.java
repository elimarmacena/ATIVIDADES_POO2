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
public class Pedido {
    private ArrayList<Item> itens;
    
    public Pedido(){
        this.itens = new ArrayList<>();
    }

    public ArrayList<Item>  getItens() {
        return this.itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    public void addItemPedido(Item item){
        this.itens.add(item);
    }
}
