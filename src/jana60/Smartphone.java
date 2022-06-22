package jana60;

import java.util.Random;

public class Smartphone extends Prodotto {

	Random rand = new Random();
	// Attributi
	private int codiceIMEI = rand.nextInt(1000000000);
	private int quantitamemoria;

	// Costruttore

	public Smartphone(int codice, String nome, String marca, double prezzo, int quantitamemoria) {
		super(codice, nome, marca, prezzo);
		this.quantitamemoria = quantitamemoria;

	}

	// Override e string finale
	@Override
	public String toString() {
		return super.toString() + ". Il tuo cellulare con IMEI: " + codiceIMEI + " Con memoria di: " + quantitamemoria + "GB";
	}

}
