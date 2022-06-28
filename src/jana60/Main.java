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
		//Dichiarazione variabili flag per i cicli di ripetizione del codice.
		boolean flag, chiudiProgramma = false;
		//Dichiarazione variabile scelta.
		int scelta;
		//Dichiarazione variabile scanner per prendere valori in input.
		Scanner scan = new Scanner(System.in);
		//Descrizione scopo del codice.
		System.out.println("Questo programma calcola l'area e il perimetro di un poligono a partire da valori dati in input.");
		//Ciclo per ripetere il programma più volte e dare la possibilità all'utente di creare poligoni diverse e ripetere la scelta più volte.
		while(!chiudiProgramma) {
			//Ciclo di controllo affinché la scelta assuma un valore valido di quelli presi in considerazione nello switch case.
			do {
				//Descizione scelta e inizializzazione varibile scelta.
				System.out.println("Digita 1. per creare un quadrato, 2. per creare un triangolo isoscele, 3. per chiudere il programma.");
				scelta = Integer.parseInt(scan.nextLine());
				//Controllo con messaggio di errore in caso alla scelta venga assegnato un valore erroneo.
				if(scelta != 1 && scelta != 2 && scelta != 3)
					System.out.println("ERRORE. Inserisci un valore valido.");
					
			}while(scelta != 1 && scelta != 2 && scelta != 3);
			//Switch.
			switch(scelta) {
				//Caso 1:
				case 1 :
					//Inizializzazione variabile flag per ripetere più volte in caso di valori erronei.
					flag = false;
					//Ciclo per ripetere l'inserimento in input della figura nel caso in cui i valori inseriti siano invalidi.
					do {
						//Controllo dell'errore.
						try {
							//Dichiarazione variabile lato del quadrato.
							double lato;
							//Inizializzazione della variabile lato.
							System.out.println("Inserisci il valore del lato del quadrato: ");
							lato = Double.parseDouble(scan.nextLine());
							//Creazione oggetto quadrato di classe Quadrato.
							Quadrato quadrato = new Quadrato(lato);
							//Metodo toString della classe Quadrato per stampare le dimensioni a schermo.
							System.out.println(quadrato.toString());
							//Cambio valore della flag in caso l'inserimento avvenga correttamente.
							flag = true;
						//Cattura primo errore in caso di inserimento di valore sbagliato nel parseDouble (come ad esempio una lettera).
						} catch (NumberFormatException nfe) {
							//Messaggio di errore.
							System.out.println("Hai inserito un carattere non valido, il valore deve essere un numero intero.");
							System.out.println(nfe.getMessage());
						//Cattura secondo errore in caso di valori errati per la creazione dell'oggetto quadrato.
						} catch (Exception e) {
							//Messaggio di errore.
							System.out.println("I dati inseriti per creare il quadrato sono invalidi. Riprova.");
							System.out.println(e.getMessage());
							
						}
					//Il ciclo di controllo continuerà a ripetere l'inserimento dell'oggetto quadrato fino a che non si arriva a inserire un oggetto correttamente e si arriva a cambiare il valore della flag alla riga 60.
					}while(!flag);
					//Fine caso 1.
					break;
				//Caso 2:	
				case 2 :
					//Inizializzazione variabile flag per ripetere più volte in caso di valori erronei.
					flag = false;
					//Ciclo per ripetere l'inserimento in input della figura nel caso in cui i valori inseriti siano invalidi.
					do {
						//Controllo dell'errore.
						try {
							//Dichiarazione variabili cateti, altezza e base del triangolo.
							double cateti, altezza, base;
							//Inizializzazione variabili dimensioni del triangolo.
							System.out.print("Inserisci la dimensione del cateto del triangolo isoscele: ");
							cateti = Double.parseDouble(scan.nextLine());
							System.out.print("Inserisci la dimensione dell'altezza del triangolo: ");
							altezza = Double.parseDouble(scan.nextLine());
							System.out.print("Inserisci la dimensione della base del triangolo: ");
							base = Double.parseDouble(scan.nextLine());
							//Creazione oggetto triangolo di classe Triangolo.
							Triangolo triangolo = new Triangolo(base, altezza, cateti);
							//Metodo toString della classe Triangolo per stampare le dimensioni a schermo.
							System.out.println(triangolo.toString());
							//Cambio valore della flag in caso l'inserimento avvenga correttamente.
							flag = true;
						//Cattura primo errore in caso di inserimento di valore sbagliato nel parseDouble (come ad esempio una lettera).	
						} catch (NumberFormatException nfe) {
							//Messaggio di errore
							System.out.println("Hai inserito un carattere non valido, la dimensione deve essere un numero.");
							System.out.println(nfe.getMessage());
						//Cattura secondo errore in caso di valori errati per la creazione dell'oggetto triangolo.	
						} catch (Exception e) {
							//Messaggio di errore
							System.out.println("I dati inseriti per creare il triangolo sono invalidi. Riprova.");
							System.out.println(e.getMessage());
							
						}
					//Il ciclo di controllo continuerà a ripetere l'inserimento dell'oggetto triangolo fino a che non si arriva a inserire un oggetto correttamente e si arriva a cambiare il valore della flag alla riga 99.	
					}while(!flag);
					//Fine caso 2.
					break;
				//Caso 3:	
				case 3 :
					//Cambio valore flag chiudiProgramma per uscire dal ciclo e chiudere il programma.
					chiudiProgramma = true;
					//Fine caso 3.
					break;
					
			}	
			
		}
		//Chiusura Scanner.
		scan.close();
		
	}

}
