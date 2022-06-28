package jana60;

public class Triangolo implements Poligono {

	double base, altezza, cateto;
	
	public Triangolo(double base, double altezza, double cateto) throws IllegalArgumentException {
		
		super();
		
		validaNumero(cateto);
		validaNumero(altezza);
		validaNumero(base);
	
		this.base = base;
		this.altezza = altezza;
		this.cateto = cateto;
		
	}
	
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) throws IllegalArgumentException {
		
		validaNumero(base);
		this.base = base;
		
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) throws IllegalArgumentException {
		
		validaNumero(altezza);
		this.altezza = altezza;
		
	}



	public double getCateto() {
		return cateto;
	}



	public void setCateto(double cateto) throws IllegalArgumentException {
		
		validaNumero(cateto);
		this.cateto = cateto;
		
	}



	@Override
	public double calcolaPerimetro() {
		
		return base + (cateto * 2);
		
	}

	@Override
	public double calcolaArea() {
		
		return (base * altezza) / 2;
		
	}

	private void validaNumero(double numero) throws IllegalArgumentException {
		
	    if (numero <= 0) {
	    	
	    	throw new IllegalArgumentException("Il valore assegnato non può essere pari a 0 o avere un valore negativo.");
	      
	    }
	    
	}
	
}
