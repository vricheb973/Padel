package padel.personas;

public class Profesional extends Jugador {
	
	private String puntoFuerte;

	public Profesional(String nombre, String apellidos, String dni, int codSocio, String puntoFuerte) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoFuerte = puntoFuerte;
	}

	public String getPuntoFuerte() {
		return puntoFuerte;
	}

	public void setPuntoFuerte(String puntoFuerte) {
		this.puntoFuerte = puntoFuerte;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Profesional [nombre=" + this.getNombre() 
		+ ", apellidos=" + this.getApellidos() 
		+ ", dni=" + this.getDni() 
		+ ", codSocio=" + this.getCodSocio() 
		+ ", puntoFuerte=" + this.puntoFuerte + "]";
	}

}
