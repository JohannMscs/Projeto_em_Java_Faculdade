package biblioteca;

public interface Controle {

	int POTENCIAMAXIMA = 350;
	int PONTENCIAMAXIMA = 120;
	
	public int setPotenciaMaxima();
	public int getPotenciaMaxima();
	
	void assar(int potencia);
	void aquecer(int potencia);
	void desligar(); //public e abstract
}
