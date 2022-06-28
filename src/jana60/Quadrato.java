package jana60;

public class Quadrato implements Poligono {

	private double lato;
	
	public Quadrato(double lato) throws IllegalArgumentException {
		
		super();
		
		validaNumero(lato);
	
		this.lato = lato;
		
	}
	
	@Override
	public double calcolaPerimetro() {
		
		return (lato + lato) * 2;
		
	}

	@Override
	public double calcolaArea() {
		
		return lato*lato;
		
	}

	public double getLato() {
		
		return lato;
		
	}

	public void setLato(double lato) throws IllegalArgumentException {
		
		validaNumero(lato);
		this.lato = lato;
		
	}
	
	private void validaNumero(double numero) throws IllegalArgumentException {
		
	    if (numero <= 0) {
	    	
	    	throw new IllegalArgumentException("Il valore assegnato non può essere pari a 0 o avere un valore negativo.");
	      
	    }
	    
	}
		
}
