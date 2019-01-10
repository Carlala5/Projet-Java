package AnaisCarla;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Jeu {

	Map <Integer, Dominos> ListeDomino = new HashMap<Integer, Dominos>();
	ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>();
	Scanner reader = new Scanner(System.in);
	Joueur joueur1;
	Joueur joueur2;
	Joueur joueur3;
	Joueur joueur4;
	
public Jeu () {
	menu();
	
}


public void menu() {
	System.out.println("Combien de joueurs êtes-vous?");
	int nbJoueurs = reader.nextInt();
	
	switch (nbJoueurs) {
	case 2 : deuxJoueurs();
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
	ArrayList<DominoCSVtoArrayList.Test> dominoCourant = new ArrayList<DominoCSVtoArrayList.Test>();
	
	
	listeJoueurBis = listeJoueur;
	int nbJoueurs;
	int j;
	//int numJoueur = tirageJoueur(nbJoueurs);
	
	do { 
		nbJoueurs = listeJoueurBis.size(); 
		j = (int)Math.random()*nbJoueurs;
		String couleurRoi = listeJoueurBis.get(j).getCouleur();
		System.out.println("Le roi de la couleur " +couleurRoi+ " doit jouer !");
		
		
		
		
	}while(!listeJoueurBis.isEmpty());
	
	
	
	
	
	
	
	
	
	
	
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
