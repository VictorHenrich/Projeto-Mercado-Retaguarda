package models.vendas;
import java.util.ArrayList;
import java.util.UUID;
import models.patterns.BaseModel;
import models.produtos.HistoricoMovimentacao;
import models.produtos.Produto;


public class ItemCupomFiscal extends BaseModel {
    private final UUID uuid;
    private float quantidadeProdutos;
    private float valorUnitarioProduto;
    private char status;
    private CupomFiscal cupomFiscal;
    private final ArrayList<HistoricoMovimentacao> historicosMovimentacao = new ArrayList();
    private Produto produto;

    public ItemCupomFiscal(UUID uuid, float quantidadeProdutos, float valorUnitarioProduto, char status, CupomFiscal cupomFiscal, Produto produto, int id) {
        super(id);
        this.uuid = uuid;
        this.quantidadeProdutos = quantidadeProdutos;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.produto = produto;
    }

    

    public UUID getUuid() {
        return uuid;
    }
    

    public float getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(float quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
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

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
