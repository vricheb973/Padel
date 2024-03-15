package padel.personas;

public abstract class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		setDni(dni);
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(dni.length() != 9) {
			throw new IllegalArgumentException("El DNI debe tener exactamente 9 caracteres. ");
		}
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		Persona otra = (Persona) obj;
		boolean result = false;
		
		if(this.dni.equals(otra.dni)) {
			result = true;
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", dni=" + this.dni + "]";
	}
	
	public abstract void mostrarInformacion();

}
