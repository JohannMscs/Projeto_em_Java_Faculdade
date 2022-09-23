package aplicacoes;

import java.util.Scanner;

import classes.*;

public class VetorObjetos {

public static void main(String[] args) {

// TODO code application logic here

Scanner ent = new Scanner(System.in);

// determinação da quantidade de elementos

System.out.println("Quantos monitores serão inseridos?");

int qtd = Integer.parseInt(ent.nextLine());

Monitor monit[] = new Monitor[qtd];// declaração

for(int i=0; i <monit.length; i++) {

monit[i] = new Monitor();// Instanciação de cada objeto

monit[i].entradaDados();

}

for(int i=0; i<monit.length; i++){

System.out.println("***************************");

monit[i].imprimir();

System.out.println("***************************");

}

}

}
