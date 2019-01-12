package AnaisCarla;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;

public class Jeu {

	static String csvPath = "dominos.csv";
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

	public void menu() { //menu qui demande le nombre de joueurs
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

	/* 2 JOUEURS */

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

	/* 3 JOUEURS */

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
		this.joueur3.setPlateau(plateau3);
		ArrayList<Domino> domJoueur3 = new ArrayList<Domino>();
		this.joueur3.setDomJoueur(domJoueur3);
		System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur3.setCouleur(entr);
		listeJoueur.add(joueur3);

		return listeJoueur;
	}

	/* 4 JOUEURS */

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
		this.joueur2.setPlateau(plateau2);
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
		this.joueur3.setPlateau(plateau3);
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
		this.joueur4.setPlateau(plateau4);
		ArrayList<Domino> domJoueur4 = new ArrayList<Domino>();
		this.joueur4.setDomJoueur(domJoueur4);
		System.out.println("Joueur4, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
		entr = reader.next();
		this.joueur4.setCouleur(entr);
		listeJoueur.add(joueur4);

		return listeJoueur;
	}

	/*
	 * Permet de generer la liste de dominos dans laquelle on va pouvoir piocher
	 */

	public static ArrayList<Domino> enleveDomino(int nbJoueurs, ArrayList<Domino> listDom) {
		int count = 0;

		if (nbJoueurs == 2) {

			/*
			 * Si le nombre de joueurs est egal a 2 On retire des dominos aleatoirement a
			 * listDom tant que listDom n est pas egal a 24
			 */

			while (listDom.size() != 24) {

				/*
				 * Math.random() permet de renvoyer un nombre aleatoire entre [0,1[ Faire
				 * Math.random() * (47 - count) permet de couvrir un autre intervalle En premier
				 * count = 0 Math.random() * (47) va prendre un nombre aleatoire entre 0 et 48
				 */

				int i = (int) (Math.random() * (47 - count));

				listDom.remove(i); // on retire un domino et listeDom se reduit petit a petit
				count++; // incrementation
			}

			/*
			 * Sinon si le nombre de joueurs est egal a 3 On retire des dominos
			 * aleatoirement a listDom tant que listDom n est pas egal a 36
			 */

		} else if (nbJoueurs == 3) {

			while (listDom.size() != 36) {
				int i = (int) (Math.random() * (47 - count));
				listDom.remove(i); // on retire un domino et listDom se reduit petit a petit
				count++; // incrementation
			}
		}
		return listDom;
	}


	public void premierTour(ArrayList<Joueur> listeJoueur, int nbJoueurs) {

		/*
		 * On cree une listeJoueurBis pour pouvoir manipuler les joueurs. Ainsi,
		 * listeJoueurs n est pas modifiee
		 */
		ArrayList<Joueur> listeJoueurBis = new ArrayList<Joueur>();
		ArrayList<Domino> dominoCourant = new ArrayList<Domino>(); // dominoCourant stocke les dominos qui vont etre pioches

		listeJoueurBis.addAll(listeJoueur);
		Collections.shuffle(listeJoueurBis);
		
		
		/** Generation de la pioche de dominos **/
		
		/*
		 * En fonction de la taille de la liste listDom (donc en fonction du nombre de joueurs)
		 * on prend un nombre aleatoire de listDom, on l ajoute a dominoCourant et on l enleve de listDom 
		 * pour pas qu il soit pioche une seconde fois. On fait cela tant que notre pioche n a pas le bon 
		 * nombre de dominos souhaite
		 */
		int count = 0;
		if (listDom.size() == 36) { 
			do {
				int i = (int) (Math.random() * (listDom.size() - count)); // prend un domino aleatoire de listDom																
				dominoCourant.add(listDom.get(i)); // ajout du domino aleatoire dans dominoCourant
				listDom.remove(i); // retrait du domino aleatoire de listDom
				count++; //incrementation

			} while (dominoCourant.size() != 3); // on boucle tant que la pioche dominoCourant n est pas egale a 3

		} else if (listDom.size() == 48 || listDom.size() == 24) { // pioche pour 2 ou 4 joueurs (meme nb de dominos dans la pioche), meme principe
			do {
				int i = (int) (Math.random() * (listDom.size() - count));
				dominoCourant.add(listDom.get(i));
				listDom.remove(i);
				count++; //incrementation

			} while (dominoCourant.size() != 4); // on boucle tant que la pioche dominoCourant n est pas egale a 4
		}
		
		
		ArrayList<Integer> affNumDomino = new ArrayList<Integer>(); 
		/*
		 *  affNumDomino est une liste temporaire a laquelle 
		 *  on ajoute les numeros des dominos qui sont dans dominoCourant
		 *  pour pouvoir trier les numeros de dominos par ordre croissant et les piocher ensuite
		 */
		
		for (int i = 0; i < dominoCourant.size(); i++) {
			affNumDomino.add(dominoCourant.get(i).getNumeroDomino());
		}
		Collections.sort(affNumDomino); // tri les numeros de domino de la liste affNumDomino par ordre croissant

		do {
			int nbJoueursBis = listeJoueurBis.size(); // nbJoueurBis est egal a la taille de la liste listeJoueurBis donc au nombre de joueurs
			int premierTour = 1;
			int j = (int) (Math.random() * nbJoueursBis); // tirage au hasard d un entier entre 0 et le nombre de joueurs
			String couleurRoi = listeJoueurBis.get(j).getCouleur(); // on veut la couleur du roi du joueur dont le numero a ete tire au hasard
			
			System.out.println("Le roi de la couleur " + couleurRoi + " doit jouer !");
			System.out.println("\n Veuillez choisir un de ces dominos : \n");

			for (int i = 0; i < dominoCourant.size(); i++) { // Boucle for qui permet d afficher les numeros de dominos de la pioche
			/******************** pourquoi mettre dominoCourant.size() et pas affNumDomino.size() ?? ********************/
				
				System.out.println(affNumDomino.get(i)+ ", Face 1 : "+retourneDomino(dominoCourant, affNumDomino.get(i)).getType1()+ ", " +retourneDomino(dominoCourant, affNumDomino.get(i)).getNbCouronne1() + " | Face 2 : " +retourneDomino(dominoCourant, affNumDomino.get(i)).getType2()+ ", " +retourneDomino(dominoCourant, affNumDomino.get(i)).getNbCouronne2()); 
			}
			
			boolean cond; // condition
			do {
				int reponse = reader.nextInt(); // lecture de la reponse
				
				if (affNumDomino.contains(reponse)) { // si la reponse de l utilisateur est contenue dans la liste de numeros de dominos					
					listeJoueurBis.get(j).setDomJoueurElement(retourneDomino(dominoCourant, reponse)); // ajoute a la liste de dominos du joueur le domino qu'il vient de choisir
					System.out.println("Le roi " + couleurRoi + " a choisi le domino numéro " + reponse); // rappelle au joueur quel domino il vient de choisir
					System.out.println("Le domino que vous devez placer a pour terrains : "
							+ retourneDomino(dominoCourant, reponse).getType1() + " , "
							+ retourneDomino(dominoCourant, reponse).getType2()); // dit au joueur les types de terrains que possede son domino
					listeJoueurBis.get(j).getPlateau().afficherPlateau(); // affiche le plateau initial au joueur pour qu'il puisse choisir ou placer son domino
					listeJoueurBis.get(j).getPlateau().placerDomino(retourneDomino(dominoCourant, reponse),
							premierTour); // place le domino a l endroit ou le joueur a dit de le placer
					System.out.println("Voici le plateau de " + listeJoueurBis.get(j).getNom() + " :"); // pour dire a qui appartient le plateau qui va etre affiche
					listeJoueurBis.get(j).getPlateau().afficherPlateau(); // affiche le plateau du joueur avec les dominos poses
					
					dominoCourant.remove(dominoCourant.indexOf(retourneDomino(dominoCourant, reponse)));
					affNumDomino.remove(affNumDomino.indexOf(reponse));

					cond = true;
				} else {
					System.out.println("Ce numéro de domino ne figure pas sur la liste, recommencez.");
//					System.out.println("Le roi de la couleur " + couleurRoi + " doit jouer !");
//					System.out.println("\n Veuillez choisir un de ces dominos : \n");
//
//					for (int i = 0; i < dominoCourant.size(); i++) { // Boucle for qui permet d afficher les numeros de dominos de la pioche
//					/******************** pourquoi mettre dominoCourant.size() et pas affNumDomino.size() ?? ********************/
//						
//						System.out.println(affNumDomino.get(i)); 
//					}
					
					cond = false;
				}
			} while (cond = false); //je pense qu'il faut mettre true...

			listeJoueurBis.remove(j);
		} while (!listeJoueurBis.isEmpty()); // faire ces operations tant que la liste tous les joueurs n ont pas joue
		
	}// fin du premierTour

	public void tourGeneral(ArrayList<Joueur> listeJoueur, int nbJoueurs) {
		
		/*
		 * On cree une listeJoueurBis pour pouvoir manipuler les joueurs. Ainsi,
		 * listeJoueurs n est pas modifiee
		 */
		
		ArrayList<Joueur> listeJoueurBis = new ArrayList<Joueur>();
		ArrayList<Domino> dominoCourant = new ArrayList<Domino>();

		do {
			listeJoueurBis.addAll(listeJoueur);												
			System.out.println(listeJoueurBis);
			
			
			/** Generation de la pioche de dominos **/
			
			/*
			 * En fonction de la taille de la liste listDom (donc en fonction du nombre de joueurs)
			 * on prend un nombre aleatoire de listDom, on l ajoute a dominoCourant et on l enleve de listDom 
			 * pour pas qu il soit pioche une seconde fois. On fait cela tant que notre pioche n a pas le bon 
			 * nombre de dominos souhaite
			 */
			
			int count = 0;
			if (nbJoueurs == 3) {
				do {
					int i = (int) (Math.random() * (listDom.size() - count)); // prend un domino aleatoire de listDom																					
					dominoCourant.add(listDom.get(i)); // ajout du domino aleatoire dans dominoCourant
					listDom.remove(i); // retrait du domino aleatoire de listDom
					count++; // incrementation

				} while (dominoCourant.size() != 3); // on boucle tant que la pioche dominoCourant n est pas egale a 3

			} else if (nbJoueurs == 2 || nbJoueurs == 4) { // pioche pour 2 ou 4 joueurs (meme nb de dominos dans la pioche), meme principe
				do {
					int i = (int) (Math.random() * (listDom.size() - count));
					dominoCourant.add(listDom.get(i));
					listDom.remove(i);
					count++; // incrementation

				} while (dominoCourant.size() != 4); // on boucle tant que la pioche dominoCourant n est pas egale a 4

			}

			ArrayList<Integer> affNumDomino = new ArrayList<Integer>(); 
			/*
			 *  affNumDomino est une liste temporaire a laquelle 
			 *  on ajoute les numeros des dominos qui sont dans dominoCourant
			 *  pour pouvoir trier les numeros de dominos par ordre croissant et les piocher ensuite
			 */			
			
			for (int i = 0; i < dominoCourant.size(); i++) {
				affNumDomino.add(dominoCourant.get(i).getNumeroDomino());
			}
			Collections.sort(affNumDomino); // tri les numeros de domino de la liste affNumDomino par ordre croissant

			Joueur premierJoueur = null;
			for (Joueur joueur : listeJoueurBis) {
				if (premierJoueur == null || premierJoueur.getSmallestDomino().getNumeroDomino() > joueur
						.getSmallestDomino().getNumeroDomino()) {
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
				boolean cond; // condition
				do {
					int reponse = reader.nextInt(); // lecture de la reponse
					if (affNumDomino.contains(reponse)) { // si la reponse de l utilisateur est contenue dans la liste de numeros de dominos
						listeJoueurBis.get(0).setDomJoueurElement(retourneDomino(dominoCourant, reponse)); // ajoute a la liste de dominos du joueur le domino qu'il vient de choisir
						System.out.println("Le roi " + couleurRoi + " a choisi le domino numéro " + reponse); // rappelle au joueur quel domino il vient de choisir
						System.out.println("Le domino que vous devez placer a pour terrains : " 
								+ retourneDomino(dominoCourant, reponse).getType1() + " , "
								+ retourneDomino(dominoCourant, reponse).getType2()); // dit au joueur les types de terrains que possede son domino

						listeJoueurBis.get(0).getPlateau().afficherPlateau();// affiche le plateau initial au joueur pour qu'il puisse choisir ou placer son domino
						listeJoueurBis.get(0).getPlateau().placerDomino(retourneDomino(dominoCourant, reponse),
								tourGeneral); // place le domino a l endroit ou le joueur a dit de le placer
						System.out.println("Voici le plateau de " + listeJoueurBis.get(0).getNom() + " :"); // pour dire a qui appartient le plateau qui va etre affiche
						listeJoueurBis.get(0).getPlateau().afficherPlateau(); // affiche le plateau du joueur avec les dominos poses
						dominoCourant.remove(dominoCourant.indexOf(retourneDomino(dominoCourant, reponse)));
						affNumDomino.remove(affNumDomino.indexOf(reponse));

						cond = true;
					} else {
						System.out.println("Ce numéro de domino ne figure pas sur la liste, recommencez.");
//						faire comme en haut ?? pour que le meme joueur rechoisisse un num parmi la meme pioche
						cond = false;
					}
				} while (cond = false);

				listeJoueurBis.remove(0);
			} while (!listeJoueurBis.isEmpty());
		} while (!listDom.isEmpty());
	} //fin du tourGeneral

	public Domino retourneDomino(ArrayList<Domino> domList, int numeroDomino) {
		/* parcourt la liste des dominos courants et qui prend en argument la reponse de
		* l'utilisateur et retourne le domino correspondant
		* 
		* retourneDomino(dominoCourant, reponse)
		* Associe le numero choisi par le joueur parmi les numeros de la pioche (reponse) a un domino (en entier)
		*/ 
		
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

}
