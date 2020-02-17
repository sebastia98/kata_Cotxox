package carrera;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarreraTest {

	@Test
	public void crearCarreraTest() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		assertEquals(carrera.getOrigen(), origen);
		assertEquals(carrera.getDestino(), destino);
		assertEquals(carrera.getDistancia(), distancia, 0);
		assertEquals(carrera.getTiempoEstimado(), tiempoEsperadoMinutos, 0);
		assertEquals(carrera.getTarjetaCredito(), tarjetaCredito);
		
	}

}
