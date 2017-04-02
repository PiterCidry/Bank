/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Piotrek
 */
public class Bank implements Serializable
{
    private String nazwa;
    private List<Konto> lista;

    public String getNazwa() 
    {
        return nazwa;
    }

    public void setNazwa(String nazwa) throws IllegalFormatException
    {
        if(nazwa.length() < 2)
        {
            throw new IllegalFormatException("Blad! Dlugosc co najmniej 3.");
        }
        else
        {
            this.nazwa = nazwa;
        }
    }

    public List<Konto> getLista() 
    {
        return lista;
    }

    public void setLista(List<Konto> lista) 
    {
        this.lista = lista;
    }

    public Bank(String nazwa) 
    {
        this.nazwa = nazwa;
        this.lista = new ArrayList<Konto>();
    }
    
    public Bank() 
    {
        this.nazwa = "";
        this.lista = new ArrayList<Konto>();
    }
    
    public void UtworzKonto(Konto k)
    {
        this.lista.add(k);
    }
    
    public void UsunKonto(Konto k)
    {
        this.lista.remove(k);
    }
    
    public Konto PodajKonto(long nrkonta)
    {
        Konto k = new Konto();
        if(!this.lista.isEmpty())
        {
            for(Konto ko : this.lista)
            {
                if(ko.getNumer() == nrkonta)
                {
                    k = ko;
                }
            }
        }
        return k;
    }
    
    public Konto PodajKonto(String nazwa)
    {
        Konto k = new Konto();
        if(!this.lista.isEmpty())
        {
            for(Konto ko : this.lista)
            {
                Wlasciciel w = ko.getWlasciciel();
                if(w.getNazwa().equals(nazwa))
                {
                    k = ko;
                }
            }
        }
        return k;
    }
    
    public double SaldoBanku()
    {
        double saldo = 0;
        for(Konto ko : this.lista)
        {
            saldo += ko.getSaldo();
        }
        return saldo;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nazwa banku: ").append(this.nazwa);
        sb.append("\nKonta:");
        this.lista.forEach((ko) ->
        {
            sb.append("\n").append(ko.toString());
        });
        return sb.toString();
    }
    
    public String WyswietlWgSald()
    {
        StringBuilder sb = new StringBuilder();
        this.lista.sort(Collections.reverseOrder((k1, k2) -> k1.compareTo(k2)));
        sb.append("Nazwa banku: ").append(this.nazwa);
        sb.append("\nKonta:");
        this.lista.forEach((ko) ->
        {
            sb.append("\n").append(ko.toString());
        });
        return sb.toString();
    }
    
    public String WyswietlWgNazw()
    {
        StringBuilder sb = new StringBuilder();
        this.lista.sort((k1, k2) -> k1.compare(k1, k2));
        sb.append("Nazwa banku: ").append(this.nazwa);
        sb.append("\nKonta");
        this.lista.forEach((ko) -> {
            sb.append("\n").append(ko.toString());
        });
        return sb.toString();
    }
    
    public void Zapisz(String nazwa)
    {
        try
        {
        Path currentPath = Paths.get("");
        String path = currentPath.toAbsolutePath().toString();
        FileOutputStream fileOut = new FileOutputStream(path+"/Lab10/"+nazwa+".bin");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(this);
        objectOut.close();
        fileOut.close();
        System.out.println("Zapisano obiekt do pliku "+path+"/Lab10/"+nazwa+".ser");
        }
        catch(FileNotFoundException i)
        {
            i.printStackTrace();
        }
        catch(IOException io)
        {
            io.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public Bank Odczytaj(String path)
    {
        try
        {
            FileInputStream fileInput = new FileInputStream(path);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            Bank b;
            b = (Bank)objectInput.readObject();
            objectInput.close();
            fileInput.close();
            System.out.println("Odczytano bank z pliku "+path);
            return b;
        }
        catch(FileNotFoundException i)
        {
            i.printStackTrace();
            return new Bank();
        }
        catch(IOException io)
        {
            io.printStackTrace();
            return new Bank();
        }
        catch(ClassNotFoundException cnf)
        {
            cnf.printStackTrace();
            return new Bank();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return new Bank();
        }
    }
}
