/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.sylveon.negocio;

import mx.itson.sylveon.excepciones.HexadecimalException;

/**
 *
 * @author Christian
 */
public class Operacion {
    
    public static int pasarADecimal (String numero)throws HexadecimalException{
            
        String number = numero.toUpperCase();
        char[] hex = number.toCharArray();
        int decimal = 0;
        
        for(int i = 0; i < hex.length; i++){
            
            if(hex[i] != '0' && hex[i] != '1' && hex[i] != '2' && hex[i] != '3' && hex[i] != '4' && hex[i] != '5' && hex[i] != '6' && hex[i] != '7' && hex[i] != '8' && hex[i] != '9' && hex[i] != 'A' && hex[i] != 'B' && hex[i] != 'C' && hex[i] != 'D' && hex[i] != 'E' && hex[i] != 'F'){
            
                throw new HexadecimalException("Solo se pueden ingresar numeros del 0 al 9 y letras de la A a la F para numeros hexadecimales");
            
            }

        }
        
        decimal = Integer.parseInt(numero, 16);
        
        return decimal;
        
    }
    
}

