
package models.produtos;

import java.util.Date;
import java.util.UUID;
import models.patterns.BaseModel;
import models.compras.ItemCompra;


public class HistoricoMovimentacao extends BaseModel{
    private final UUID uuid;
    private Date data;
    private String hora;
    private float quantidade;
    private char status;
    private Produto produto;
    private ItemCompra itemCompra;

    public HistoricoMovimentacao(UUID uuid, Date data, String hora, float quantidade, char status, Produto produto, ItemCompra itemCompra, int id) {
        super(id);
        this.uuid = uuid;
        this.data = data;
        this.hora = hora;
        this.quantidade = quantidade;
        this.status = status;
        this.produto = produto;
        this.itemCompra = itemCompra;
    }

    public UUID getUuid() {
        return uuid;
    }
    
    
    public ItemCompra getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
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
