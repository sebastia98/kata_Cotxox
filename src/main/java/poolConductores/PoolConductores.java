package poolConductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import conductor.Conductor;

public class PoolConductores {
	
	private ArrayList<Conductor> poolConductores;
	
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	public ArrayList<Conductor> getPoolConductores() {
		return this.poolConductores;
	}
	public Conductor asignarConductor() {
		/*Conductor.setOcupado();*/
		return this.getPoolConductores().get(ThreadLocalRandom.current().nextInt(0, getPoolConductores().size()));	
	}
}
