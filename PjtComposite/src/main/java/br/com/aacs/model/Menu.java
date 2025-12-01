package br.com.aacs.model;

import br.com.aacs.interfaces.Composite;
import br.com.aacs.interfaces.MenuComponent;

import java.util.ArrayList;

public class Menu implements MenuComponent, Composite {
    protected ArrayList<MenuComponent> menuComponents;
    protected String name;
    protected String description;
    
    public Menu(String name, String description) {
        this.menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + name + " - (" + description + "):\n");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
