package models.vendas;
import java.util.ArrayList;
import java.util.UUID;
import models.patterns.BaseModel;
import models.produtos.HistoricalMovement;
import models.produtos.Product;


public class ItemCupomFiscal extends BaseModel {
    private final UUID uuid;
    private float quantidadeProducts;
    private float valorUnitarioProduct;
    private char status;
    private CupomFiscal cupomFiscal;
    private final ArrayList<HistoricalMovement> historicosMovimentacao = new ArrayList();
    private Product produto;

    public ItemCupomFiscal(UUID uuid, float quantidadeProducts, float valorUnitarioProduct, char status, CupomFiscal cupomFiscal, Product produto, int id) {
        super(id);
        this.uuid = uuid;
        this.quantidadeProducts = quantidadeProducts;
        this.valorUnitarioProduct = valorUnitarioProduct;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.produto = produto;
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
    
    public Product getProduct() {
        return produto;
    }

    public void setProduct(Product produto) {
        this.produto = produto;
    }

    
}
