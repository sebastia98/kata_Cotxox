package tarifa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarifaTest {

	@Test
	public void costes() {
		assertEquals(Tarifa.getCosteDistancia(10.0), 13.5, 0.0);
		assertEquals(Tarifa.getCosteMinuto(10), 3.5, 0.0);
	}
	/*CosteTotal comprobado con el test de carrera de costeTotalEsperado*/
}
