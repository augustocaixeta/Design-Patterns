package com.aacs.pack;

public class Principal {
    public static void main(String[] args) {
        Item item = new Item("Teclado", 10);
        item.adicionarObserver(new EstoqueObserver());
        
        Venda v1 = new Venda(item, 3);
        v1.realizar();
        
        Venda v2 = new Venda(item, 4);
        v2.realizar();
    }
}
