package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean finito = true;
		while (finito) {
			System.out.println("Ciao Benvenuto nello Store di JavaShop!");
			System.out.println(
					"Scrivi 1 per comprare uno Smartphone - 2 per comprare un Televisore - 3 per comprare delle Cuffie - 4 per uscire dallo shop! ");
			String scelta = scan.nextLine();
			switch (scelta) {
			case "1":
				int memoria;
				boolean sbagliato = true;

				do {
					System.out
							.println("Inserisci Quantità di memoria desiderata 64 o 128 GB, inserisci solo il numero");
					memoria = Integer.parseInt(scan.nextLine());
					if (memoria != 64 && memoria != 128) {
						System.out.println("Hai inserito un numero non valido, ritenta");
					} else {
						sbagliato = false;
					}
				} while (sbagliato);
				Smartphone nuovotel = new Smartphone(754544652, "Mi 9T", "Xiaomi", 175.25, memoria);
				System.out.println(nuovotel.toString());
				break;
			case "2":
				System.out.println("Inserisci il nome del televisore");
				String nome = scan.nextLine();
				System.out.println("Inserisci il marca del televisore");
				String marca = scan.nextLine();
				System.out.println("Inserisci la dimensione desiderata in questo formato pollici");
				int dimensioni = Integer.parseInt(scan.nextLine());

				Televisori nuovaTv = new Televisori(757845654, nome, marca, 1245.65, dimensioni, finito);
				System.out.println(nuovaTv.toString());
				break;
			case "3":

			default:
				break;
			}

		}
		scan.close();
	}

}
