
package models.vendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import models.people.Client;
import models.people.Collaborator;
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
    private Client cliente;
    private Collaborator colaborador;

    public CupomFiscal(UUID uuid, Date dataVenda, String horaVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status, Client cliente, Collaborator colaborador, int id) {
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

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Collaborator getColaborador() {
        return colaborador;
    }

    public void setColaborador(Collaborator colaborador) {
        this.colaborador = colaborador;
    }
    
    
    
}
