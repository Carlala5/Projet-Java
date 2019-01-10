package AnaisCarla;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Jeu {
	
	static String csvPath = "/Users/carladeruelle/Desktop/Projet-Java/src/dominos.csv";
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Domino> deck = buildDeck();
	Map <Integer, Domino> ListeDomino = new HashMap<Integer, Domino>();
	ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>();
	Joueur joueur1 = new Joueur("","",0,1,0);
	Joueur joueur2 = new Joueur("","",0,2,0);
	Joueur joueur3 = new Joueur("","",0,3,0);
	Joueur joueur4 = new Joueur("","",0,4,0);
	
public Jeu () {
	menu();
	
}


public void menu() {
	System.out.println("Combien de joueurs êtes-vous?");
	int nbJoueurs = reader.nextInt();
	
	switch (nbJoueurs) {
	case 2 : deuxJoueurs();
	deck = buildDeck();
	deck = trimDeck(nbJoueurs,deck);
	//premierTour(nbJoueurs);
	break;
	case 3 : troisJoueurs();
	break;
	case 4 : quatreJoueurs();
	break;
	default : System.out.println("Vous devez être entre 2 et 4 joueurs");
	break;
		
}

}


public ArrayList<Joueur> deuxJoueurs () {
	String entr = "";
	
	System.out.println("Joueur1, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur1.setNom(entr);
	this.joueur1.setScore(0);
	this.joueur1.setNumeroJoueur(1);
	System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur1.setCouleur(entr);
	listeJoueur.add(joueur1);
	
	
	System.out.println("Joueur2, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur2.setNom(entr);
	this.joueur2.setScore(0);
	this.joueur2.setNumeroJoueur(2);
	System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur2.setCouleur(entr);
	listeJoueur.add(joueur2);
// Verifier que la couleur n'a pas déjà été selectionnée
	
	return listeJoueur;
	
	
}

public ArrayList<Joueur>  troisJoueurs () {
	String entr = "";
	
	System.out.println("Joueur1, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur1.setNom(entr);
	this.joueur1.setScore(0);
	this.joueur1.setNumeroJoueur(1);
	System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur1.setCouleur(entr);
	listeJoueur.add(joueur1);
	
	System.out.println("Joueur2, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur2.setNom(entr);
	this.joueur2.setScore(0);
	this.joueur2.setNumeroJoueur(2);
	System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur2.setCouleur(entr);
	listeJoueur.add(joueur2);
	
	System.out.println("Joueur3, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur3.setNom(entr);
	this.joueur3.setScore(0);
	this.joueur3.setNumeroJoueur(3);
	System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur3.setCouleur(entr);
	listeJoueur.add(joueur3);
	
	
	return listeJoueur;
}	
	
public ArrayList<Joueur>  quatreJoueurs () {

	String entr = "";
	
	System.out.println("Joueur1, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur1.setNom(entr);
	this.joueur1.setScore(0);
	this.joueur1.setNumeroJoueur(1);
	System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur1.setCouleur(entr);
	listeJoueur.add(joueur1);
	
	System.out.println("Joueur2, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur2.setNom(entr);
	this.joueur2.setScore(0);
	this.joueur2.setNumeroJoueur(2);
	System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur2.setCouleur(entr);
	listeJoueur.add(joueur2);
	
	System.out.println("Joueur3, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur3.setNom(entr);
	this.joueur3.setScore(0);
	this.joueur3.setNumeroJoueur(3);
	System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur3.setCouleur(entr);
	listeJoueur.add(joueur3);
	

	System.out.println("Joueur4, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur4.setNom(entr);
	this.joueur4.setScore(0);
	this.joueur4.setNumeroJoueur(4);
	System.out.println("Joueur4, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur4.setCouleur(entr);
	listeJoueur.add(joueur4);
	
	return listeJoueur;
}		
	
public int tirageJoueur (int nbJoueurs) {
	// appel aléatoire d'un joueur pour tirer au sort les rois:
	
	int i = (int) Math.random()*nbJoueurs;
	if (i == joueur1.getNumeroJoueur()){
		System.out.println(joueur1.getNom() +" vous avez été sélectionné pour tirer les rois au sort");	
		return i;
	}
	else if (i == joueur2.getNumeroJoueur()) {
		System.out.println(joueur2.getNom() +" vous avez été sélectionné pour tirer les rois au sort");
		return i;
	}
	else if (i == joueur3.getNumeroJoueur()) {
		System.out.println(joueur3.getNom() +" vous avez été sélectionné pour tirer les rois au sort");
		return i;
	}
	else if (i == joueur4.getNumeroJoueur()) {
		System.out.println(joueur4.getNom() +" vous avez été sélectionné pour tirer les rois au sort");
		return i;
	}
	return i;
}

//appuyer sur entrée pour générer un roi au hasard (pour la suite)



public void premierTour(ArrayList<Joueur> listeJoueur) {
	ArrayList<Joueur> listeJoueurBis = new ArrayList<Joueur>();
	ArrayList<Domino> dominoCourant = new ArrayList<Domino>();
	
	
	listeJoueurBis = listeJoueur;
	int nbJoueurs;
	int j;
	int count = 0;
	//int numJoueur = tirageJoueur(nbJoueurs);
	if(deck.size() == 36) {		
		do{ 
			int i = (int) (Math.random() * (deck.size()-count));
			dominoCourant.add(deck.get(i));
			deck.remove(i);
			count++;
		}while(dominoCourant.size() != 3);
	}else {
		do{ 
			int i = (int) (Math.random() * (deck.size()-count));
			dominoCourant.add(deck.get(i));
			deck.remove(i);
			count++;
		}while(deck.size() != 4);
	}



	do { 
		nbJoueurs = listeJoueurBis.size(); 
		j = (int)Math.random()*nbJoueurs;
		String couleurRoi = listeJoueurBis.get(j).getCouleur();
		System.out.println("Le roi de la couleur " +couleurRoi+ " doit jouer !");
		
		
		
		
	}while(!listeJoueurBis.isEmpty());
	
	
	
	
	
	
	
	
	
	
	
}

public static ArrayList<Domino> buildDeck() {
	BufferedReader csvReader = null;

	String csvLine;
	String csvSplitter = ",";
	ArrayList<Domino> ofck = new ArrayList<Domino>();
	try {
		csvReader = new BufferedReader(new FileReader(csvPath));
		while ((csvLine = csvReader.readLine()) != null) {
			String[] dominos = csvLine.split(csvSplitter);
			Domino domino = new Domino(dominos[4], dominos[0], dominos[1], dominos[2], dominos[3], "");
			ofck.add(domino);
		}
	} catch (Exception e) {
		System.out.println("Une erreur est survenue.");
	}
	return ofck;
}

public static ArrayList<Domino> trimDeck(int nbplay, ArrayList<Domino> deck) {
	int count = 0;
	Random rand = new Random();
	
	if (nbplay == 2) {
		while (deck.size() != 24) { 
			
			int i = (int) (Math.random() * (48-count));
			deck.remove(i);
			count++;
		}
	} else if (nbplay == 3) {
		while (deck.size() != 36) {
			int i = (int) (Math.random() * (48-count));
			deck.remove(i);
			count++;
		}

	}
	return deck;
}

}







	
	
	
	
	
	
//		
//public void chargeLibrairieDominos(String chemin) {
//	this.ouvreFichierCSV(chemin);
//	this.construitLibrairie();
//	}
//		
//private void ouvreFichierCSV(String chemin) {
//	try {
//		Scanner scanner = new Scanner(new File("src/dominos.csv"));//continuer dans le try nos instructions
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//}
//}
//private void construitLibrairie() {
//	
//	while (){
//		
//		
//	}
//	
//	NbCouronne1 = this.NbCouronne1;
//	Type1 = this.Type1;
//	NbCouronne2 = this.NbCouronne2;
//	Type2 = this.Type2;
//	
//	
//	
//}
//

//}
//ThreadLocalRandom.current().nextInt
