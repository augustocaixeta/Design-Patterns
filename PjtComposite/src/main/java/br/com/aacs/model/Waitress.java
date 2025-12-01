package br.com.aacs.model;

import br.com.aacs.interfaces.MenuComponent;

public class Waitress {
    private final MenuComponent menuComponent;
    
    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }
    
    public void print() {
        menuComponent.print();
    }
}
