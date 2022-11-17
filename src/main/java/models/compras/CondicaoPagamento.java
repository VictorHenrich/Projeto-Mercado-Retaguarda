
package models.compras;


public class CondicaoPagamento {
    private int id;
    private String descricaoCondicao;
    private int numeroParcelas;
    private int diasPrimeiraParcela;
    private int diaEntreParcela;
    private char status;

    public CondicaoPagamento(
        int id, 
        String descricaoCondicao, 
        int numeroParcelas, 
        int diasPrimeiraParcela, 
        int diaEntreParcela, 
        char status
    ) {
        this.id = id;
        this.descricaoCondicao = descricaoCondicao;
        this.numeroParcelas = numeroParcelas;
        this.diasPrimeiraParcela = diasPrimeiraParcela;
        this.diaEntreParcela = diaEntreParcela;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
