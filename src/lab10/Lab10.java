/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author 284099
 */
public class Lab10 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalFormatException, BrakPieniedzyException
    {
        Wlasciciel w1 = new Wlasciciel();
        System.out.println("Lab10_Zad1:");
        try
        {
            w1.setKod("41-922");
            w1.setMiejscowosc("Radzionkow");
            w1.setUlica("Szymaly 12");
            w1.setNazwa("Piotr Gretszel");
            System.out.println(w1.toString());
        }
        catch(IllegalFormatException e)
        {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nLab10_Zad2:");
        Konto k1 = new Konto(w1);
        System.out.println(k1.toString());
        
        System.out.println("\nLab10_Zad3:");
        Wlasciciel w2 = new Wlasciciel("Michal Wronski", "Sadowa", "41-922", "Radzionkow");
        Wlasciciel w3 = new Wlasciciel("Jan Robak", "Studzienna", "41-543", "Krakow");
        Konto k2 = new Konto(w2);
        Konto k3 = new Konto(w3);
        k1.Wplac(50);
        k2.Wplac(70);
        k3.Wplac(300);
        System.out.println("Czy mozna wyplacic z k1 170?: "+k1.MoznaWyplacic(170));
        //k1.Wyplac(170);
        k2.Wyplac(60);
        //Konto.Przelej(k2, k1, 220);
        Konto.Przelej(k3, k2, 200);
        System.out.println(k1.toString());
        System.out.println(k2.toString());
        System.out.println(k3.toString());
        
        System.out.println("\nLab10_Zad4:");
        Bank b1 = new Bank("Bank AGH");
        b1.UtworzKonto(k1);
        b1.UtworzKonto(k2);
        Bank b2 = new Bank("Bank POLSL");
        b2.UtworzKonto(k1);
        b2.UtworzKonto(k2);
        b2.UtworzKonto(k3);
        //b2.UsunKonto(k2);
        b2.PodajKonto("Jan Robak");
        b1.PodajKonto(101);
        System.out.println("Saldo banku "+b1.getNazwa()+" "+b1.SaldoBanku()+"zł");
        System.out.println("Saldo banku "+b2.getNazwa()+" "+b2.SaldoBanku()+"zł");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        System.out.println("\nLab10_Zad5:");
        Lokata l1 = new Lokata(okres.POLROCZNA, w1, 100);
        Lokata l2 = new Lokata(okres.ROCZNA, w2, 200);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        
        System.out.println("\nLab11_Zad1:");
        System.out.println(b1.WyswietlWgSald());
        System.out.println(b2.WyswietlWgSald());
        
        System.out.println("\nLab11_Zad2:");
        System.out.println(b1.WyswietlWgNazw());
        System.out.println(b2.WyswietlWgNazw());
        
        System.out.println("\nLab11_Zad3:");
        System.out.println(l1.toString());
        l1.Oprocentuj();
        System.out.println(l1.toString());
        
        System.out.println("\nLab11_Zad4:");
        Path currentPath = Paths.get("");
        String path = currentPath.toAbsolutePath().toString();
        b1.Zapisz("bank1");
        b2.Zapisz("bank2");
        Bank b3 = new Bank();
        
        b3 = (Bank)b3.Odczytaj(path+"/Lab10/bank1.bin");
        Bank b4 = new Bank();
        b4 = (Bank)b4.Odczytaj(path+"/Lab10/bank2.ser");
        System.out.println(b3.toString());
        System.out.println(b4.toString());
    }
}
