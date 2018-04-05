/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton.Objeto;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kleyton.155017
 */
public class Cliente extends Pessoa{
    
    private int id,idade;
    private Date dataCadas;
    private char status;

    public Cliente(int id, Date dataCadas, char status) {
        this.id = id;
        this.dataCadas = dataCadas;
        this.status = status;
        this.idade = this.calculaIdade(dataNasci);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataCadas() {
        return dataCadas;
    }

    public void setDataCadas(Date dataCadas) {
        this.dataCadas = dataCadas;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
    public static int calculaIdade(java.util.Date dataNasc) {

    Calendar dataNasci = Calendar.getInstance();  
    dataNasci.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNasci.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNasci.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNasci.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNasci.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }

    return idade;
}
   
}
