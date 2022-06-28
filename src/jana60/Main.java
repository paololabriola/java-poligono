package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException {
		
		/*
		Quadrato figura1 = new Quadrato(5);
		
		System.out.println("L'area è " + figura1.calcolaArea());
		System.out.println("Il perimetro è " + figura1.calcolaPerimetro());
		
		Triangolo figura2 = new Triangolo(3, 5, 4);
		
		System.out.println("L'area è " + figura2.calcolaArea());
		System.out.println("Il perimetro è " + figura2.calcolaPerimetro());
		*/
		
		boolean flag, chiudiProgramma = false;
		int scelta;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo programma calcola l'area e il perimetro di un poligono a partire da valori dati in input.");
		
		while(!chiudiProgramma) {
			
			do {
				
				System.out.println("Digita 1. per creare un quadrato, 2. per creare un triangolo isoscele, 3. per chiudere il programma.");
				scelta = Integer.parseInt(scan.nextLine());
				
				if(scelta != 1 && scelta != 2 && scelta != 3)
					System.out.println("ERRORE. Inserisci un valore valido.");
					
			}while(scelta != 1 && scelta != 2 && scelta != 3);
			
			switch(scelta) {
			
				case 1 :
					
					flag = false;
					
					do {
						
						try {
							
							double latoQuadrato;
							
							System.out.println("Inserisci il valore del lato del quadrato: ");
							latoQuadrato = Double.parseDouble(scan.nextLine());
							
							Quadrato quadrato = new Quadrato(latoQuadrato);
							
							System.out.println(quadrato.toString());
							
							flag = true;
							
						} catch (NumberFormatException nfe) {
							
							System.out.println("Hai inserito un carattere non valido, il valore deve essere un numero intero.");
							System.out.println(nfe.getMessage());
							
						} catch (Exception e) {
							
							System.out.println("I dati inseriti per creare il quadrato sono invalidi. Riprova.");
							System.out.println(e.getMessage());
							
						}
						
					}while(!flag);
					
					break;
					
				case 2 :
					
					flag = false;
					
					do {
						
						try {
							
							double cateti, altezza, base;
							
							System.out.print("Inserisci la dimensione del cateto del triangolo isoscele: ");
							cateti = Double.parseDouble(scan.nextLine());
							System.out.print("Inserisci la dimensione dell'altezza del triangolo: ");
							altezza = Double.parseDouble(scan.nextLine());
							System.out.print("Inserisci la dimensione della base del triangolo: ");
							base = Double.parseDouble(scan.nextLine());
							
							Triangolo triangolo = new Triangolo(base, altezza, cateti);
							
							System.out.println(triangolo.toString());
							
							flag = true;
							
						} catch (NumberFormatException nfe) {
							
							System.out.println("Hai inserito un carattere non valido, la dimensione deve essere un numero.");
							System.out.println(nfe.getMessage());
							
						} catch (Exception e) {
							
							System.out.println("I dati inseriti per creare il triangolo sono invalidi. Riprova.");
							System.out.println(e.getMessage());
							
						}
						
					}while(!flag);
					
					break;
					
				case 3 :
					
					chiudiProgramma = true;
					
					break;
					
			}	
			
		}
		
		scan.close();
		
	}

}
