package carrera;
import java.util.ArrayList;

import conductor.Conductor;
import poolConductores.PoolConductores;
import tarifa.Tarifa;

public class Carrera {
	
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0d;
	private int tiempoEsperado = 0;

	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
		
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
		
	}

	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.tiempoEsperado = tiempoEsperadoMinutos;
		
	}

	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}

	public String getOrigen() {
		return this.origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public double getDistancia() {
		return this.distancia;
	}
	
	public int getTiempoEstimado() {
		return this.tiempoEsperado;
	}

	public Object getCosteEsperado() {
		return Tarifa.getCosteTotal(this);
	}

	public void asignarConductor(ArrayList<Conductor> conductores) {
		PoolConductores poolConductores = new PoolConductores(conductores);
		poolConductores.asignarConductor();
	}
	
	
}
