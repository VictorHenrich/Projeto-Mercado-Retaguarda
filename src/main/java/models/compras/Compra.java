
package models.compras;

import java.util.ArrayList;
import java.util.Date;
import models.people.Supplier;
import models.patterns.BaseModel;


public class Compra extends BaseModel{
    private Date dataCompra;
    private String horaCompra;
    private String numeroNF;
    private String tipoNF;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalNF;
    private char status;
    private final ArrayList<ItemCompra> itensCompra = new ArrayList();
    private final ArrayList<Pagar> contasVinculadas = new ArrayList();
    private CondicaoPagamento condicaoPagamento;
    private Supplier fornecedor;

    public Compra(Date dataCompra, String horaCompra, String numeroNF, String tipoNF, float valorDesconto, float valorAcrescimo, float totalNF, char status, CondicaoPagamento condicaoPagamento, Supplier fornecedor, int id) {
        super(id);
        this.dataCompra = dataCompra;
        this.horaCompra = horaCompra;
        this.numeroNF = numeroNF;
        this.tipoNF = tipoNF;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalNF = totalNF;
        this.status = status;
        this.condicaoPagamento = condicaoPagamento;
        this.fornecedor = fornecedor;
    }
    
    

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getTotalNF() {
        return totalNF;
    }

    public void setTotalNF(float totalNF) {
        this.totalNF = totalNF;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public ArrayList<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public ArrayList<Pagar> getContasVinculadas() {
        return contasVinculadas;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public Supplier getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Supplier fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
