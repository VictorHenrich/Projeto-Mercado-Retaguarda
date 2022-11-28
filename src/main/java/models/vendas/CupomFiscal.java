
package models.vendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import models.pessoas.Cliente;
import models.pessoas.Colaborador;
import models.patterns.BaseModel;


public class CupomFiscal extends BaseModel{
    private final UUID uuid;
    private Date dataVenda;
    private String horaVenda;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalCupom;
    private char status;
    private final ArrayList<ItemCupomFiscal> itensCupom = new ArrayList();
    private Cliente cliente;
    private Colaborador colaborador;

    public CupomFiscal(UUID uuid, Date dataVenda, String horaVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status, Cliente cliente, Colaborador colaborador, int id) {
        super(id);
        this.uuid = uuid;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalCupom = totalCupom;
        this.status = status;
        this.cliente = cliente;
        this.colaborador = colaborador;
    }

    public UUID getUuid() {
        return uuid;
    }

    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
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

    public float getTotalCupom() {
        return totalCupom;
    }

    public void setTotalCupom(float totalCupom) {
        this.totalCupom = totalCupom;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public ArrayList<ItemCupomFiscal> getItensCupom() {
        return itensCupom;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    
    
}
