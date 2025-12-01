package br.com.aacs.main;

import br.com.aacs.interfaces.MenuComponent;
import br.com.aacs.model.Menu;
import br.com.aacs.model.MenuItem;
import br.com.aacs.model.Waitress;

public class Main {
    public static void main(String[] args) {
        Menu dinerMenu = new Menu("DINER MENU", "Lunch");
        Menu coffeeMenu = new Menu("COFFEE MENU", "Stuff to go with you aftermon coffee");
        Menu allMenus = new Menu("ALL MENUS", "All menus combined");
        
        allMenus.add(dinerMenu);
        allMenus.add(coffeeMenu);
        
        dinerMenu.add(new MenuItem(
                "Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                3.05,
                false
        ));
        
        dinerMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                1.99,
                true
        ));
        
        coffeeMenu.add(new MenuItem(
                "Coffee Cake",
                "Crumbly cake topped with cinnamon and walnuts",
                1.59,
                false
        ));
        
        Waitress waitress = new Waitress(allMenus);
        waitress.print();
    }
}
