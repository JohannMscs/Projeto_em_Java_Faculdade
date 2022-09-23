import java.util.ArrayList;
public class AppArrayList {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add(35);
		array.add(new Carro());
		array.add(0, 0.375);
		array.add(new Fogao());
		array.add(2, "Maria");
		array.add(new Desktop());
		
		System.out.println("a lista possui" + array.size()+ "elementos.");
		for (int i = 0; i < array.size(); i++) {
			
		System.out.println("elemento[" + i + "]" + array.get(i));
		}
		
	}
	
	
}
