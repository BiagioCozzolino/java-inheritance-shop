package jana60;

public class Televisori extends Prodotto {

	// Attributi
	private String dimensioni;
	private boolean smart;

	// Costruttore
	public Televisori(int codice, String nome, String marca, double prezzo, String dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	// Override e string finale con if per determinare smart o no
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
