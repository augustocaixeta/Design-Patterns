package br.com.aacs.main;

import br.com.aacs.model.Coffee;
import br.com.aacs.model.CoffeeWithHook;
import br.com.aacs.model.Tea;
import br.com.aacs.model.TeaWithHook;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
            
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
        
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        
        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();
        
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
