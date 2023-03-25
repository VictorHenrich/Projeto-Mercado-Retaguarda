
package controllers.builders.produtos;

import controllers.patterns.ModelBuilder;
import models.products.Product;
import models.products.Class;
import models.products.Brand;


public class ProductBuilder implements ModelBuilder<Product>{
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

    public ProductBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        
        return this;
    }

    public ProductBuilder setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
        
        return this;
    }

    public ProductBuilder setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
        
        return this;
    }

    public ProductBuilder setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
        
        return this;
    }

    public ProductBuilder setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
        
        return this;
    }

    public ProductBuilder setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
        
        return this;
    }

    public ProductBuilder setStatus(char status) {
        this.status = status;
        
        return this;
    }

    public ProductBuilder setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
        
        return this;
    }

    public ProductBuilder setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
        
        return this;
    }

    public ProductBuilder setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
        
        return this;
    }

    public ProductBuilder setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
        
        return this;
    }

    public ProductBuilder setClasse(Class classe) {
        this.classe = classe;
        
        return this;
    }

    public ProductBuilder setMarca(Brand marca) {
        this.marca = marca;
        
        return this;
    }
    
    
    
    
    @Override
    public Product build(int id) {
        return new Product(
           this.descricao,
           this.valorCompra,
           this.valorVenda,
           this.unidadeCompra,
           this.unidadeVenda,
           this.fatorConversao,
           this.status,
           this.barraEntrada,
           this.barraSaida,
           this.estoqueMinimo,
           this.estoqueMaximo,
           this.classe,
           this.marca,
           id
        );
    }
    
}
