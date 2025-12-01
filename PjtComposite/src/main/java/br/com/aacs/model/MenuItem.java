package br.com.aacs.model;

import br.com.aacs.interfaces.MenuComponent;
import br.com.aacs.interfaces.Priced;

public class MenuItem implements MenuComponent, Priced {
    protected String name;
    protected String description;
    protected double cost;
    protected boolean vegetarian;
    
    public MenuItem(String name, String description, double cost, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.vegetarian = vegetarian;
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
    public double getCost() {
        return cost;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print(name);
        if (vegetarian) {
            System.out.print(" (V)");
        }
        
        System.out.println(", R$ " + cost + " - (" + description + ")");
    }
}
