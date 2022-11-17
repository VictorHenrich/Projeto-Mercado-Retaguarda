/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.produtos;
import java.util.ArrayList;
import java.util.Date;
import models.compras.ItemCompra;

/**
 *
 * @author Victor Henrich
 */
public class Produto {
    private int id;
    private String descricao;
    private float valroCompra;
    private float valorVenda;
    private String unidadeCompra;
    private String unidadeVenda;
    private int fatorConversao;
    private char status;
    private Date dataCadastro;
    private String barraEntrada;
    private String barraSaida;
    private float estoqueMinimo;
    private float estoqueMaximo;
    private Classe classe;
    private Marca marca;
    private ArrayList<HistoricoMovimentacao> historicosMovimentacoes = new ArrayList();
    private ArrayList<ItemCompra> itensCompra = new ArrayList();

    public Produto(int id, String descricao, float valroCompra, float valorVenda, String unidadeCompra, String unidadeVenda, int fatorConversao, char status, Date dataCadastro, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo, Classe classe, Marca marca) {
        this.id = id;
        this.descricao = descricao;
        this.valroCompra = valroCompra;
        this.valorVenda = valorVenda;
        this.unidadeCompra = unidadeCompra;
        this.unidadeVenda = unidadeVenda;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.dataCadastro = dataCadastro;
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

    public void setItensCompra(ArrayList<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
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

    public void setHistoricosMovimentacoes(ArrayList<HistoricoMovimentacao> historicosMovimentacoes) {
        this.historicosMovimentacoes = historicosMovimentacoes;
    }
    
    
}
