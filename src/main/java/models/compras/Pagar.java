
package models.compras;

import java.util.ArrayList;
import java.util.Date;


public class Pagar {
    private int id;
    private Date dataEmissao;
    private String horaEmissao;
    private Date dataVencimento;
    private float valorPaga;
    private char status;
    private ArrayList<Pagamento> pagamentos;
    private Compra compra;

    public Pagar(
        int id, 
        Date dataEmissao, 
        String horaEmissao, 
        Date dataVencimento, 
        float valorPaga, 
        char status, 
        Compra compra
    ) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.horaEmissao = horaEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPaga = valorPaga;
        this.status = status;
        this.compra = compra;
        this.pagamentos = new ArrayList();
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getValorPaga() {
        return valorPaga;
    }

    public void setValorPaga(float valorPaga) {
        this.valorPaga = valorPaga;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    
    
}
