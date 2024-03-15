package padel.personas;

public class Empleado extends Persona {
	
	private int codEmpleado;

	public Empleado(String nombre, String apellidos, String dni, int codEmpleado) {
		super(nombre, apellidos, dni);
		this.codEmpleado = codEmpleado;
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	
	@Override
	public boolean equals(Object obj) {
		Empleado otra = (Empleado) obj;
		boolean result = false;
		
		if(this.getDni().equals(otra.getDni())) {
			result = true;
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + this.getNombre() 
		+ ", apellidos=" + this.getApellidos() 
		+ ", dni=" + this.getDni() 
		+ ", codEmpleado=" + this.codEmpleado + "]";
	}

	@Override
	public void mostrarInformacion() {
		
		System.out.println(this.toString());
		
	}

}
