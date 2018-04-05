/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton;

/**
 *
 * @author kleyton.155017
 */
public enum Produtos {
   
    monster(1, "Monster Energy Drinck", "Energético a base de taurina e guaranina", (float) 5.00,'A'),
    redbull(2, "Red Bull Energy Drinck", "Red Bull te da asas", (float) 6.99,'A'),
    redhouse(3, "Red House Energy Drinck", "Cópia do red bull", (float) 4.00,'A'),
    balyhii(4, "Baly Hai Energy Drinck", "Muito caro e vem pouco", (float) 4.99,'A'),
    flynghouse(5, "Flyng House Energy Drinck", "Nem conheço", (float) 4.00,'I'),
    gatorade(6, "Gatorade Energy", "Rico em sais minerais", (float) 2.99,'A'),
    burn(7, "Burn Energy Drinck", "Latinha bonita", (float) 4.99,'A'),
    nightPawer(8, "Night Power Energy Drinck", "É bom pra noite", (float) 8.99,'I'),
    vulcano(9, "Vulcano Energy Drinck", "Nome massa", (float) 7.00,'I'),
    V220(10, "V220 Energy Drinck", "Legal", (float)5.99,'I');
    
    private int id;
    private String nome;
    private String descricao;
    private float valor;
    private char status;
    
    private Produtos(int id, String nome, String descricao, float valor, char status){

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = id;
        this.id = id;
    }

    public static Produtos getMonster() {
        return monster;
    }

    public static Produtos getRedbull() {
        return redbull;
    }

    public static Produtos getRedhouse() {
        return redhouse;
    }

    public static Produtos getBalyhii() {
        return balyhii;
    }

    public static Produtos getFlynghouse() {
        return flynghouse;
    }

    public static Produtos getGatorade() {
        return gatorade;
    }

    public static Produtos getBurn() {
        return burn;
    }

    public static Produtos getNightPawer() {
        return nightPawer;
    }

    public static Produtos getVulcano() {
        return vulcano;
    }

    public static Produtos getV220() {
        return V220;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public char getStatus() {
        return status;
    }
    

}
