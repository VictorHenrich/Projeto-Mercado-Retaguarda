
package controllers.builders.produtos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.products.Product;
import models.products.Class;
import models.products.Brand;


public class ProductBuilder extends ModelBuilder<Product>{
    private String descricao;
    private float valorCompra;
    private float valorVenda;
    private String unidadeCompra;
    private String unidadeVenda;
    private int fatorConversao;
    private char status;
    private String barraEntrada = "";
    private String barraSaida = "";
    private float estoqueMinimo = 0;
    private float estoqueMaximo = 0;
    private Class classe;
    private Brand marca;

    public ProductBuilder setDescricao(String descricao) throws ModelBuilderException{
        if(descricao == null || descricao.equals(""))
            throw new ModelBuilderException("Campo descrição de produto está vazio!");

        this.descricao = descricao;
        
        return this;
    }

    public ProductBuilder setValorCompra(float valorCompra) throws ModelBuilderException{
        if(valorCompra < 0)
            throw new ModelBuilderException("Valor de compra de produto é menor que 0!");

        this.valorCompra = valorCompra;
        
        return this;
    }

    public ProductBuilder setValorVenda(float valorVenda) throws ModelBuilderException{
        if(valorVenda < 0)
            throw new ModelBuilderException("Valor de venda de produto é menor que 0!");

        this.valorVenda = valorVenda;
        
        return this;
    }

    public ProductBuilder setUnidadeCompra(String unidadeCompra) throws ModelBuilderException{
        if(unidadeCompra == null || unidadeCompra.equals(""))
            throw new ModelBuilderException("Unidade de compra está vazia!");

        this.unidadeCompra = unidadeCompra;
        
        return this;
    }

    public ProductBuilder setUnidadeVenda(String unidadeVenda) throws ModelBuilderException{
        if(unidadeVenda == null || unidadeVenda.equals(""))
            throw new ModelBuilderException("Unidade de compra está vazia!");

        this.unidadeVenda = unidadeVenda;
        
        return this;
    }

    public ProductBuilder setFatorConversao(int fatorConversao) throws ModelBuilderException{
        if(fatorConversao < 0)
            throw new ModelBuilderException("Fator de conversão é menor que 0");

        this.fatorConversao = fatorConversao;
        
        return this;
    }

    public ProductBuilder setStatus(char status) throws ModelBuilderException{
        if(("" + status).equals(""))
            throw new ModelBuilderException("Valor de status é inválido!");

        this.status = status;
        
        return this;
    }

    public ProductBuilder setBarraEntrada(String barraEntrada) throws ModelBuilderException{
        if(barraEntrada == null)
            throw new ModelBuilderException("Barra de entrada está definida como nula!");

        this.barraEntrada = barraEntrada;
        
        return this;
    }

    public ProductBuilder setBarraSaida(String barraSaida) throws ModelBuilderException{
        if(barraSaida == null)
            throw new ModelBuilderException("Barra de entrada está definida como nula!");

        this.barraSaida = barraSaida;
        
        return this;
    }

    public ProductBuilder setEstoqueMinimo(float estoqueMinimo) throws ModelBuilderException{
        if(estoqueMinimo < 0)
            throw new ModelBuilderException("Estoque minimo precisa ser maior que 0!");

        this.estoqueMinimo = estoqueMinimo;
        
        return this;
    }

    public ProductBuilder setEstoqueMaximo(float estoqueMaximo) throws ModelBuilderException{
        if(estoqueMaximo < 0)
            throw new ModelBuilderException("Estoque maximo precisa ser maior que 0!");

        this.estoqueMaximo = estoqueMaximo;
        
        return this;
    }

    public ProductBuilder setClasse(Class classe) throws ModelBuilderException{
        if(classe == null)
            throw new ModelBuilderException("Classe não foi definida!");

        this.classe = classe;
        
        return this;
    }

    public ProductBuilder setMarca(Brand marca) throws ModelBuilderException{
        if(marca == null)
            throw new ModelBuilderException("Marca não foi definida!");

        this.marca = marca;
        
        return this;
    }

    
    @Override
    public Product build() {
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
           this.id
        );
    }
    
}
