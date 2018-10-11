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
public class PizzaMala implements Pizza{
    @Override
    public String nazwa(){
        return "Pizza Mała";
    }
    @Override
    public int cena(){
        return 6;
    }
}
