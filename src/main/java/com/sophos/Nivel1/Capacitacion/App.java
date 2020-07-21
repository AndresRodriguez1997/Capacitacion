package com.sophos.Nivel1.Capacitacion;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ){
    	App obj = new App();
    	obj.paginaMercadoLibre();
    	
    }
    
    public void paginaMercadoLibre() {
    	WebDriver driverLocal;
    	Driver objDriver = new Driver();
    	objDriver.lanzarNavegador("GOOGLE");
    	objDriver.navegarA("https://www.mercadolibre.com.co/");
    	WebElement cajaTexto= objDriver.getDriver().findElement(By.name("as_word"));
    	cajaTexto.sendKeys("Sillas gamer");
    	cajaTexto.submit();
    	
    	try {
    		Thread.sleep(5000);
    	} catch (Exception e) {
    		
    	}
    	
//    	List<WebElement> listaElementos = objDriver.getDriver()
//    			.findElements(By.className("objDriver.getDriver()"));
//    	
//    	System.out.println("Cantidad elementos encontrados " + listaElementos.size());
    	
    	
    	objDriver.cierreNavegador();
    }
    
    public void clase9() {
    	Ordenamiento objOrde = new Ordenamiento();
    	int arreglo [] = {7,5,9,41,74,2,47,34,12};
    	objOrde.OrdenamientoBurbuja(arreglo);
    	
    	for(int i = 0; i < arreglo.length; i++) {
    		System.out.println("{" + arreglo[i] + "},");    		
    	}
    }
    
    public void clase8_2() {
    	Driver objDriver = new Driver();
    	objDriver.lanzarNavegador("google");
    	objDriver.navegarA("https://www.google.com/");
    	
    	WebElement cajaTexto = objDriver.getDriver().findElement(By.name("q"));
    	cajaTexto.sendKeys("sophos chronus");
    	cajaTexto.submit();
    	
    	try{
    		Thread.sleep(5000);
    	} catch (Exception e) {
    		System.out.println("Fallo en la espera");
    	}
    	
    	objDriver.cierreNavegador();
    }
    public void clase8() {
    	Driver objDriver = new Driver();
    	objDriver.lanzarNavegador("google");
    	objDriver.navegarA("https://www.google.com/");
    	
    	WebElement cajaTexto = objDriver.getDriver().findElement(By.name("q"));
    	cajaTexto.sendKeys("html");
    	
    	WebElement cajaTexto2 = objDriver.getDriver().findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
    	cajaTexto2.sendKeys(" 5");
    	cajaTexto2.submit();
    	
    	ArrayList<WebElement> listaElemento = (ArrayList<WebElement>) objDriver.getDriver().findElements(By.className("LC20lb DKV0Md"));
    	for (WebElement elemento : listaElemento) {
    		System.out.println(elemento.getText());
    	}
    	
    	//WebElement botonBuscar = objDriver.getDriver().findElement(By.name("btnk"));
    	//botonBuscar.click();
    	
    	try{
    		Thread.sleep(5000);
    	} catch (Exception e) {
    		System.out.println("Fallo en la espera");
    	}
    	
    	objDriver.cierreNavegador();
    	//objDriver.navegadorGoogle();
    	//objDriver.navegadorInternetExplore();
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
