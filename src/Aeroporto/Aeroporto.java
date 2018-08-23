/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeroporto;

import java.util.ArrayList;

/**
 *
 * @author elmr
 */
public class Aeroporto {
    private String codigo;
    private String nome;
    private boolean internacional;
    private ArrayList vooDireto;
    /**
    *Aeroportos que fazem voo para este aeroporto
    *
    */
    private ArrayList vooRecebido;
    private ArrayList avioesPatio;
    
    public Aeroporto(){
        this.vooDireto = new ArrayList<Aeroporto>();
        this.vooRecebido = new ArrayList<Aeroporto>();
        this.avioesPatio = new ArrayList<Aviao>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInternacional() {
        return internacional;
    }

        /**
     * possibilidade de alterar o status de nacional para internacional
     * @param internacional =  informa se o aeroporto ira ser internacional ou nao.
     */
    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public ArrayList getVooDireto() {
        return vooDireto;
    }

    public void setVooDireto(Aeroporto ap) {
        if(ap != null){
            this.vooDireto.add(ap);
        }
    }

    public ArrayList getVooRecebido() {
        return vooRecebido;
    }

    public void setVooRecebido(Aeroporto ap) {
        if(ap != null){
            this.vooRecebido.add(ap);
        }
    }

    public ArrayList<Aviao> getAvioesPatio() {
        return avioesPatio;
    }

    public void setAvioesPatio(Aviao av) {
        if (av != null){
        this.avioesPatio.add(av);
        }
    }
    
    public String identificacao(){
        String id = null;
        id = ""+getCodigo()+": "+getNome();
        return id;
    }
    
    public boolean equals (Aeroporto ap){
        return this.getCodigo().equals(ap.getCodigo());
    }
    
    public boolean isAviaoInAeroporto (String prefixoAv){
        if(prefixoAv != null && !prefixoAv.equals("")){
            for( Aviao pousado : this.getAvioesPatio() ){
                if(pousado.getPrefixo().equals(prefixoAv)){
                    return true;
                }
            }
        }
        return false;
    }
}
