/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author lenovo
 */
public class Szynka implements Dodatki{
    private Pizza pizza;
    @Override
    public void rozmiar(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String nazwa(){
        return pizza.nazwa()+" z szynką";
    }
    @Override
    public int cena(){
        return pizza.cena()+3;
    }
    public Szynka(Pizza pizza){
        this.pizza = pizza;
    }
}
