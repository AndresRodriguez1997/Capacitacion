package com.sophos.Nivel1.Capacitacion;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
                
        Carro carro = new Carro();
        carro.CantidadLlantas(4);
        carro.TipoFuenteEnergia("Gasolina");
        carro.Color("Azul");
        
        System.out.print ("El carro creado tiene las siguiente especificaciones: " + carro.CantidadLlantas() + ", " + carro.Color() + ", " + carro.TipoFuenteEnergia() + ".");      
        
    }
}
