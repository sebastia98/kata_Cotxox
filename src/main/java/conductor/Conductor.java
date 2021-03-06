package conductor;

public class Conductor {
	
	private final String nombre;
	private String matricula;
	private String modelo;
	private byte valoracion;
	private boolean ocupado = true;
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;	
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setValoracion(byte valoracion) {
		this.valoracion = valoracion;
	}
	/*public static void setOcupado() {
		ocupado = true;
	}*/
	public String getNombre() {
		return this.nombre;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public String getModelo() {
		return this.modelo;
	}
	public byte getValoracion() {
		return this.valoracion;
	}
	public boolean isOcupado() {
		return ocupado;
	}
}
