package tarifa;

import carrera.Carrera;

public class Tarifa {
	private final static double costeMilla = 1.35;
	private final static double costeMinuto = 0.35;
	private final static double costeMinimo = 5.0;
	private final static double porcentajeComision = 0.2;
	
	public static double getCosteDistancia(double distancia) {
		return costeMilla*distancia;
	}
	public static double getCosteMinuto(int minuto) {
		return costeMinuto*minuto;
	}
	public static Object getCosteTotal(Carrera carrera) {
		double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteMinuto(carrera.getTiempoEstimado());
		return costeTotal > costeMinimo ? costeTotal : "No supera el mínimo"; 
	}
	
}
