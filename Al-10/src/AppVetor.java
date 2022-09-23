import java.util.Scanner;
public class AppVetor {
	public static void main(String []args) {
		Scanner ent = new Scanner (System.in);
		
		Carro matCarro[][] = new Carro [10][30];
		
		for(int i = 0; i < matCarro.length i++) {
			
			for (int j = 0; j < matCarro[0].length; j++) {
				matCarro[i][j] = new Carro();
				matCarro[i][j].entrada();
			}
		}
		for(int i=0; i<matCarro.lenght; i++) {
			for(int j= 0; j<matCarro[0].length; j++) {
				matCarro[i][j].imprimir();
			}
		}
		Fogao matFogao[][] = new Fogao[20][10]; matFogao[0][0] = new Fogao();
		matFogao[10][9] = new Fogao();
		
		Desktop matDesktop[][] = new Desktop[10][10];
		matDesktop[0][0] = new Desktop();
		matDesktop[9][9] = new Desktop();
	}

}
