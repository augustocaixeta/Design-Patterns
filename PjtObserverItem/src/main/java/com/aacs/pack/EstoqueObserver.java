package com.aacs.pack;

public class EstoqueObserver implements ItemObserver {
    @Override
    public void onEstoqueAlterado(Item item) {
        if (item.getEstoque() <= 5) {
            System.out.println("[ALERTA] Estoque baixo do item '" + item.getNome()
                    + "' -> " + item.getEstoque() + " unidades.");
        }
    }
}
