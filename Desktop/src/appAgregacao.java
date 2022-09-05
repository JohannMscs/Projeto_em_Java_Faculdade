
public class appAgregacao {
public static void main (String[] args) {
	Desktop desk = new Desktop();
	
	//para usar algum metodo do objeto crado a partir da classe agregada
	// devemos usar o identificador do objeto
	//slot1
	desk.slot1.setMarcar("Samsung");
	desk.slot1.setCapacidade(16);
	
	//slot2
	desk.slot2.setMarcar("Kingston");
	desk.slot2.setCapacidade(8);
	
	//slot3
	desk.slot3.setMarcar("Sandisk");
	desk.slot3.setCapacidade(4);
	
	//slot4
	desk.slot4.setMarcar("Crucial");
	desk.slot4.setCapacidade(2);
	
    //total de memoria:
	System.out.println("Memoria total:" +
            (desk.slot1.getCapacidade() +
			desk.slot2.getCapacidade() +
			desk.slot3.getCapacidade() +
			desk.slot4.getCapacidade() 
			));
	
}
}
