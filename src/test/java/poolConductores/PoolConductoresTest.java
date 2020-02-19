package poolConductores;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import conductor.Conductor;

public class PoolConductoresTest {

	@Test
	public void test() {
		ArrayList<Conductor> poolConductores = new ArrayList<>();
		Conductor conductor = null;
		String[] nombres = { "Samantha", "Fox", "Mola" };
		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}
		String[] matricula = { "4ABC123", "5DHJ444", "7JKK555" };
		String[] modelos = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

		int index = 0;
		for (Conductor conductora : poolConductores) {
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			conductora.setValoracion((byte) 4);
			index++;
		}
		PoolConductores conductores = new PoolConductores(poolConductores);
		conductores.getPoolConductores().equals(poolConductores);
	}
	
	

}
