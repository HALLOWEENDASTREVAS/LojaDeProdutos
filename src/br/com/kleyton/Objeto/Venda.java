/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton.Objeto;

import java.util.ArrayList;

/**
 *
 * @author kleyton.155017
 */
public class Venda {
    private Cliente cliente;
    private ArrayList <Produto> produto = new ArrayList<Produto>();
    private float pagar;
    private int id;
    private char status;

    public Venda(Cliente cliente, Float totalAPagar, int id, char status) {
        this.cliente = cliente;
        this.pagar = pagar;
        this.id = id;
        this.status = status;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Float getTotalAPagar() {
        return pagar;
    }

    public void setTotalAPagar(Float totalAPagar) {
        this.pagar = totalAPagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
  
    
    
}
