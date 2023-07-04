package models.vendas;

import java.util.ArrayList;
import java.util.UUID;
import models.patterns.BaseModel;
import models.products.HistoricalMovement;
import models.products.Product;
import javax.persistence.*;

@Entity
@Table(name = "item_cupom_fiscal")
public class ItemCupomFiscal extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "uuid", nullable = false, unique = true)
    private final UUID uuid;

    @Column(name = "quantidade_products")
    private float quantidadeProducts;

    @Column(name = "valor_unitario_product")
    private float valorUnitarioProduct;

    @Column(name = "status")
    private char status;

    @ManyToOne
    @JoinColumn(name = "cupom_fiscal_id")
    private CupomFiscal cupomFiscal;

    @OneToMany(mappedBy = "itemCupomFiscal", cascade = CascadeType.ALL)
    private final ArrayList<HistoricalMovement> historicosMovimentacao = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product produto;

    public ItemCupomFiscal() {
        super(0);
        this.uuid = null;
    }

    public ItemCupomFiscal(UUID uuid, float quantidadeProducts, float valorUnitarioProduct, char status, CupomFiscal cupomFiscal, Product produto, int id) {
        super(id);
        this.uuid = uuid;
        this.quantidadeProducts = quantidadeProducts;
        this.valorUnitarioProduct = valorUnitarioProduct;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.produto = produto;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public float getQuantidadeProducts() {
        return quantidadeProducts;
    }

    public void setQuantidadeProducts(float quantidadeProducts) {
        this.quantidadeProducts = quantidadeProducts;
    }

    public float getValorUnitarioProduct() {
        return valorUnitarioProduct;
    }

    public void setValorUnitarioProduct(float valorUnitarioProduct) {
        this.valorUnitarioProduct = valorUnitarioProduct;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public ArrayList<HistoricalMovement> getHistoricosMovimentacao() {
        return historicosMovimentacao;
    }

    public Product getProduct() {
        return produto;
    }

    public void setProduct(Product produto) {
        this.produto = produto;
    }
}
