package jana60;

public class Cuffie extends Prodotto {

	// Attributi
	String colore;
	boolean wireless;

	// Construttore
	public Cuffie(int codice, String nome, String marca, double prezzo, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo);
		this.colore = colore;
		this.wireless = wireless;
	}

	@Override
	public String toString() {
		String tipo = "";
		if (wireless) {
			tipo = "hai scelto le cuffie Wireless";
		} else {
			tipo = "hai scelto le cuffie con cavo";
		}
		;

		return super.toString() + "Hai scelto le cuffie del colore: " + colore + "ed " + tipo;

	}

}
