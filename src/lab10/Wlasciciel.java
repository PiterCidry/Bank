package lab10;


import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 284099
 */
public class Wlasciciel implements Serializable
{
    private String nazwa;
    private String ulica;
    private String kod;
    private String miejscowosc;

    public String getNazwa() 
    {
        return nazwa;
    }

    public void setNazwa(String nazwa) throws IllegalFormatException
    {
        if(nazwa.length() <= 3)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.nazwa = nazwa;
        }
    }

    public String getUlica()
    {
        return ulica;
    }

    public void setUlica(String ulica)throws IllegalFormatException
    {
        if(ulica.length() <= 3)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.ulica = ulica;
        }
    }

    public String getKod()
    {
        return kod;
    }

    public void setKod(String kod) throws IllegalFormatException
    {
        String pattern = "\\d{2}\\-\\d{3}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(kod);
        if(m.matches())
        {
            this.kod = kod;
        }
        else
        {
            throw new IllegalFormatException("Blad! Podany kod nie jest zgodny!");
        }
    }

    public String getMiejscowosc() 
    {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) throws IllegalFormatException
    {
        if(miejscowosc.length() <= 3)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.miejscowosc = miejscowosc;
        }
    }

    public Wlasciciel() 
    {
        this.nazwa = null;
        this.ulica = null;
        this.kod = null;
        this.miejscowosc = null;
    }

    public Wlasciciel(String nazwa, String ulica, String kod, String miejscowosc) throws IllegalFormatException
    {
        if(miejscowosc.length() <= 3)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.miejscowosc = miejscowosc;
        }
        if(nazwa.length() <= 3)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.nazwa = nazwa;
        }
        if(ulica.length() <= 3)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.ulica = ulica;
        }
        String pattern = "\\d{2}\\-\\d{3}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(kod);
        if(m.matches())
        {
            this.kod = kod;
        }
        else
        {
            throw new IllegalFormatException("Blad! Podany kod nie jest zgodny!");
        }
    }

    @Override
    public String toString() 
    {
        return "Wlasciciel: "+this.nazwa;
    }
    
}
