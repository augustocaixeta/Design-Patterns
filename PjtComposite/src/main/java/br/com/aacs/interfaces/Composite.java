package br.com.aacs.interfaces;

public interface Composite {
    void add(MenuComponent menuComponent);
    void remove(MenuComponent menuComponent);
    MenuComponent getChild(int index);
}
