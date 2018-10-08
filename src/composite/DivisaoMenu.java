/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20161BSI0314
 */
public class DivisaoMenu extends Item{
    private List<Item> itens;

    public DivisaoMenu(String descricao) {
        super(descricao, 0);
        this.itens = new ArrayList<>();
    }
    
    public void addItem(Item item){
        this.itens.add(item);
    }
    
    public void removeItem(Item item){
        this.itens.remove(item);
    }
    
    public Item[] getAllItens(){
        Item [] itensColeted = new Item[this.itens.size()];
        int _count = 0;
        for (Item item:this.itens){
            itensColeted[_count] = item;
            _count++;
        }
        return itensColeted;
    }
    
    @Override
    public float getPreco(){
        float total = 0;
        for (Item item:this.itens){
            total+= item.getPreco();
        }
        return total;
    }
}
