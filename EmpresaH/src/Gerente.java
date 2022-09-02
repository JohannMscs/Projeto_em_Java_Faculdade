import java.util.Scanner;

public class Gerente extends PessoaEmpresa {
double percentualVendas;
int nivelGerente;

public double getPercentualVendas() {
	return percentualVendas;
}
public void setPercentualVendas(double pv) {
    if(pv>=0) {
	percentualVendas = pv;
		}
	}
public int getNivelGerente() {
	return nivelGerente;
}
public void setNivelGerente( int ng) {
	if(ng>=0) {
		nivelGerente = ng;
	}
}
public Gerente() {}
public Gerente (String id) {
	super(id);
}
public Gerente(double sa) {
	super(sa);
}
public Gerente(String id, double sa) {
	super(id, sa);
}
public Gerente(double sa, String id) {
	super(id, sa);
}
public Gerente(String id, String no, String ma, double sa, double pv, int ng) {
	super(id, no, ma, sa);
	setPercentualVendas(pv);
	setNivelGerente(ng);
}
public void cadastrar(String id, String no, String ma, double sa, double pv, int ng) {
	super.cadastrar(id, no, ma, sa);
	setPercentualVendas(pv);
	setNivelGerente(ng);
}
public void entradaDados() {
	Scanner entrada = new
	Scanner(System.in);
	super.entradaDados();
	
	System.out.println("Percentual de Vendas:");
	setPercentualVendas(Double.parseDouble(entrada.nextLine()));
	System.out.println("Nivel Gerencia:");
	setNivelGerente(Integer.parseInt(entrada.nextLine()));
}
public void imprimir() {
	super.imprimir();
	
	System.out.println("Percentual de Venda:" + getPercentualVendas());
	System.out.println("Nivel Gerencia:" + getNivelGerente());
}

}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

