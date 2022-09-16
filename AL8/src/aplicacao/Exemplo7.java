package aplicacao;
import biblioteca.abstrata;
import biblioteca.SubAbstrata;
public class Exemplo7 {
	
	public static void main (String []args) {
		SubAbstrata sabs = new SubAbstrata();
		sabs.setNome("jose");
		sabs.setIdade(25);
		sabs.setAltura(1.65);
		if(sabs.maiorIdade()) {
			System.out.println("Sim, maior de idade.");
			
		}
		else {System.out.println("Nao, nao e maior de idade");
		
		}
	System.out.println("IMC = " + sabs.calculaImc(90, 1.78));
	sabs.imprimir();
	}

}
