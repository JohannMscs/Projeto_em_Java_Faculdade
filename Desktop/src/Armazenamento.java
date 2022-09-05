import java.util.Scanner;
public class Armazenamento extends Identificacao{
public String tipo;
public int capacidade;
public Armazenamento() {
	super();
}
public Armazenamento(String ti, int ca) {
	setTipo(ti);
	setCapacidade(ca);
}
public Armazenamento (String ma, String mo) {
	super(ma, mo);
}
public Armazenamento (String ma,  double pr) {
    super(ma, pr);    
}
public Armazenamento (String ma, String mo, double pr) {
	super(ma, mo, pr);
}
public Armazenamento(String ma, String mo, double pr, String ti, int ca) {
	super(ma, mo, pr);
	setTipo(ti);
	setCapacidade(ca);
}

public String getTipo() {
	return tipo;
}
public void setTipo(String ti) {
	if(ti.isEmpty()) {
		tipo = ti;
	}
}
public int getCapacidade() {
	return capacidade;
}
public void setCapacidade(int ca) {
	if(ca>=0) {
		capacidade = ca;
	}
}
public void cadastrar(String ma, String mo, String ti, double pr, int ca) {
	super.cadastrar(ma, mo, pr);
	
}


}
