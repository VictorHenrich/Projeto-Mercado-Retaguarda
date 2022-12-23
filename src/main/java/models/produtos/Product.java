
package models.produtos;
import java.util.ArrayList;
import models.patterns.BaseModel;
import models.compras.ItemCompra;


public class Product extends BaseModel{
    private String descricao;
    private float valorCompra;
    private float valorVenda;
    private String unidadeCompra;
    private String unidadeVenda;
    private int fatorConversao;
    private char status;
    private String barraEntrada;
    private String barraSaida;
    private float estoqueMinimo;
    private float estoqueMaximo;
    private Class classe;
    private Brand marca;
    private final ArrayList<HistoricalMovement> historicosMovimentacoes = new ArrayList();
    private final ArrayList<ItemCompra> itensCompra = new ArrayList();

    public Product(String descricao, float valorCompra, float valorVenda, String unidadeCompra, String unidadeVenda, int fatorConversao, char status, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo, Class classe, Brand marca, int id) {
        super(id);
        this.descricao = descricao;
        this.valorCompra = valorCompra;
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

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
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

    public Class getClasse() {
        return classe;
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }

    public Brand getMarca() {
        return marca;
    }

    public void setMarca(Brand marca) {
        this.marca = marca;
    }

    public ArrayList<HistoricalMovement> getHistoricosMovimentacoes() {
        return historicosMovimentacoes;
    }
}
