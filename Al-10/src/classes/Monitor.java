package classes;
import java.util.Scanner;
public class Monitor {
private String resolucao;
private double preco, potencia;
private int tamanhoTela, tensao;

public String getResolucao() {
	return resolucao;
}
public void setResolucao(String resolucao) {
	if(!resolucao.isEmpty()) {
		this.resolucao = resolucao + "";
	}
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	if(preco>=0) {
		this.preco = preco;
	}
}
public double getPotencia() {
	return potencia;
}
public void setPotencia(double potencia) {
	if(potencia>=0) {
		this.potencia = potencia;
	}
}
public int getTamanhoTela() {
	return tamanhoTela;
}
public void setTamanhoTela(int tamanhoTela) {
	if(tamanhoTela>=0) {
		this.tamanhoTela = tamanhoTela;
	}
}
public int getTensao() {
	return tensao;
}
public void setTensao(int tensao) {
	if(tensao>=0) {
		this.tensao = tensao;
	}
}
	public Monitor() {}
	public Monitor (String resolucao, double preco, double potencia, int tamanhoTela, int tensao) {
		setResolucao(resolucao);
		setPreco(preco);
		setPotencia(potencia);
		setTamanhoTela(tamanhoTela);
		setTensao(tensao);
	}
	public Monitor(String resolucao, double preco, int tamanhoTela) {
		setResolucao(resolucao);
		setPreco(preco);
		setTamanhoTela(tamanhoTela);
	}
	public void cadastrar(String resolucao, double preco, double potencia, int tamanhoTela, int tensao) {
		setResolucao(resolucao);
		setPreco(preco);
		setPotencia(potencia);
		setTamanhoTela(tamanhoTela);
		setTensao(tensao);
	}
	public void imprimir() {
		System.out.println("Resolucao:" + resolucao);
		System.out.println("Preco:" + preco);
		System.out.println("Potencia:" + potencia);
		System.out.println("Tamanho da Tela:" + tamanhoTela);
		System.out.println("Tensao:" + tensao);
	}
    public void entradaDados() {
    	Scanner ent = new Scanner(System.in);
    	
    	System.out.println("Resolucao:");
    	setResolucao(ent.nextLine());
    	
    	System.out.println("Preco");
    	setPreco(Double.parseDouble(ent.nextLine()));
    	
    	System.out.println("Potencia");
    	setPotencia(Double.parseDouble(ent.nextLine()));
        
    	System.out.println("Tamanho da tela:");
    	setTamanhoTela(Integer.parseInt(ent.nextLine()));
    	
    	System.out.println("Tensao:");
    	setTensao(Integer.parseInt(ent.nextLine()));
    }
	
}
