package aplicacao;
import biblioteca.Forno;
public class Aplicacao {

	public static void main(String []args) {
		Forno f = new Forno("Ge", "f505", 60, 120);
		f.assar(200);
		f.desligar();
		System.out.println();
	}
}
