package padel;

import padel.personas.Amateur;
import padel.personas.Empleado;
import padel.personas.Persona;
import padel.personas.Profesional;

public class Main {
	
	public static void main(String[] args) {
		
		Profesional p = new Profesional("pablo", "Humanes", "11111111A", 1, "Pegada");
		Amateur a = new Amateur("Leo", "Bernal", "22222222B", 2, "Cabeza");
		Empleado e = new Empleado("Vladi", "Rico", "20060973M", 1);
		
		Persona personas[] = new Persona[3];
		personas[0] = p;
		personas[1] = a;
		personas[2] = e;
		
		for(Persona per : personas) {
			per.mostrarInformacion();
		}
		
		
	}

}
