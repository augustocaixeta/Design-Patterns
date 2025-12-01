package br.com.aacs.main;

import br.com.aacs.interfaces.Duck;
import br.com.aacs.interfaces.Turkey;
import br.com.aacs.model.MallardDuck;
import br.com.aacs.model.TurkeyAdapter;
import br.com.aacs.model.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        Turkey t = new WildTurkey();
        
        Duck turkeyAdapter = new TurkeyAdapter(t);
        System.out.println("The turkey says...");
        t.gobble();
        t.fly();
        
        System.out.println("\nThe duck says...");
        d.quack();
        d.fly();
        
        System.out.println("\nThe Turkey adapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
