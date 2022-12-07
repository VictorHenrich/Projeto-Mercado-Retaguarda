
package controllers.builders.produtos;

import controllers.patterns.ModelBuilder;
import java.util.Date;
import java.util.UUID;
import models.compras.ItemCompra;
import models.produtos.HistoricalMovement;
import models.produtos.Product;


public class HistoricalMovementBuilder implements ModelBuilder<HistoricalMovement>{
    private UUID uuid;
    
    private Date data;
    private String hora;
    private float quantidade;
    private char status;
    private Product produto;
    private ItemCompra itemCompra;

    public HistoricalMovementBuilder setUuid(UUID uuid) {
        this.uuid = uuid;
        
        return this;
    }

    public HistoricalMovementBuilder setData(Date data) {
        this.data = data;
        
        return this;
    }

    public HistoricalMovementBuilder setHora(String hora) {
        this.hora = hora;
        
        return this;
    }

    public HistoricalMovementBuilder setQuantidade(float quantidade) {
        this.quantidade = quantidade;
        
        return this;
    }

    public HistoricalMovementBuilder setStatus(char status) {
        this.status = status;
        
        return this;
    }

    public HistoricalMovementBuilder setProduto(Product produto) {
        this.produto = produto;
        
        return this;
    }

    public HistoricalMovementBuilder setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
        
        return this;
    }
    
    
    @Override
    public HistoricalMovement build(int id) {
        return new HistoricalMovement(
           this.uuid,
           this.data,
           this.hora,
           this.quantidade,
           this.status,
           this.produto,
           this.itemCompra,
           id
        );
    }
    
}
