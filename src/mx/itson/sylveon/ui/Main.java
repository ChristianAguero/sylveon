/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.sylveon.ui;

import mx.itson.sylveon.excepciones.HexadecimalException;
import mx.itson.sylveon.negocio.Operacion;

/**
 *
 * @author Christian
 */
public class Main {
 
    public static void main(String[] args) throws HexadecimalException {
        
        String hexadecimal = "A3F";
        int decimal = 0;
        
        try{
            
            decimal = Operacion.pasarADecimal(hexadecimal);
        
        }catch(HexadecimalException ex){
            
            System.err.println(ex.getMessage());
            
        }
        
        System.out.println(decimal);
                
    }
    
}
