/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author 20161BSI0314
 */
public class Exec_composite {
    public static void main(String[] args) {            
        DivisaoMenu divisao = new DivisaoMenu("Menu divisao");
        ItemMenu item1 = new ItemMenu("item1", (float) 1.5);
        ItemMenu item2 = new ItemMenu("item2", (float) 2.5);
        ItemMenu item3 = new ItemMenu("item2", (float) 0.3);
        DivisaoMenu nDivisao = new DivisaoMenu("nova divisao");
        nDivisao.addItem(item2);
        divisao.addItem(item1);
        divisao.addItem(nDivisao);
        divisao.addItem(item3);
        System.out.print(divisao.getPreco());
    }
}
