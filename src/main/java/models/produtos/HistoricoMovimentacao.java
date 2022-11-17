/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.produtos;

import java.util.Date;
import java.util.UUID;
import models.compras.ItemCompra;

/**
 *
 * @author Victor Henrich
 */
public class HistoricoMovimentacao {
    private UUID id;
    private Date data;
    private String hora;
    private float quantidade;
    private char status;
    private Produto produto;
    private ItemCompra itemCompra;

    public HistoricoMovimentacao(UUID id, Date data, String hora, float quantidade, char status, Produto produto, ItemCompra itemCompra) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.quantidade = quantidade;
        this.status = status;
        this.produto = produto;
        this.itemCompra = itemCompra;
    }

    public ItemCompra getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
    }
    

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
