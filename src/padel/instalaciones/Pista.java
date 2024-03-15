package padel.instalaciones;

public class Pista {
	
	private int numero;
	private TipoPista tipoPista;
	private UbicacionPista ubicacionPista;
	
	public Pista(int numero, String tipoPista, String ubicacionPista) {
		this.numero = numero;
		this.tipoPista = TipoPista.valueOf(ubicacionPista);
		this.ubicacionPista = UbicacionPista.valueOf(ubicacionPista);
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipoPista() {
		return this.tipoPista.toString();
	}

	public void setTipoPista(TipoPista tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getUbicacionPista() {
		return this.ubicacionPista.toString();
	}

	public void setUbicacionPista(UbicacionPista ubicacionPista) {
		this.ubicacionPista = ubicacionPista;
	}

	@Override
	public boolean equals(Object obj) {
		Pista other = (Pista) obj;
		boolean result = false;
		
		if(this.numero == other.numero &&
				this.tipoPista.equals(other.tipoPista) &&
				this.ubicacionPista.equals(other.ubicacionPista)) {
			result = true;
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Pista [numero=" + this.numero + ", tipoPista=" + this.tipoPista.toString() + ", ubicacionPista=" + this.ubicacionPista.toString() + "]";
	}

}
