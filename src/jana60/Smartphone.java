package jana60;

public class Smartphone extends Prodotto {

	// Attributi
	long codiceIMEI;
	int quantitamemoria;

	// Costruttore

	public Smartphone(int codice, String nome, String marca, double prezzo, long codiceIMEI, int quantitamemoria) {
		super(codice, nome, marca, prezzo);
		this.codiceIMEI = codiceIMEI;
		this.quantitamemoria = quantitamemoria;

	}

	@Override
	public String toString() {
		return super.toString() + "Il tuo cellulare con IMEI: " + codiceIMEI + "Con memoria di: " + quantitamemoria;
	}

}
