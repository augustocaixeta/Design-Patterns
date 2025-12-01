package com.aacs.pack;

public class PagamentoBoleto extends ProcessadorPagamento {
    @Override
    protected void executarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor + "...");
    }
}
