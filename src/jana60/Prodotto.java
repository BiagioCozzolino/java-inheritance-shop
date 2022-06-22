package jana60;

import java.text.DecimalFormat;

public class Prodotto {

	// Formattatore decimale
	DecimalFormat df = new DecimalFormat("#.00€");

	// Attributi
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva = 22;

	// Costruttore
	public Prodotto(int codice, String nome, String marca, double prezzo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}

	// Getter and Setters;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// Metodi
	public double calcolaIva() {
		return prezzo + ((prezzo / 100) * iva);
	}

	// Override con metodo per formattare
	@Override
	public String toString() {
		return "Complimenti per aver acquistato il prodotto " + nome + " della marca " + marca + " al prezzo di "
				+ df.format(calcolaIva());
	}

}
