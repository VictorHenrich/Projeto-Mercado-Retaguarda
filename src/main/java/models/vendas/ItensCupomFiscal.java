package models.vendas;

import java.util.ArrayList;
import java.util.UUID;
import models.produtos.HistoricoMovimentacao;
import models.produtos.Produto;


public class ItensCupomFiscal {
    private UUID uuid;
    private float quantidadeProdutos;
    private float valorUnitarioProduto;
    private char status;
    private CupomFiscal cupomFiscal;
    private ArrayList<HistoricoMovimentacao> historicosMovimentacao;
    private Produto produto;

    public ItensCupomFiscal(UUID uuid, float quantidadeProdutos, float valorUnitarioProduto, char status, CupomFiscal cupomFiscal, Produto produto) {
        this.uuid = uuid;
        this.quantidadeProdutos = quantidadeProdutos;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.produto = produto;
        this.historicosMovimentacao = new ArrayList();
    }
}
