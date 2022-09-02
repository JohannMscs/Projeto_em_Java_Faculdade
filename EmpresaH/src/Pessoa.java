import java.util.Scanner;

public class Pessoa {

String identidade, nome;

public String getIdentidade() {
	return identidade;
}
public void setIdentidade(String id) {
	if(!id.isEmpty()) {
		identidade = id;
	}
}
public String getNome() {
	return nome;
}
public void setNome(String no) {
	if(!no.isEmpty()) {
		nome = no;
	}
}
public Pessoa() {}
public Pessoa (String id) {
	setIdentidade(id);
}
public Pessoa (String id, String no) {
setIdentidade(id);
setNome(no);
}
//so podemos criar 3 construtores para classe pessoa
public void cadastrar(String id, String no) {
	setIdentidade(id);
	setNome(no);
}
public void entradaDados() {
	Scanner entrada = new 
	Scanner(System.in);
	
	System.out.println("identidade:");
	setIdentidade(entrada.nextLine());
	System.out.println("Nome:");
	setNome(entrada.nextLine());	
}
public void imprimir(){
	System.out.println("Identidade:" + getIdentidade());
	System.out.println("Nome:" + getNome());
}










}
