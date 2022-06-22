package jana60;

public class Televisori extends Prodotto {

	// Attributi
	String dimensioni;
	boolean smart;

	// Costruttore
	public Televisori(int codice, String nome, String marca, double prezzo, String dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	@Override
	public String toString() {
		String tipo = "";
		if (smart) {
			tipo = "Smart";
		} else {
			tipo = "Non Smart";
		}
		;

		return super.toString() + "Il tuo televisore dalle dimensioni di: " + dimensioni + "Hai scelto un televisore: "
				+ tipo;

	}

}
