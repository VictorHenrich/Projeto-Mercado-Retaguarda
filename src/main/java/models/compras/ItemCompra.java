
package models.compras;

import java.util.ArrayList;
import models.produtos.HistoricoMovimentacao;
import models.produtos.Produto;


public class ItemCompra {
    private int id;
    private float quantidadeProduto;
    private float valorUnitarioProduto;
    private char status;
    private Produto produto;
    private ArrayList<HistoricoMovimentacao> historicosMovimentacoes;
    private Compra compra;

    public ItemCompra(
        int id, 
        float quantidadeProduto, 
        float valorUnitarioProduto, 
        char status, 
        Produto produto, 
        Compra compra
    ) {
        this.id = id;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.produto = produto;
        this.historicosMovimentacoes = new ArrayList();
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(float quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
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

    public ArrayList<HistoricoMovimentacao> getHistoricosMovimentacoes() {
        return historicosMovimentacoes;
    }

    public void setHistoricosMovimentacoes(ArrayList<HistoricoMovimentacao> historicosMovimentacoes) {
        this.historicosMovimentacoes = historicosMovimentacoes;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    
    
    
}
