/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author 284099
 */
public class Konto implements Comparable<Konto>, Comparator<Konto>, Serializable
{
    private Wlasciciel wlasciciel;
    private double saldo;
    private long numer;
    private static long biezacy = 99;

    public Wlasciciel getWlasciciel() 
    {
        return wlasciciel;
    }

    public void setWlasciciel(Wlasciciel wlasciciel) 
    {
        this.wlasciciel = wlasciciel;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public long getNumer() 
    {
        return numer;
    }

    public void setNumer(long numer) 
    {
        this.numer = numer;
    }

    public static long getBiezacy() 
    {
        return biezacy;
    }

    public static void setBiezacy(long biezacy)
    {
        Konto.biezacy = biezacy;
    }
    public Konto()
    {
        this.wlasciciel = new Wlasciciel();
        this.saldo = 0;
        this.numer = (this.getBiezacy() +1);
        biezacy++;
    }
    public Konto(Wlasciciel w)
    {
        this.wlasciciel = w;
        this.saldo = 0;
        this.numer = (this.getBiezacy() + 1);
        biezacy++;
    }
    
    @Override
    public String toString() 
    {
        return "Numer konta: "+this.numer+"\n"+this.wlasciciel.toString()+" Stan Konta: "+String.format("%.2f", this.saldo)+" zł";
    }
    
    public void Wplac(double kwota)
    {
        this.saldo += kwota;
    }
    
    public boolean MoznaWyplacic(double kwota)
    {
        if(this.saldo >= kwota)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void Wyplac(double kwota) throws BrakPieniedzyException
    {
        if(MoznaWyplacic(kwota) == true)
        {
            this.saldo -= kwota;
        }
        else
        {
            throw new BrakPieniedzyException("Na koncie nie ma takiej kwoty!");
        }
    }
    
    public static void Przelej(Konto k1, Konto k2, double kwota) throws BrakPieniedzyException
    {
        if(k1.MoznaWyplacic(kwota) == true)
        {
            k1.saldo -= kwota;
            k2.saldo += kwota;
        }
        else
        {
            throw new BrakPieniedzyException("Na koncie nie ma takiej kwoty!");
        }
    }

    @Override
    public int compareTo(Konto k)
    {
        return Double.compare(this.saldo, k.saldo);
    }

    @Override
    public int compare(Konto o1, Konto o2) 
    {
        return o1.wlasciciel.getNazwa().compareTo(o2.wlasciciel.getNazwa());
    }
}
