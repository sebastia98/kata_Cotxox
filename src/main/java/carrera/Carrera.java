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
	private Conductor conductor = null;
	private Object costeTotal = null;
	private double propina = 0d;

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
	/*a la carrera le pasas un conductor*/
	public void asignarConductor(PoolConductores conductores) {
		this.conductor = conductores.asignarConductor();
	}

	public Conductor getConductor() {
		return this.conductor;
	}

	public void realizarPago(Object costeEsperado) {
		costeTotal = costeEsperado;
	}

	public void recibirPropina(double propina) {
		this.propina = propina;
	}

	public double getPropina() {
		// TODO Auto-generated method stub
		return this.propina;
	}

	public Object getCosteTotal() {
		// TODO Auto-generated method stub
		return this.costeTotal;
	}

	/*public void liberarConductor() {
	 
	}*/	
}
