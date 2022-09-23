import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListTeste{
public static void main(String []args) {
	
	
	Scanner sc = new Scanner (System.in);
	String antigo, novo;
	int i, indice;
	
	ArrayList<String> grupoTrabalho = new ArrayList<String>(); 
	for (i = 0; i < 5; i++) {
		System.out.println("digite o nome do integrante" + i + 1);
		grupoTrabalho.add(sc.nextLine());
	}
	System.out.println("Numero de elementos do grupo:" + grupoTrabalho.size());
	System.out.println("Substituicao de um elemento por outro:");
	System.out.println("Digite o nome do componente a ser substituido:");
	
	antigo = sc.nextLine();
	indice = grupoTrabalho.indexOf(antigo);
	System.out.println("O componente" + grupoTrabalho.get(indice) + "Sera substituido.");
	System.out.println("Digite o nome do componente novo:");
	novo = sc.nextLine();
    grupoTrabalho.set(indice, novo);
	System.out.println("Retirada de um elemento do grupo:");
	System.out.println("Digite o nome do componente a ser eliminado:");
	
	antigo = sc.nextLine();
	indice = grupoTrabalho.indexOf(antigo);
	grupoTrabalho.remove(indice);
	System.out.println("grupo atual - Numero de elementos do grupo:" + grupoTrabalho.size());
	System.out.println("Elementos do grupo:");
	Iterator<String> iterator = grupoTrabalho.iterator();
	i = 0;
	
	while(iterator.hasNext()) {
		System.out.println("Posicao" + i + "tem o componente:" + iterator.next());
	}
	System.out.println("Limpando o ArrayList:");
	grupoTrabalho.clear();
	System.out.println("Numero de elementos do grupo:" + grupoTrabalho.size());
		
			
}
	
}