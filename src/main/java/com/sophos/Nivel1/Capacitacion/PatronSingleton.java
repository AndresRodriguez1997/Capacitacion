package com.sophos.Nivel1.Capacitacion;

public class PatronSingleton {
	
	private String nombre;
	
	private static PatronSingleton objInstancia;
	
	private PatronSingleton(String nombre) {
		this.nombre = nombre;
	}
	
	public static PatronSingleton getInstancia(String nombre) {
		if(objInstancia == null) {
			synchronized (PatronSingleton.class) {
				if(objInstancia == null) {
					objInstancia = new PatronSingleton(nombre);
				}
			}
		}
		return objInstancia;
	}

	public String getNombre() {
		return nombre;
	}

}
