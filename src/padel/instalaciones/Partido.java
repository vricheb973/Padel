package padel.instalaciones;

import java.time.LocalDate;

import padel.personas.Empleado;
import padel.personas.Jugador;

public class Partido {
	
	private int codigo;
	private Pista pista;
	private String descripcion;
	private Empleado empleado;
	private int numJugadores;
	private Jugador jugadores[];
	private LocalDate firmaEmpleado;
	private LocalDate firmaJugadores;

	private static int contCodigo = 1;
	
	public Partido(Pista pista, String descripcion, int numJugadores) {
		setNumJugadores(numJugadores);
		this.codigo = contCodigo++;
		this.pista = pista;
		this.descripcion = descripcion;
		this.jugadores = new Jugador[numJugadores];
		this.empleado = null;
		this.firmaEmpleado = null;
		this.firmaJugadores = null;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Pista getPista() {
		return pista;
	}

	public void setPista(Pista pista) {
		this.pista = pista;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		if(numJugadores < 2) {
			throw new IllegalArgumentException("Debe haber al menos dos jugadores. ");
		}
		this.numJugadores = numJugadores;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public LocalDate getFirmaEmpleado() {
		return firmaEmpleado;
	}

	public void setFirmaEmpleado(LocalDate firmaEmpleado) {
		this.firmaEmpleado = firmaEmpleado;
	}

	public LocalDate getFirmaJugadores() {
		return firmaJugadores;
	}

	public void setFirmaJugadores(LocalDate firmaJugadores) {
		this.firmaJugadores = firmaJugadores;
	}
	
	public void reservar(Empleado empleado) {
		if(this.firmaJugadores == null) {
			throw new IllegalStateException("Los jugadores no han reservado. ");
		}
		if(this.empleado != null) {
			throw new IllegalStateException("El partido ya tiene asignado un empleado. ");
		}
		if(this.firmaEmpleado != null) {
			throw new IllegalStateException("El partido ya está firmado por el empleado. ");
		}
		this.empleado = empleado;
		this.firmaEmpleado = LocalDate.now();
	}

	public void reservar() {
		if(!this.completo()) {
			throw new IllegalStateException("Faltan jugadores por asignar. ");
		}
		this.firmaJugadores = LocalDate.now();
	}
	
	public String estado() {
		String result = "PENDIENTE";
		
		if(this.firmaJugadores != null) {
			result = "RESERVADA";

			if(this.firmaEmpleado != null) {
				result = "CONFIRMADA";
			}
		}
		
		return result;
	}
	
	public void aniadirJugador(Jugador jugador, int posicion) {
		if(posicion < 0 || posicion >= this.jugadores.length) {
			throw new IllegalArgumentException("La posición indicada no existe. ");
		}
		this.jugadores[posicion] = jugador;
	}
	
	public void eliminarJugador(int posicion) {
		if(posicion < 0 || posicion >= this.jugadores.length) {
			throw new IllegalArgumentException("La posición indicada no existe. ");
		}
		this.jugadores[posicion] = null;
	}
	
	public boolean completo() {
		boolean result = true;
		
		for(int i=0; i < this.jugadores.length && result; i++) {
			if(this.jugadores[i] == null) {
				result = false;
			}
		}
		
		return result;
	}

}
