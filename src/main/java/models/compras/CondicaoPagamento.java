
package models.compras;
import models.patterns.BaseModel;


public class CondicaoPagamento extends BaseModel{
    private String descricaoCondicao;
    private int numeroParcelas;
    private int diasPrimeiraParcela;
    private int diaEntreParcela;
    private char status;

    public CondicaoPagamento(String descricaoCondicao, int numeroParcelas, int diasPrimeiraParcela, int diaEntreParcela, char status, int id) {
        super(id);
        this.descricaoCondicao = descricaoCondicao;
        this.numeroParcelas = numeroParcelas;
        this.diasPrimeiraParcela = diasPrimeiraParcela;
        this.diaEntreParcela = diaEntreParcela;
        this.status = status;
    }


    public String getDescricaoCondicao() {
        return descricaoCondicao;
    }

    public void setDescricaoCondicao(String descricaoCondicao) {
        this.descricaoCondicao = descricaoCondicao;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getDiasPrimeiraParcela() {
        return diasPrimeiraParcela;
    }

    public void setDiasPrimeiraParcela(int diasPrimeiraParcela) {
        this.diasPrimeiraParcela = diasPrimeiraParcela;
    }

    public int getDiaEntreParcela() {
        return diaEntreParcela;
    }

    public void setDiaEntreParcela(int diaEntreParcela) {
        this.diaEntreParcela = diaEntreParcela;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
