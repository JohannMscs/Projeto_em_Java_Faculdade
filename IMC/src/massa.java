import java.util.Scanner;
public class massa {

	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		double peso, alt, imc;
		System.out.println("digite seu peso");
		 peso = Double.parseDouble(sc.nextLine());
		 System.out.println("digite sua altura");
		 alt = Double.parseDouble(sc.nextLine());
		 imc = peso/(alt*alt);
		 System.out.println("seu imc e de..." +imc);
		 
		if(imc<18.5) {
			System.out.println("voce esta abaixo do peso");
		}else if(imc<25) {
			System.out.println("voce esta no peso certo");
		}else if(imc<30) { 
			System.out.println("voce esta sobrepeso");
		}else if(imc<35) {
			System.out.println("voce esta com obesidade grau 1");
		}else if(imc<40) {
			System.out.println("voce esta com obesidade grau 2");
		}else if (imc<45) {
			System.out.println("voce esta com obesidade grau 3");
			} 
		}
	  }
	

