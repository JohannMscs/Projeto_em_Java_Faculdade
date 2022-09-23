import java.util.Scanner;

public class vetores {

public static void main(String[] args) {

Scanner ent = new Scanner(System.in);

double temperatura[] = new double[1000];

for (int i = 0; i < 1000; i++) {

System.out.println("Digite a temperatura: [" + (i + 1) + "]");

temperatura[i] = Double.parseDouble(ent.nextLine());

}

System.out.println("Foram entradas as temperaturas:");

for (int i = 0; i < 1000; i++) {

System.out.println("Temperatura: [" + (i + 1) + "] = " + temperatura[i]);

}

}

}

