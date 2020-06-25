/**
 * 
 */
package com.sophos.Nivel1.Capacitacion;

import java.util.Scanner;

/**
 * @author andres.rodriguez
 *
 */
public class VariablesCondicionales {

	/**
	 * @param args
	 */
	public static void main( String[] args )
    {
        System.out.println( "Programa para saber si una persona es mayor de edad o no." );
        System.out.println( "Digite un número." );
        
        //Leo una variable entera
        Scanner leer = new Scanner (System.in);
        
        int x = leer.nextInt();
        
        //Inicio la condicion 
        if (x < 1) {
        	System.out.println( "Usted ha digita un dato menor que cero, por favor empiece de nuevo." );//Se valida que digite una edad verdadera
        }else if (x < 18) {
        	System.out.println( "Usted es menor de edad" );//Se valida que es menor de edad
        }else 
        	System.out.println( "Usted es mayor de edad" );//Se valida que es mayor de edad
                
        System.out.println( "Su edad es:" + x + " años.");
        
    }
	
	public void Variables() {
		
		byte a = 1, b = 2;		
		short c = 3, d = 4;		
		int e = 3, f = 4;		
		long g = 5, h = 6;		
		float i = 7, j = 8;		
		double k = 9, l = 10;		
		boolean m = true, n = false;		
		char o = 14,  p = 12;
					
	}	
}
