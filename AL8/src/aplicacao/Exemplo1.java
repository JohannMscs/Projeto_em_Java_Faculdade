package aplicacao;
import java.util.Scanner;
import biblioteca.Contacao;
public class Exemplo1 {
public static void main(String [] args) {
	
	double valorReal;
	Scanner entrada = new
			Scanner(System.in);
	Contacao cot_1 = new Contacao();
	cot_1.entrada();
	
	System.out.println("Quantos reais para a conversao?");
	valorReal = Double.parseDouble(entrada.nextLine());
	System.out.println();
	
	cot_1.imprimir();
	System.out.printf("Conversao de Real para dolar: US$ : US$ %.2f",cot_1.converterRealParaDolar(valorReal));
	
	Contacao cot_2 = new
			Contacao(4.15);
	
	cot_1.imprimir();
	System.out.printf("Conversa de Real para dolar: US$ %.2f", cot_1.converterRealParaDolar(valorReal));
	System.out.println();

	cot_2.imprimir();
	System.out.printf("Coversão de Real para dólar : US$ %.2f",cot_2.converterRealParaDolar(valorReal));
	System.out.println();
	
}
}
