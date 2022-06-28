package jana60;
//Classe Quadrato che implementa l'interfaccia Poligono.
public class Quadrato implements Poligono {
	//Attributi classe Quadrato.
	//Attributo lato del quadrato.
	private double lato;
	//Costruttore della classe Quadrato che manda un errore se presente.
	public Quadrato(double lato) throws IllegalArgumentException {
		
		super();
		//Metodi che controllano eventuali errori di inserimento.
		validaNumero(lato);
		//Assegnazione dei valori delle variabili all'oggetto Triangolo corrente.
		this.lato = lato;
		
	}
	//Metodo get per ricevere il valore del lato.
	public double getLato() {
		
		return lato;
		
	}
	//Metodo set per impostare un valore al lato che manda un errore se presente.
	public void setLato(double lato) throws IllegalArgumentException {
		//Metodo che controlla eventuali errori di inserimento.
		validaNumero(lato);
		this.lato = lato;
		
	}
	//Sovrascrittura del metodo calcolaPerimetro dell'interfaccia Poligono specifico dell'oggetto Quadrato.
	@Override
	public double calcolaPerimetro() {
		//Ritorna calcolo del Perimetro.
		return lato * 4;
		
	}
	//Sovrascrittura del metodo calcolaArea dell'interfaccia Poligono specifico dell'oggetto Quadrato.
	@Override
	public double calcolaArea() {
		//Ritorna calcolo dell'Area.
		return lato*lato;
		
	}
	//Metodo controllo errori e validazione di un numero dato in input.
	private void validaNumero(double numero) throws IllegalArgumentException {
		//Controllo se il numero è minore o uguale a 0.
	    if (numero <= 0) {
	    	//Lancio dell'errore con annesso messaggio.
	    	throw new IllegalArgumentException("Il valore assegnato non può essere pari a 0 o avere un valore negativo.");
	      
	    }
	    
	}
	//Sovrascrittura del metodo toString della classe oggetto di Java.
	@Override
	public String toString() {
		//Messaggio.
		return "Il quadrato creato ha le seguenti dimensioni." + "\nLato: " + lato + "\nArea: " + calcolaArea() + "\nPerimetro: " + calcolaPerimetro();
		
	}
		
}
