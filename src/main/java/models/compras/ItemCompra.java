package models.compras;

import javax.persistence.*;
import models.patterns.BaseModel;
import models.products.HistoricalMovement;
import models.products.Product;
import java.util.ArrayList;

@Entity
@Table(name = "item_compra")
public class ItemCompra extends BaseModel {
    @Column(name = "quantidade_produto")
    private float quantidadeProduto;

    @Column(name = "valor_unitario_produto")
    private float valorUnitarioProduto;

    @Column(name = "status")
    private char status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id")
    private Product produto;

    @OneToMany(mappedBy = "itemCompra", cascade = CascadeType.ALL, orphanRemoval = true)
    private final ArrayList<HistoricalMovement> historicosMovimentacoes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_id")
    private Compra compra;

    public ItemCompra() {
        super(0);
    }

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
