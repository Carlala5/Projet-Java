package AnaisCarla;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Collections;

public class Jeu {

	static String csvPath = "/Users/carladeruelle/Desktop/Projet-Java/src/dominos.csv";
	static Scanner reader = new Scanner(System.in);

	ArrayList<Domino> listDom = DominoCSVtoArrayList.parse_csv_file();

	Map<Integer, Domino> ListeDomino = new HashMap<Integer, Domino>();
	ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>();
	ArrayList<Domino> domJoueur = new ArrayList<Domino>();
	Plateau plateau = new Plateau();
	Joueur joueur1 = new Joueur("", "", 0, 1, domJoueur, plateau);
	Joueur joueur2 = new Joueur("", "", 0, 2, domJoueur, plateau);
	Joueur joueur3 = new Joueur("", "", 0, 3, domJoueur, plateau);
	Joueur joueur4 = new Joueur("", "", 0, 4, domJoueur, plateau);

	public Jeu() {
		menu();

	}

	public void menu() {
		System.out.println("Combien de joueurs êtes-vous?");
		int nbJoueurs = reader.nextInt();

		switch (nbJoueurs) {
		case 2:
			deuxJoueurs();
			listDom = enleveDomino(nbJoueurs, listDom);
			premierTour(listeJoueur, nbJoueurs);
			tourGeneral(listeJoueur, nbJoueurs);
			break;
		case 3:
			troisJoueurs();
			listDom = enleveDomino(nbJoueurs, listDom);
			premierTour(listeJoueur, nbJoueurs);
			tourGeneral(listeJoueur, nbJoueurs);
			break;
		case 4:
			quatreJoueurs();
			premierTour(listeJoueur, nbJoueurs);
			tourGeneral(listeJoueur, nbJoueurs);
			break;
		default:
			System.out.println("Vous devez être entre 2 et 4 joueurs");
			break;

		}

	}

	public ArrayList<Joueur> deuxJoueurs() {
		String entr = "";

		System.out.println("Joueur1, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur1.setNom(entr);
		this.joueur1.setScore(0);
		this.joueur1.setNumeroJoueur(1);
		Plateau plateau1 = new Plateau();
		this.joueur1.setPlateau(plateau1);
		ArrayList<Domino> domJoueur1 = new ArrayList<Domino>();
		this.joueur1.setDomJoueur(domJoueur1);
		System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur1.setCouleur(entr);
		listeJoueur.add(joueur1);

		System.out.println("Joueur2, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur2.setNom(entr);
		this.joueur2.setScore(0);
		this.joueur2.setNumeroJoueur(2);
		Plateau plateau2 = new Plateau();
		this.joueur1.setPlateau(plateau2);
		ArrayList<Domino> domJoueur2 = new ArrayList<Domino>();
		this.joueur2.setDomJoueur(domJoueur2);
		System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur2.setCouleur(entr);
		listeJoueur.add(joueur2);
		// Verifier que la couleur n'a pas déjà été selectionnée

		return listeJoueur;

	}

	public ArrayList<Joueur> troisJoueurs() {
		String entr = "";

		System.out.println("Joueur1, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur1.setNom(entr);
		this.joueur1.setScore(0);
		this.joueur1.setNumeroJoueur(1);
		Plateau plateau1 = new Plateau();
		this.joueur1.setPlateau(plateau1);
		ArrayList<Domino> domJoueur1 = new ArrayList<Domino>();
		this.joueur1.setDomJoueur(domJoueur1);
		System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur1.setCouleur(entr);
		listeJoueur.add(joueur1);

		System.out.println("Joueur2, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur2.setNom(entr);
		this.joueur2.setScore(0);
		this.joueur2.setNumeroJoueur(2);
		Plateau plateau2 = new Plateau();
		this.joueur1.setPlateau(plateau2);
		ArrayList<Domino> domJoueur2 = new ArrayList<Domino>();
		this.joueur2.setDomJoueur(domJoueur2);
		System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur2.setCouleur(entr);
		listeJoueur.add(joueur2);

		System.out.println("Joueur3, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur3.setNom(entr);
		this.joueur3.setScore(0);
		this.joueur3.setNumeroJoueur(3);
		Plateau plateau3 = new Plateau();
		this.joueur1.setPlateau(plateau3);
		ArrayList<Domino> domJoueur3 = new ArrayList<Domino>();
		this.joueur3.setDomJoueur(domJoueur3);
		System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur3.setCouleur(entr);
		listeJoueur.add(joueur3);

		return listeJoueur;
	}

	public ArrayList<Joueur> quatreJoueurs() {

		String entr = "";

		System.out.println("Joueur1, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur1.setNom(entr);
		this.joueur1.setScore(0);
		this.joueur1.setNumeroJoueur(1);
		Plateau plateau1 = new Plateau();
		this.joueur1.setPlateau(plateau1);
		ArrayList<Domino> domJoueur1 = new ArrayList<Domino>();
		this.joueur1.setDomJoueur(domJoueur1);
		System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur1.setCouleur(entr);
		listeJoueur.add(joueur1);

		System.out.println("Joueur2, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur2.setNom(entr);
		this.joueur2.setScore(0);
		this.joueur2.setNumeroJoueur(2);
		Plateau plateau2 = new Plateau();
		this.joueur1.setPlateau(plateau2);
		ArrayList<Domino> domJoueur2 = new ArrayList<Domino>();
		this.joueur2.setDomJoueur(domJoueur2);
		System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur2.setCouleur(entr);
		listeJoueur.add(joueur2);

		System.out.println("Joueur3, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur3.setNom(entr);
		this.joueur3.setScore(0);
		this.joueur3.setNumeroJoueur(3);
		Plateau plateau3 = new Plateau();
		this.joueur1.setPlateau(plateau3);
		ArrayList<Domino> domJoueur3 = new ArrayList<Domino>();
		this.joueur3.setDomJoueur(domJoueur3);
		System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur3.setCouleur(entr);
		listeJoueur.add(joueur3);

		System.out.println("Joueur4, choisissez un nom d'utilisateur:");
		entr = reader.next();
		this.joueur4.setNom(entr);
		this.joueur4.setScore(0);
		this.joueur4.setNumeroJoueur(4);
		Plateau plateau4 = new Plateau();
		this.joueur1.setPlateau(plateau4);
		ArrayList<Domino> domJoueur4 = new ArrayList<Domino>();
		this.joueur4.setDomJoueur(domJoueur4);
		System.out.println("Joueur4, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur4.setCouleur(entr);
		listeJoueur.add(joueur4);

		return listeJoueur;
	}

	public int tirageJoueur(int nbJoueurs) {
		// appel aléatoire d'un joueur pour tirer au sort les rois:

		int i = (int) Math.random() * nbJoueurs;
		if (i == joueur1.getNumeroJoueur()) {
			System.out.println(joueur1.getNom() + " vous avez été sélectionné(e) pour tirer les rois au sort");
			return i;
		} else if (i == joueur2.getNumeroJoueur()) {
			System.out.println(joueur2.getNom() + " vous avez été sélectionné(e) pour tirer les rois au sort");
			return i;
		} else if (i == joueur3.getNumeroJoueur()) {
			System.out.println(joueur3.getNom() + " vous avez été sélectionné(e) pour tirer les rois au sort");
			return i;
		} else if (i == joueur4.getNumeroJoueur()) {
			System.out.println(joueur4.getNom() + " vous avez été sélectionné(e) pour tirer les rois au sort");
			return i;
		}
		return i;
	}

	// appuyer sur entrée pour générer un roi au hasard (pour la suite)

	public static ArrayList<Domino> enleveDomino(int nbJoueurs, ArrayList<Domino> listDom) {
		int count = 0;

		if (nbJoueurs == 2) {
			while (listDom.size() != 24) {

				int i = (int) (Math.random() * (47 - count));
				listDom.remove(i);
				count++;

			}

		} else if (nbJoueurs == 3) {

			while (listDom.size() != 36) {
				int i = (int) (Math.random() * (47 - count));
				listDom.remove(i);
				count++;

			}

		}
		/*
		 * for (int i = 0; i<listDom.size(); i++) {
		 * System.out.println(listDom.get(i).getNumeroDomino()); }
		 */
		return listDom;

	}

	/*
	 * PIOCHE
	 */

	public void premierTour(ArrayList<Joueur> listeJoueur, int nbJoueurs) {
		ArrayList<Joueur> listeJoueurBis = new ArrayList<Joueur>();
		ArrayList<Domino> dominoCourant = new ArrayList<Domino>();

		listeJoueurBis.addAll(listeJoueur); // on cree une listeJoueurBis pour pouvoir manipuler les joueurs (sinon dans
		Collections.shuffle(listeJoueurBis);									// Tour général listeJoueur bugg)
		int count = 0;
		// int numJoueur = tirageJoueur(nbJoueurs);
		if (listDom.size() == 36) {
			do {
				int i = (int) (Math.random() * (listDom.size() - count)); // prend un nb aleatoire en fct de la taille
																			// de la liste de domino

				dominoCourant.add(listDom.get(i)); // on met le nb aleatoire dans la liste domino courant
				listDom.remove(i); // et on l'enlève de listDom pr pas piocher le même numéro
				count++;

			} while (dominoCourant.size() != 3); // on continue tant que la pioche dominoCourant n'est pas egale a 3

		} else if (listDom.size() == 48 || listDom.size() == 24) { // pioche pour 2 ou 4 joueurs
			do {
				int i = (int) (Math.random() * (listDom.size() - count));
				dominoCourant.add(listDom.get(i));
				listDom.remove(i);
				count++;

			} while (dominoCourant.size() != 4);

		}
		ArrayList<Integer> affNumDomino = new ArrayList<Integer>(); // liste temporaire qui stocke les numeros des
																	// dominos piochés pour les trier ensuite
		for (int i = 0; i < dominoCourant.size(); i++) {
			affNumDomino.add(dominoCourant.get(i).getNumeroDomino());
		}
		Collections.sort(affNumDomino); // tri les dominos
		
		
		do {
			int nbJoueursBis = listeJoueurBis.size();
			int premierTour = 1;
			int j = (int) (Math.random()*nbJoueursBis);
			String couleurRoi = listeJoueurBis.get(j).getCouleur();
			System.out.println("Le roi de la couleur " + couleurRoi + " doit jouer !");
			System.out.println("\n Veuillez choisir un de ces dominos : \n");

			for (int i = 0; i < dominoCourant.size(); i++) {
				System.out.println(affNumDomino.get(i));
			}
			boolean cond; // cond veut dire condition
			do {

				int reponse = reader.nextInt();
				if (affNumDomino.contains(reponse)) {
					listeJoueurBis.get(j).setDomJoueurElement(retourneDomino(dominoCourant, reponse));
					// ajouter a la liste de dominos du joueur le domino qu'il vient de choisir
					System.out.println("Le roi " + couleurRoi + " a choisi le domino numéro " + reponse);
					System.out.println("Le domino que vous devez placer a pour terrains : "
							+ retourneDomino(dominoCourant, reponse).getType1() + " , "
							+ retourneDomino(dominoCourant, reponse).getType2());
					listeJoueurBis.get(j).getPlateau().afficherPlateau();
					listeJoueurBis.get(j).getPlateau().placerDomino(retourneDomino(dominoCourant, reponse), premierTour);
					System.out.println("Voici le plateau de " + listeJoueurBis.get(j).getNom() + " :");
					listeJoueurBis.get(j).getPlateau().afficherPlateau();
					dominoCourant.remove(dominoCourant.indexOf(retourneDomino(dominoCourant, reponse)));
					affNumDomino.remove(affNumDomino.indexOf(reponse));

					cond = true;
				} else {
					System.out.println("Ce numéro de domino ne figure pas sur la liste, recommencez.");
					cond = false;
				}
			} while (cond = false);

			listeJoueurBis.remove(j);
		} while (!listeJoueurBis.isEmpty());
	}

	public void tourGeneral(ArrayList<Joueur> listeJoueur, int nbJoueurs) {
		ArrayList<Joueur> listeJoueurBis = new ArrayList<Joueur>();
		ArrayList<Domino> dominoCourant = new ArrayList<Domino>();

		do {
			listeJoueurBis.addAll(listeJoueur);// on cree une listeJoueurBis pour pouvoir manipuler les joueurs (sinon dans
			System.out.println(listeJoueurBis);
							// Tour général listeJoueur bugg)
			int count = 0;
			if (nbJoueurs == 3) {
				do {
					int i = (int) (Math.random() * (listDom.size() - count)); // prend un nb aleatoire en fct de la
																				// taille de la liste de domino
					dominoCourant.add(listDom.get(i)); // on met le nb aleatoire dans la liste domino courant
					listDom.remove(i); // et on l'enlève de listDom pr pas piocher le même numéro
					count++;

				} while (dominoCourant.size() != 3); // on continue tant que la pioche dominoCourant n'est pas egale a 3

			} else if (nbJoueurs == 2 || nbJoueurs == 4) { // pioche pour 2 ou 4 joueurs
				do {
					int i = (int) (Math.random() * (listDom.size() - count));
					dominoCourant.add(listDom.get(i));
					listDom.remove(i);
					count++;

				} while (dominoCourant.size() != 4);

			}

			ArrayList<Integer> affNumDomino = new ArrayList<Integer>(); // liste temporaire qui stocke les numeros des
																		// dominos piochés pour les trier ensuite
			for (int i = 0; i < dominoCourant.size(); i++) {
				affNumDomino.add(dominoCourant.get(i).getNumeroDomino());
			}
			Collections.sort(affNumDomino); // tri les dominos
			
			Joueur premierJoueur = null;
			for (Joueur joueur: listeJoueurBis) {
				if (premierJoueur == null || premierJoueur.getSmallestDomino().getNumeroDomino() > joueur.getSmallestDomino().getNumeroDomino()) {
					premierJoueur = joueur;

				}
			}
			
			listeJoueurBis.remove(premierJoueur);
			listeJoueurBis.add(0, premierJoueur);


			do {
				int nbJoueursBis = listeJoueurBis.size();
				int tourGeneral = 2;
				String couleurRoi = listeJoueurBis.get(0).getCouleur();
				System.out.println("Le roi de la couleur " + couleurRoi + " doit jouer !");
				System.out.println("\n Veuillez choisir un de ces dominos : \n");
				for (int i = 0; i < dominoCourant.size(); i++) {
					System.out.println(affNumDomino.get(i));
				}
				boolean cond; // cond veut dire condition
				do {

					int reponse = reader.nextInt();
					if (affNumDomino.contains(reponse)) {
						listeJoueurBis.get(0).setDomJoueurElement(retourneDomino(dominoCourant, reponse));
						// ajouter a la liste de dominos du joueur le domino qu'il vient de choisir
						System.out.println("Le roi " + couleurRoi + " a choisi le domino numéro " + reponse);
						System.out.println("Le domino que vous devez placer a pour terrains : "
								+ retourneDomino(dominoCourant, reponse).getType1() + " , "
								+ retourneDomino(dominoCourant, reponse).getType2());
						
						listeJoueurBis.get(0).getPlateau().afficherPlateau();
						listeJoueurBis.get(0).getPlateau().placerDomino(retourneDomino(dominoCourant, reponse), tourGeneral);
						System.out.println("Voici le plateau de " + listeJoueurBis.get(0).getNom() + " :");
						listeJoueurBis.get(0).getPlateau().afficherPlateau();
						dominoCourant.remove(dominoCourant.indexOf(retourneDomino(dominoCourant, reponse)));
						affNumDomino.remove(affNumDomino.indexOf(reponse));

						cond = true;
					} else {
						System.out.println("Ce numéro de domino ne figure pas sur la liste, recommencez.");
						cond = false;
					}
				} while (cond = false);

				listeJoueurBis.remove(0);
			} while (!listeJoueurBis.isEmpty());
		} while (!listDom.isEmpty());
	}

	public Domino retourneDomino(ArrayList<Domino> domList, int numeroDomino) {
		// parcourt la liste des dominos courants et qui prend en argument la reponse de
		// l'utilisateur et retourne le domino correspondant
		Domino domino = null;
		for (int i = 0; i < domList.size(); i++) {
			if (domList.get(i).getNumeroDomino() == numeroDomino) {
				domino = domList.get(i); // domino est une variable locale
				break;
			} else {
				domino = null;
			}
		}

		return domino;
	}
	// public static ArrayList<Domino> recupereDomino() {
	// BufferedReader csvReader = null;
	//
	// String csvLine;
	// String csvSplitter = ",";
	// ArrayList<Domino> ofck = new ArrayList<Domino>();
	// try {
	// csvReader = new BufferedReader(new FileReader(csvPath));
	// while ((csvLine = csvReader.readLine()) != null) {
	// String[] dominos = csvLine.split(csvSplitter);
	// Domino domino = new Domino(dominos[4], dominos[0], dominos[1], dominos[2],
	// dominos[3], "");
	// ofck.add(domino);
	// }
	// } catch (Exception e) {
	// System.out.println("Une erreur est survenue.");
	// }
	// return ofck;
	// }

}
