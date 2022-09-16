package biblioteca;
import java.util.Scanner;
public class Contacao {
	
private static double valorDolar;
  

public double getValorDolar() {
	return valorDolar;
}
public void setValorDolar(double vd) {
	valorDolar = verificarValorDolar(vd);
}
private double verificarValorDolar(double vd) {
	if(vd>0) {
		return vd;
	}
	else { return 0.0;
}

}
public Contacao() {}
public Contacao(double valorDolar) {
	setValorDolar(valorDolar);
}
public void cadastrar(double valorDolar) {
	setValorDolar(valorDolar);
}
public void imprimir() {
	System.out.println("valor do dolar:" + getValorDolar());
}
public void entrada() {
	Scanner entrada = new 
			Scanner(System.in);
	System.out.println("Qual e o valor do dolar?");
	setValorDolar(Double.parseDouble(entrada.nextLine()));			
}
public double converterRealParaDolar(double real) {
	return real/
			getValorDolar();
}
}