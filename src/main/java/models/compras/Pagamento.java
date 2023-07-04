package models.compras;

import java.util.Date;
import models.patterns.BaseModel;


public class Pagamento extends BaseModel{
    
    private Date dataPagamento;
    private String horaPagamento;
    private float valorDesconto;
    private float valorAcrescimo;
    private float valorPago;
    private char status;
    private Pagar contaPagar;

    public Pagamento(Date dataPagamento, String horaPagamento, float valorDesconto, float valorAcrescimo, float valorPago, char status, Pagar contaPagar, int id) {
        super(id);
        this.dataPagamento = dataPagamento;
        this.horaPagamento = horaPagamento;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorPago = valorPago;
        this.status = status;
        this.contaPagar = contaPagar;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(String horaPagamento) {
        this.horaPagamento = horaPagamento;
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

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Pagar getContaPagar() {
        return contaPagar;
    }

    public void setContaPagar(Pagar contaPagar) {
        this.contaPagar = contaPagar;
    }
}