/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton;

import br.com.kleyton.Objeto.Cliente;
import java.text.SimpleDateFormat;

/**
 *
 * @author kleyton.155017
 */
public enum Menu {
    
  
    cadCli(1, "Cadastro cliente"),
    cadPro(2, "Cadatro de Produtos."),
    cadVend(3, "Vendas."),
    consul(4, "Consultar."),
    sair(5, "Sair.");
    
    private int cod;
    private String opcao;

    @Override
    public String toString() {
        return "Menu{" + "cod=" + cod + ", opcao=" + opcao + '}';
    }
    
    
    private Menu(int cod, String opcao) {
        this.cod = cod;
        this.opcao = opcao;
    }

    public static Menu getCadCli() {
        return cadCli;
    }

    public static Menu getCadPro() {
        return cadPro;
    }

    public static Menu getCadVend() {
        return cadVend;
    }

    public static Menu getConsul() {
        return consul;
    }

    public static Menu getSair() {
        return sair;
    }

    public int getCod() {
        return cod;
    }

    public String getOpcao() {
        return opcao;
    }
    
  
}
