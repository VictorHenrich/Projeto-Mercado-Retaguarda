/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.produtos;

import java.util.ArrayList;

/**
 *
 * @author Victor Henrich
 */
public class Marca {
    private int id;
    private String descricao;
    private ArrayList<Produto> produtos;

    public Marca(int id, String descricao, ArrayList<Produto> produtos) {
        this.id = id;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
