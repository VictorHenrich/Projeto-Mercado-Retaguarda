package models.vendas;

import models.people.Client;
import models.people.Collaborator;
import models.patterns.BaseModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cupom_fiscal")
public class CupomFiscal extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "uuid", nullable = false, unique = true)
    private final UUID uuid;

    @Column(name = "data_venda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenda;

    @Column(name = "hora_venda")
    private String horaVenda;

    @Column(name = "valor_desconto")
    private float valorDesconto;

    @Column(name = "valor_acrescimo")
    private float valorAcrescimo;

    @Column(name = "total_cupom")
    private float totalCupom;

    @Column(name = "status")
    private char status;

    @OneToMany(mappedBy = "cupomFiscal", cascade = CascadeType.ALL)
    private final ArrayList<ItemCupomFiscal> itensCupom = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client cliente;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Collaborator colaborador;

    public CupomFiscal() {
        super(0);
        this.uuid = null;
    }

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

    // Getters and setters

    @Override
    public int getId() {
        return id;
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
