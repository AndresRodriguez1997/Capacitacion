package com.sophos.Nivel1.Capacitacion;

public class Vehiculo {
	
	
	//Atributos
	int CantidadLlantas;
	String TipoFuenteEnergia;
	
	
	//Metodos get
	public int CantidadLlantas() {
		return CantidadLlantas;
	}
	public String TipoFuenteEnergia() {
		return TipoFuenteEnergia;
	}
	
	//Metodos set
	public void CantidadLlantas(int CantidadLlantas) {
		this.CantidadLlantas = CantidadLlantas;
	}
	
	public void TipoFuenteEnergia(String TipoFuenteEnergia) {
		this.TipoFuenteEnergia = TipoFuenteEnergia;
	}

}
