package lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 284099
 */
public class IllegalFormatException extends Exception 
{
    public IllegalFormatException() 
    {
        super();
    }

    public IllegalFormatException(String message) 
    {
        super(message + " Nieprawidlowy format!");
    }
}
