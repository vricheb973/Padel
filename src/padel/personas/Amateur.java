package padel.personas;

public class Amateur extends Jugador {
	
	private String puntoDebil;

	public Amateur(String nombre, String apellidos, String dni, int codSocio, String puntoDebil) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoDebil = puntoDebil;
	}

	public String getPuntoDebil() {
		return puntoDebil;
	}

	public void setPuntoDebil(String puntoDebil) {
		this.puntoDebil = puntoDebil;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Amateur [nombre=" + this.getNombre() 
		+ ", apellidos=" + this.getApellidos() 
		+ ", dni=" + this.getDni() 
		+ ", codSocio=" + this.getCodSocio() 
		+ ", puntoDebil=" + this.puntoDebil + "]";
	}

}
