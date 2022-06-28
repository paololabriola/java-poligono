package jana60;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException {
		
		Quadrato figura1 = new Quadrato(5);
		
		System.out.println("L'area è " + figura1.calcolaArea());
		System.out.println("Il perimetro è " + figura1.calcolaPerimetro());
		
		Triangolo figura2 = new Triangolo(3, 5, 4);
		
		System.out.println("L'area è " + figura2.calcolaArea());
		System.out.println("Il perimetro è " + figura2.calcolaPerimetro());
		
	}

}
