package aplicacao;
import assadores.*;
public class Comida {

	public static void main(String [] args) {
		Forno f = new
				Forno("GE", "f505", 60, 120);
		Microondas m = new
				Microondas("Brastemp", "M328", 28, 250);
		f.assar(200);
		f.desligar();
		m.aquecer(150);
		m.desligar();
		System.out.println();
		
		AssaAquece af = new
				Forno("Brastemp", "br105", 55, 300);
		        af.aquecer(300);
		        af.desligar();
		        System.out.println();
		        
		        AssaAquece am = new
		        Microondas("GE", "ge10", 35, 180);
		        am.aquecer(120);
		        am.desligar();
		        System.out.println();
		        
	}
}
