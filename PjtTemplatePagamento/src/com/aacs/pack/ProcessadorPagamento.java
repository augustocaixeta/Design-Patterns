package com.aacs.pack;

public abstract class ProcessadorPagamento {

    // Template Method (não pode ser sobrescrito)
    public final void processar(double valor) {
        validarDados();
        autenticar();
        executarPagamento(valor);  // passo variável
        enviarRecibo();
    }

    protected void validarDados() {
        System.out.println("Validando dados do pagamento...");
    }

    protected void autenticar() {
        System.out.println("Autenticando usuário...");
    }

    // MÉTODO ABSTRATO → varia conforme o tipo de pagamento
    protected abstract void executarPagamento(double valor);

    protected void enviarRecibo() {
        System.out.println("Enviando recibo ao cliente.");
    }
}
