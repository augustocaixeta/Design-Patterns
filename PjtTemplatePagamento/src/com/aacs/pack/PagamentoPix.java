package com.aacs.pack;

public class PagamentoPix extends ProcessadorPagamento {
    @Override
    protected void executarPagamento(double valor) {
        System.out.println("Realizando pagamento de R$" + valor + " via PIX...");
    }
}
