import java.util.Scanner;

public class Memoria {
public String marca, modelo, tipo;
public double preco;
public int capacidade;

public String getMarca() {
	return marca;
}			
			public void setMarcar(String ma) {
				if(!ma.isEmpty()) {
					marca = ma;
				}
			}
public String getModelo() {
	return modelo;
}
            public void setModelo(String mo) {
            	if(!mo.isEmpty()) {
            		modelo = mo;
            	}
            }
public String getTipo() {
	return tipo;
} 
           public void setTipo(String ti) {
        	   if(!ti.isEmpty()) {
        		   tipo = ti;
        	   }
           }
public double getPreco() {
	return preco;
}
           public void setPreco(double pr) {
        	   if(pr>=0) {
        		   preco = pr;
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












}
