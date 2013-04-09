package info805.tp.chantrel.lean.caisse.metier;

import java.util.Scanner;

public class Caisse {

	private double total_panier;

	public Caisse() {
		this.total_panier = 0;
	}

	public double getTotal_panier() {
		return total_panier;
	}

	public void setTotal_panier(double total_panier) {
		this.total_panier = total_panier;
	}

	public void appliquerReductionPaireCerises(int nombreCerises,
			int reductionAAppliquer) {
		if (nombreCerises % 2 == 0 && nombreCerises != 0) {
			this.total_panier = this.total_panier - reductionAAppliquer;
		}
	}

	public void appliquerReductionPaireBananes(int nombreBananes,
			int reductionAAppliquer) {
		if (nombreBananes % 2 == 0 && nombreBananes != 0) {
			this.total_panier = this.total_panier - reductionAAppliquer;
		}
	}

	public void appliquerReductionQuatrePommes(int nombrePommes,
			int reductionAAppliquer) {
		if (nombrePommes % 4 == 0 && nombrePommes != 0) {
			this.total_panier = this.total_panier - reductionAAppliquer;
		}
	}

	public void appliquerReductionTripleApples(int nombreApples,
			int reductionAAppliquer) {
		if (nombreApples % 3 == 0 && nombreApples != 0) {
			this.total_panier = this.total_panier - reductionAAppliquer;
		}
	}

	public void appliquerReductionPaireMele(int nombreMeles,
			int reductionAAppliquer) {
		if (nombreMeles % 2 == 0 && nombreMeles != 0) {
			this.total_panier = this.total_panier - reductionAAppliquer;
		}
	}

	public void appliquerReductionCinqFruits(int nombreFruits,
			int reductionAAppliquer) {
		if (nombreFruits % 5 == 0 && nombreFruits != 0) {
			this.total_panier = this.total_panier - reductionAAppliquer;
		}
	}

	public static void main(String[] args) {
		Caisse caisse = new Caisse();
		Scanner scanner = new Scanner(System.in);
		int choix = -1;
		String[] articlesSaisis;
		String ligneSaisie = "";

		//final int FIN = 0;

		// Initialisation des articles acceptés par la caisse.
		final int POMMES = 1;
		final int CERISES = 2;
		final int BANANES = 3;

		// Initialisation des prix des articles
		final int PRIX_POMMES = 100;
		final int PRIX_CERISES = 75;
		final int PRIX_BANANES = 150;

		// Initialisation du nombre des articles
		int nombreFruits = 0;
		int nombreCerises = 0;
		int nombreBananes = 0;
		int nombrePommes = 0;
		int nombreApples = 0;
		int nombreMeles = 0;

		// Initialisation des transformations des prix.
		final int REDUCTION_CINQ_FRUITS = 200;
		final int REDUCTION_PAIRE_CERISE = 20;
		final int REDUCTION_PAIRE_BANANES = 150;
		final int REDUCTION_QUATRE_POMMES = 100;
		final int REDUCTION_TRIPLE_APPLES = 100;
		final int REDUCTION_DOUBLE_MELES = 50;

		System.out.println("-----------------------------------------------");
		System.out.println("\t\tPanier");
		System.out.println("-----------------------------------------------");

		while (true) {

			ligneSaisie = scanner.nextLine();
			articlesSaisis = ligneSaisie.split(",");
			for (int i = 0; i < articlesSaisis.length; i++) {
				// Vérification : POMMES
				if (articlesSaisis[i].equals("Pommes")
						|| articlesSaisis[i].equals("POMMES")) {
					nombrePommes = nombrePommes + 1;
					nombreFruits = nombreFruits + 1;
					choix = POMMES;

				} else if (articlesSaisis[i].equals("Apples")
						|| articlesSaisis[i].equals("APPLES")) {
					nombreApples = nombreApples + 1;
					nombreFruits = nombreFruits + 1;
					choix = POMMES;

				} else if (articlesSaisis[i].equals("Mele")
						|| articlesSaisis[i].equals("MELE")) {
					nombreMeles = nombreMeles + 1;
					nombreFruits = nombreFruits + 1;
					choix = POMMES;
				}
				// Vérification : CERISES
				else if (articlesSaisis[i].equals("Cerises")
						|| articlesSaisis[i].equals("CERISES")) {
					nombreCerises = nombreCerises + 1;
					nombreFruits = nombreFruits + 1;
					choix = CERISES;

				}
				// Vérification : BANANES
				else if (articlesSaisis[i].equals("Bananes")
						|| articlesSaisis[i].equals("BANANES")) {
					nombreBananes = nombreBananes + 1;
					nombreFruits = nombreFruits + 1;
					choix = BANANES;
				}

				// On ressort ce qu'on a passé en entrée.
				switch (choix) {
				case POMMES:
					
					caisse.setTotal_panier(caisse.getTotal_panier()
							+ PRIX_POMMES);
					caisse.appliquerReductionQuatrePommes(nombrePommes,
							REDUCTION_QUATRE_POMMES);
					caisse.appliquerReductionPaireMele(nombreMeles,
							REDUCTION_DOUBLE_MELES);
					caisse.appliquerReductionTripleApples(nombreApples,
							REDUCTION_TRIPLE_APPLES);
					caisse.appliquerReductionCinqFruits(nombreFruits,
							REDUCTION_CINQ_FRUITS);
					break;
					
				case CERISES:
					caisse.setTotal_panier(caisse.getTotal_panier()
							+ PRIX_CERISES);
					nombreCerises = nombreCerises + 1;
					caisse.appliquerReductionPaireCerises(nombreCerises,
							REDUCTION_PAIRE_CERISE);
					caisse.appliquerReductionCinqFruits(nombreFruits,
							REDUCTION_CINQ_FRUITS);
					break;
					
				case BANANES:
					caisse.setTotal_panier(caisse.getTotal_panier()
							+ PRIX_BANANES);
					nombreBananes = nombreBananes + 1;
					caisse.appliquerReductionPaireBananes(nombreBananes,
							REDUCTION_PAIRE_BANANES);
					caisse.appliquerReductionCinqFruits(nombreFruits,
							REDUCTION_CINQ_FRUITS);
					break;
				}

			}
			System.out.println("Total du panier : " + caisse.getTotal_panier());
		}

		// scanner.close();

	}

}
