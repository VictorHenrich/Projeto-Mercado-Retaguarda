
package models.products;
import models.patterns.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name = "produtos")
public class Product extends BaseModel{

    @Column
    private String descricao;

    @Column(name = "valor_compra")
    private float valorCompra;

    @Column(name = "valor_venda")
    private float valorVenda;

    @Column(name = "unidade_compra")
    private String unidadeCompra;

    @Column(name = "unidade_venda")
    private String unidadeVenda;

    @Column(name = "fator_conversao")
    private int fatorConversao;

    @Column
    private char status;

    @Column(name = "barra_saida")
    private String barraEntrada;

    @Column(name = "barra_entrada")
    private String barraSaida;

    @Column(name = "estoque_minimo")
    private float estoqueMinimo;

    @Column(name = "estoque_maximo")
    private float estoqueMaximo;

    @JoinColumn
    @ManyToOne
    private Class classe;

    @JoinColumn
    @ManyToOne
    private Brand marca;

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


    protected Product(){
        super(0);
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
}
