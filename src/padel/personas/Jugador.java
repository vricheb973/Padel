package padel.personas;

public abstract class Jugador extends Persona {
	
	private int codSocio;

	public Jugador(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni);
		this.codSocio = codSocio;
	}

	public int getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}
	
	@Override
	public boolean equals(Object obj) {
		Jugador otra = (Jugador) obj;
		boolean result = false;
		
		if(this.getDni().equals(otra.getDni())) {
			result = true;
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + this.getNombre() 
		+ ", apellidos=" + this.getApellidos() 
		+ ", dni=" + this.getDni() 
		+ ", codSocio=" + this.codSocio + "]";
	}

}
