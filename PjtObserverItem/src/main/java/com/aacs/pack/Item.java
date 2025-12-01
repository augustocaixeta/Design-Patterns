package com.aacs.pack;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private final String nome;
    private int estoque;
    private final List<ItemObserver> observers = new ArrayList<>();
    
    public Item(String nome, int estoqueInicial) {
        this.nome = nome;
        this.estoque = estoqueInicial;
    }
    
    public void adicionarObserver(ItemObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(ItemObserver observer) {
        observers.remove(observer);
    }
    
    public void reduzirEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade menor ou igual a 0.");
        }
        
        if (quantidade > estoque) {
            throw new IllegalArgumentException("Quantidade maior que o estoque.");
        }
        
        this.estoque -= quantidade;
        System.out.println("[REDUÇÃO] O estoque do item '" + nome + "' agora é: " + estoque);
        notificarObservers();
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    private void notificarObservers() {
        for (ItemObserver obs : observers) {
            obs.onEstoqueAlterado(this);
        }
    }
}
