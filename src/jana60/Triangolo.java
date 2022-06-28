package jana60;
//Classe Triangolo che implementa l'interfaccia Poligono.
public class Triangolo implements Poligono {
	//Attributi classe Triangolo.
	//Attributi base, altezza, cateto.
	double base, altezza, cateto;
	//Costruttore della classe Triangolo che manda un errore se presente.
	public Triangolo(double base, double altezza, double cateto) throws IllegalArgumentException {
		
		super();
		//Metodi che controllano eventuali errori di inserimento.
		validaNumero(cateto);
		validaNumero(altezza);
		validaNumero(base);
		//Assegnazione dei valori delle variabili all'oggetto Triangolo corrente.
		this.base = base;
		this.altezza = altezza;
		this.cateto = cateto;
		
	}
	//Metodo get per ricevere il valore della base.
	public double getBase() {
		return base;
	}
	//Metodo set per impostare un valore alla base che manda un errore se presente.
	public void setBase(double base) throws IllegalArgumentException {
		//Metodo che controlla eventuali errori di inserimento.
		validaNumero(base);
		this.base = base;
		
	}
	//Metodo get per ricevere il valore dell'altezza.
	public double getAltezza() {
		return altezza;
	}
	//Metodo set per impostare un valore all'altezza che manda un errore se presente.
	public void setAltezza(double altezza) throws IllegalArgumentException {
		//Metodo che controlla eventuali errori di inserimento.
		validaNumero(altezza);
		this.altezza = altezza;
		
	}
	//Metodo get per ricevere il valore dei cateti.
	public double getCateto() {
		return cateto;
	}
	//Metodo set per impostare un valore ai cateti che manda un errore se presente.
	public void setCateto(double cateto) throws IllegalArgumentException {
		//Metodo che controlla eventuali errori di inserimento.
		validaNumero(cateto);
		this.cateto = cateto;
		
		
	}
	//Sovrascrittura del metodo calcolaPerimetro dell'interfaccia Poligono specifico dell'oggetto Triangolo.
	@Override
	public double calcolaPerimetro() {
		//Ritorna calcolo del perimetro.
		return base + (cateto * 2);
		
	}
	//Sovrascrittura del metodo calcolaArea dell'interfaccia Poligono specifico dell'oggetto Triangolo.
	@Override
	public double calcolaArea() {
		//Ritorna calcolo dell'Area.
		return (base * altezza) / 2;
		
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
		return "Il triangolo isoscele creato ha le seguenti dimensioni." + "\nCateti: " + cateto + "\nAltezza: " + altezza + "\nBase: " + base + "\nArea: " + calcolaArea() + "\nPerimetro: " + calcolaPerimetro();
		
	}
	
}
