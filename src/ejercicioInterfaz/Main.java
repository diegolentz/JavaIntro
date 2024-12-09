package ejercicioInterfaz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Volador> voladores = new ArrayList<Volador>();
		
		Volador superman = new Superman();
		Volador helicoptero = new Helicoptero("Apache");
		Volador ovni = new Ovni();
		Volador avion = new Avion("Boeing 747");
        
        voladores.add(superman);
        voladores.add(helicoptero);
        voladores.add(ovni);
        voladores.add(avion);
        
        for(Volador v : voladores) {
        	if(v instanceof IAterrizable) {
        		((IAterrizable) v).aterrizar();
        	}
        }
        

		
	}

}
