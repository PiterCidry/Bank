/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Piotrek
 */
enum okres
{
    ROCZNA, POLROCZNA, TRZYMIESIECZNA
}
public class Lokata extends Konto implements IOprocentowalny
{
    private okres okres;
    private long numer;
    private static int numerostatni = 499;
    private double oprocentowanie;
    private static double[] oprocentowania = new double[] {1.5, 1.2, 1};
    
    public double getOprocentowanie()
    {
        return oprocentowanie;
    }

    public void setOprocentowanie(double oprocentowanie) 
    {
        if(okres == okres.POLROCZNA)
        {
            this.oprocentowanie = oprocentowania[1];
        }
        else if(okres == okres.ROCZNA)
        {
            this.oprocentowanie = oprocentowania[0];
        }
        else
        {
            this.oprocentowanie = oprocentowania[2];
        }
    }

    public okres getOkres() 
    {
        return okres;
    }

    public void setOkres(okres okres) 
    {
        this.okres = okres;
    }

    public long getNumer() 
    {
        return numer;
    }

    public void setNumer(long numer)
    {
        this.numer = numer;
    }

    public double[] getOprocentowania()
    {
        return oprocentowania;
    }

    public void setOprocentowania(double[] oprocentowania)
    {
        this.oprocentowania = oprocentowania;
    }
    
    public Lokata(okres okres, Wlasciciel w, double wplata)
    {
        super(w);
        this.setSaldo(wplata);
        this.okres = okres;
        if(okres == okres.POLROCZNA)
        {
            this.oprocentowanie = oprocentowania[1];
        }
        else if(okres == okres.ROCZNA)
        {
            this.oprocentowanie = oprocentowania[0];
        }
        else
        {
            this.oprocentowanie = oprocentowania[2];
        }
        this.numer = (numerostatni + 1);
        numerostatni++;
    }

    @Override
    public String toString()
    {
        return "Lokata nr: "+this.numer+"\n"+super.getWlasciciel().toString()+"\nOprocentowanie: "+this.oprocentowanie+"\nOkres: "+this.okres+"\nSaldo: "+String.format("%.2f",this.getSaldo())+" zł";
    }

    @Override
    public void Oprocentuj()
    {
        if(this.okres == okres.POLROCZNA)
        {
            double poczatkowe = this.getSaldo();
            double mnoznik = Math.pow((1+(this.oprocentowanie/100)/2), (this.oprocentowanie)*2);
            this.setSaldo(poczatkowe*mnoznik);
        }
        else if(this.okres == okres.ROCZNA)
        {
            double poczatkowe = this.getSaldo();
            double mnoznik = Math.pow((1+(this.oprocentowanie/100)/1), (this.oprocentowanie)*1);
            this.setSaldo(poczatkowe*mnoznik);
        }
        else
        {
            double poczatkowe = this.getSaldo();
            double mnoznik = Math.pow((1+(this.oprocentowanie/100)/4), (this.oprocentowanie)*4);
            this.setSaldo(poczatkowe*mnoznik);
        }
    }
 }
