package com.aacs.pack;

public class Venda {
    private final Item item;
    private final int quantidade;
    
    public Venda(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }
    
    public void realizar() {
        System.out.println("Realizando venda de " + quantidade + " unidade(s) de " + item.getNome() + ".");
        item.reduzirEstoque(quantidade);
    }
}
