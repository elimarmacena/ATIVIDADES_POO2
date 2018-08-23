/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeroporto;

/**
 *
 * @author elmr
 */
public class Aviao {
    private String prefixo;
    private String modelo;
    private String fabricante;
    private int assentos;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String identificacao(){
        String id = null;
        id = ""+getPrefixo()+"-"+getModelo()+"-"+getFabricante()+"-"+getAssentos();
        return id;
    }
}
