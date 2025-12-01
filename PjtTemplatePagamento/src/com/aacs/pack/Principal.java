package com.aacs.pack;

public class Principal {
    public static void main(String[] args) {

        ProcessadorPagamento cartao = new PagamentoCartao();
        ProcessadorPagamento pix = new PagamentoPix();
        ProcessadorPagamento boleto = new PagamentoBoleto();

        System.out.println("=== CARTÃO ===");
        cartao.processar(150.00);

        System.out.println("\n=== PIX ===");
        pix.processar(250.00);

        System.out.println("\n=== BOLETO ===");
        boleto.processar(300.00);
    }
}
