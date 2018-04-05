/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton.Objeto;

import java.util.Date;

/**
 *
 * @author kleyton.155017
 */
public class Produto{
    
    private int id;
    private String nomeProdu,descricao;
    private float valor;
    private char status;

    public Produto(int id, String nomeProdu, String descricao, Float valor, char status) {
        this.id = id;
        this.nomeProdu = nomeProdu;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProdu() {
        return nomeProdu;
    }

    public void setNomeProdu(String nomeProdu) {
        this.nomeProdu = nomeProdu;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

   
}
