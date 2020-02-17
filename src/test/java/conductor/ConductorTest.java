package conductor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConductorTest {

	@Test
	public void crearConductorTest() {
		Conductor conductor = new Conductor("Joan");
		conductor.setMatricula("12345");
		conductor.setModelo("Audi");
		conductor.setValoracion((byte) 4);
		assertEquals(conductor.getNombre(), "Joan");
		assertEquals(conductor.getMatricula(), "12345");
		assertEquals(conductor.getModelo(), "Audi");
		assertEquals(conductor.getValoracion(), (byte) 4);
	}
}
