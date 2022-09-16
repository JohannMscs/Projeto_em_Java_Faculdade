package biblioteca;

public interface Control extends Rules{
	
	int POTENCIAMAXIMA = 350;
	int POTENCIAMAXIMA1 = 120;

	public int setPotenciaMaxima();
	public int getPotenciaMaxima();
	
	void assar(int potencia);
	void aquecer(int potencia);
	void desligar();
}

