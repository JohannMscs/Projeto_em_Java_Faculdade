package aplicacao;
import biblioteca.Teste;
public class Exemplo2 {

	public static void main(String [] args) {
		Teste t1 = new Teste();
		System.out.println("contador=" + t1.getContador());
	    Teste t2 = new Teste();
		System.out.println("Contador=" + t2.getContador());
		Teste t3 = new Teste();
		System.out.println("Contador=" + t3.getContador());
	    Teste t4 = new Teste();
	    System.out.println("Contador=" + t4.getContador());
	    Teste t5 = new Teste();
	    System.out.println("Contador=" + t5.getContador());
	
	    System.out.println("Contador=" + t1.getContador());
	}
}
