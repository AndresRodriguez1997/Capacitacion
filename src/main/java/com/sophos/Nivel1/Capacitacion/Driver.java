package com.sophos.Nivel1.Capacitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Driver {
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	/**public Driver() {
		
	}
	*/
	public void lanzarNavegador(String navegador) {
		navegador = navegador.toLowerCase();
		
		switch (navegador) {
		case "google":
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":			
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
			String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe";
	        System.setProperty("webdriver.ie.driver", rutaDriver);
	        InternetExplorerOptions options = new InternetExplorerOptions();
	        options.ignoreZoomSettings();
	        options.introduceFlakinessByIgnoringSecurityDomains();
	        options.enablePersistentHovering();
	        options.disableNativeEvents();
	        WebDriver driver = new InternetExplorerDriver(options);
	        break;
		default:
			break;
		}
	}
	
	//Method lanzarNavegador
	public void navegarA(String url) {
		driver.get(url);
	}
	
	public void cierreNavegador() {
		driver.close();
	}
	
	/**public void navegadorGoogle() {
		
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.close();
		
	}
	
	public void navegadorFireFox() {
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", rutaDriver);
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
		
		driver.close();
		
	}
	
	public void navegadorInternetExplore() {
        String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", rutaDriver);
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.introduceFlakinessByIgnoringSecurityDomains();
        options.enablePersistentHovering();
        options.disableNativeEvents();
        WebDriver driver = new InternetExplorerDriver(options);
        driver.get("https://www.google.com/");
        WebElement elemento = driver.findElement(By.name("q"));
        System.out.println("Se ejecuta acá");
        driver.close();
        System.out.println("Por ultimo se ejecuta acá");
        
    }
	*/
}
