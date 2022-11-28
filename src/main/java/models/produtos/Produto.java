
package models.produtos;
import java.util.ArrayList;
import models.patterns.BaseModel;
import models.compras.ItemCompra;


public class Produto extends BaseModel{
    private String descricao;
    private float valroCompra;
    private float valorVenda;
    private String unidadeCompra;
    private String unidadeVenda;
    private int fatorConversao;
    private char status;
    private String barraEntrada;
    private String barraSaida;
    private float estoqueMinimo;
    private float estoqueMaximo;
    private Classe classe;
    private Marca marca;
    private final ArrayList<HistoricoMovimentacao> historicosMovimentacoes = new ArrayList();
    private final ArrayList<ItemCompra> itensCompra = new ArrayList();

    public Produto(String descricao, float valroCompra, float valorVenda, String unidadeCompra, String unidadeVenda, int fatorConversao, char status, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo, Classe classe, Marca marca, int id) {
        super(id);
        this.descricao = descricao;
        this.valroCompra = valroCompra;
        this.valorVenda = valorVenda;
        this.unidadeCompra = unidadeCompra;
        this.unidadeVenda = unidadeVenda;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.barraEntrada = barraEntrada;
        this.barraSaida = barraSaida;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.classe = classe;
        this.marca = marca;
    }

    

    public ArrayList<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValroCompra() {
        return valroCompra;
    }

    public void setValroCompra(float valroCompra) {
        this.valroCompra = valroCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public String getUnidadeVenda() {
        return unidadeVenda;
    }

    public void setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public float getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ArrayList<HistoricoMovimentacao> getHistoricosMovimentacoes() {
        return historicosMovimentacoes;
    }
}
