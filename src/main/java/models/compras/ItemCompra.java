
package models.compras;

import java.util.ArrayList;
import models.patterns.BaseModel;
import models.produtos.HistoricalMovement;
import models.produtos.Product;


public class ItemCompra extends BaseModel{
    private float quantidadeProduto;
    private float valorUnitarioProduto;
    private char status;
    private Product produto;
    private final ArrayList<HistoricalMovement> historicosMovimentacoes = new ArrayList();
    private Compra compra;

    public ItemCompra(float quantidadeProduto, float valorUnitarioProduto, char status, Product produto, Compra compra, int id) {
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

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }

    public ArrayList<HistoricalMovement> getHistoricosMovimentacoes() {
        return historicosMovimentacoes;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    
    
    
}
