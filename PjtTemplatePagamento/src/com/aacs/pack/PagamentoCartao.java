package com.aacs.pack;

public class PagamentoCartao extends ProcessadorPagamento {
    @Override
    protected void executarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " no cartão de crédito...");
    }
}
