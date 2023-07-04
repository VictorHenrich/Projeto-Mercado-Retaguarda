package models.compras;

import javax.persistence.*;
import models.patterns.BaseModel;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "pagar")
public class Pagar extends BaseModel {
    @Column(name = "data_emissao")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;

    @Column(name = "hora_emissao")
    private String horaEmissao;

    @Column(name = "data_vencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    @Column(name = "valor_pago")
    private float valorPago;

    @Column(name = "status")
    private char status;

    @OneToMany(mappedBy = "contaPagar", cascade = CascadeType.ALL, orphanRemoval = true)
    private final ArrayList<Pagamento> pagamentos = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_id")
    private Compra compra;

    public Pagar() {
        super(0);
    }

    public Pagar(Date dataEmissao, String horaEmissao, Date dataVencimento, float valorPago, char status, Compra compra, int id) {
        super(id);
        this.dataEmissao = dataEmissao;
        this.horaEmissao = horaEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPago = valorPago;
        this.status = status;
        this.compra = compra;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(String horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
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

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
