package aplicacao;
import biblioteca.MetodoCompartilhado;
public class Exemplo3 {

public static void main (String[]args) {

	System.out.println(" System.out.println e um metodo estatico compartilhado");
	System.out.println(" Uso do metodo Math.pow para potencia" + Math.pow(2, 3));
	System.out.println(" tambem utilizamos nossas conversoes:");
	String valor = "1000";
	System.out.println("Double.parseDouble (valor):" + Double.parseDouble(valor));
	System.out.println(" Iteger.parseInt(valor)" + Integer.parseInt(valor));
	
	System.out.println("Dobro do valor:" + MetodoCompartilhado.valorDobro());
	System.out.println("Quadrado do valor:" + MetodoCompartilhado.valorQuadrado());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
