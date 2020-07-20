package com.sophos.Nivel1.Capacitacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ){
    	Driver objDriver = new Driver();
    	objDriver.navegadorGoogle();
    	objDriver.navegadorInternetExplore();
    	
    }
    
    public void clase6_2() {
    	String ruta = "C:\\Users\\andres.rodriguez\\eclipse-workspace\\Capacitacion\\documentoEjemplo.txt";
    	Entradas_Salidas objIO = new Entradas_Salidas();
    	objIO.entradasPorConsola();
    	objIO.lecturaArchivo(ruta);
    }
    
    public void clase6(){
        
        WebDriver driver = new FirefoxDriver();
        driver.get("");
        
    }
    
    public void clase2() {
    	Carro carro = new Carro();
        carro.CantidadLlantas(4);
        carro.TipoFuenteEnergia("Gasolina");
        carro.Color("Azul");
        
        System.out.print ("El carro creado tiene las siguiente especificaciones: " + carro.CantidadLlantas() + ", " + carro.Color() + ", " + carro.TipoFuenteEnergia() + ".");      
        
    }
}
