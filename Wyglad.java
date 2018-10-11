/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class Wyglad extends JFrame{
    private JLabel banner;
    private JLabel size;
    private JRadioButton small;
    private JRadioButton medium;
    private JRadioButton big;
    private ButtonGroup grupa;
    private JLabel dodatki;
    private JCheckBox ser;
    private JCheckBox szynka;
    private JCheckBox pieczarki;
    private JCheckBox oliwki;
    private JCheckBox ketchub;
    private JButton zamow;
    private JLabel suma;
    private Pizza pizza;
    public Wyglad(){
        setTitle("Program do zamawiania pizzy");
        setSize(600,550);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        banner = new JLabel(new ImageIcon("obraz\\BanerPizza.png"));
        banner.setBounds(30, 0, 600, 200);
        add(banner);
        size = new JLabel("Wybierz rozmiar pizzy: ");
        size.setBounds(200,210,600,50);
        add(size);
        small = new JRadioButton("Mała pizza 6 zł");
        small.setBounds(50, 250, 150, 50);
        medium = new JRadioButton("Średnia pizza 10 zł");
        medium.setBounds(200,250,150,50);
        big = new JRadioButton("Duża pizza 12 zł");
        big.setBounds(370, 250, 150, 50);
        big.setSelected(true);
        grupa = new ButtonGroup();        
        grupa.add(small);
        grupa.add(medium);
        grupa.add(big);  
        add(small);
        add(medium);
        add(big);
        dodatki = new JLabel("Wybierz dodatki do pizzy: ");
        dodatki.setBounds(200,300,600,50);
        add(dodatki);
        ser = new JCheckBox("Ser 2 zł");
        ser.setBounds(30,350,100,50);
        add(ser);
        szynka = new JCheckBox("Szynka 3 zł");
        szynka.setBounds(130,350,100,50);
        add(szynka);
        pieczarki = new JCheckBox("Pieczarki 2 zł");
        pieczarki.setBounds(240, 350, 100, 50);
        add(pieczarki);
        oliwki = new JCheckBox("Oliwki 5 zł");
        oliwki.setBounds(360,350,100,50);
        add(oliwki);
        ketchub = new JCheckBox("Ketchub 1 zł");
        ketchub.setBounds(470, 350, 100, 50);
        add(ketchub);
        zamow = new JButton("Zamów");
        zamow.setBounds(430, 410, 150, 50);
        zamow.addActionListener(new Suma());
        add(zamow);
        suma = new JLabel("15 100");
        suma.setBounds(250,450,100,50);
        add(suma);
        setVisible(true);
    }
    class Suma implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(small.isSelected()) pizza = new PizzaMala();
            if(medium.isSelected()) pizza = new PizzaSrednia();
            if(big.isSelected()) pizza = new PizzaDuza();
            if(ser.isSelected()) pizza = new Ser(pizza);
            if(szynka.isSelected()) pizza = new Szynka(pizza);
            if(pieczarki.isSelected()) pizza = new Pieczarki(pizza);
            if(oliwki.isSelected()) pizza = new Oliwki(pizza);
            if(ketchub.isSelected()) pizza = new Ketchub(pizza);
            Integer in = pizza.cena();
            suma.setText(in.toString());
        }        
    }
}
