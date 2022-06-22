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
				System.out.println("Inserisci il nome dello Smartphone");
				String nome = scan.nextLine();
				System.out.println("Inserisci il marca dello Smartphone");
				String marca = scan.nextLine();
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
				Smartphone nuovotel = new Smartphone(754544652, nome, marca, 175.25, memoria);
				System.out.println(nuovotel.toString());
				break;
			case "2":
				System.out.println("Inserisci il nome del televisore");
				String nomeTv = scan.nextLine();
				System.out.println("Inserisci il marca del televisore");
				String marcaTv = scan.nextLine();
				System.out.println("Inserisci la dimensione desiderata in questo formato pollici");
				int dimensioniTv = Integer.parseInt(scan.nextLine());
				boolean sceltaSmartErrata = true;
				boolean smart = false;
				do {
					System.out.println("Vuoi che la tua TV sia smart ? Scrivi solo si o no");
					String sceltasmart = scan.nextLine();

					if (sceltasmart.equalsIgnoreCase("Si")) {
						smart = true;
						sceltaSmartErrata = false;
					} else if (sceltasmart.equalsIgnoreCase("No")) {
						smart = false;
						sceltaSmartErrata = false;
					} else {
						System.out.println("Non hai scritto ne si ne no, riprova!");
					}
				} while (sceltaSmartErrata);
				Televisori nuovaTv = new Televisori(757845654, nomeTv, marcaTv, 1245.65, dimensioniTv, smart);
				System.out.println(nuovaTv.toString());

				break;
			case "3":
				System.out.println("Inserisci il nome delle Cuffie");
				String nomeCuffie = scan.nextLine();
				System.out.println("Inserisci il marca delle Cuffie");
				String marcaCuffie = scan.nextLine();
				System.out.println("Inserisci il colore delle Cuffie");
				String colore = scan.nextLine();
				boolean sceltaWirelessErrata = true;
				boolean wireless = true;
				do {
					System.out.println(
							"Vuoi che le tue cuffie siano Wireless o con Cavo ? Scrivi solo si per Wireless o no per il cavo");
					String sceltaWireless = scan.nextLine();

					if (sceltaWireless.equalsIgnoreCase("Si")) {
						wireless = true;
						sceltaWirelessErrata = false;
					} else if (sceltaWireless.equalsIgnoreCase("No")) {
						wireless = false;
						sceltaWirelessErrata = false;
					} else {
						System.out.println("Non hai scritto ne si ne no, riprova!");
					}
				} while (sceltaWirelessErrata);

				Cuffie nuovaCuffia = new Cuffie(789546545, nomeCuffie, marcaCuffie, 47.36, colore, wireless);

				System.out.println(nuovaCuffia.toString());

			default:
				System.out.println("Grazie per averci scelto, Buona giornata!");
				finito = false;
				break;
			}

		}
		scan.close();
	}

}
