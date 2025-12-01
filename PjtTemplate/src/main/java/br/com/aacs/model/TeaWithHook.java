package br.com.aacs.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
    
    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
    
    @Override
    public boolean customerWantsCondiments() {
        String ans = getUserInput();
        return ans.toLowerCase().startsWith("y");
    }
    
    public String getUserInput() {
        String ans = null;
        System.out.println("Would you like milk and sugar with your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            ans = in.readLine();
        } catch (IOException ex) {
            System.out.println("IO error trying to read your answer");
        }
        
        if (ans == null) {
            return "no";
        }
        
        return ans;
    }
}
