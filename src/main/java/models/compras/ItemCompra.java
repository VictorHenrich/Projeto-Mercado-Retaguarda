
package models.compras;

import java.util.ArrayList;
import models.produtos.HistoricoMovimentacao;
import models.produtos.Produto;
import models.patterns.BaseModel;


public class ItemCompra extends BaseModel{
    private float quantidadeProduto;
    private float valorUnitarioProduto;
    private char status;
    private Produto produto;
    private final ArrayList<HistoricoMovimentacao> historicosMovimentacoes = new ArrayList();
    private Compra compra;

    public ItemCompra(float quantidadeProduto, float valorUnitarioProduto, char status, Produto produto, Compra compra, int id) {
        super(id);
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.produto = produto;
        this.compra = compra;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    
    
    
}
