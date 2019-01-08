package AnaisCarla;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Jeu {

	Map <Integer, Dominos> ListeDomino = new HashMap<Integer, Dominos>();
	Scanner reader = new Scanner(System.in);
	Joueur joueur1 = new Joueur("","",0,1);
	Joueur joueur2 = new Joueur("","",0,2);
	Joueur joueur3 = new Joueur("","",0,3);
	Joueur joueur4 = new Joueur("","",0,4);
	
public Jeu () {
	menu();
	
}


public void menu() {
	System.out.println("Combien de joueurs êtes-vous?");
	int nbJoueurs = reader.nextInt();
	
	switch (nbJoueurs) {
	case 2 : deuxJoueurs();
	premierTour(nbJoueurs);
	break;
	case 3 : troisJoueurs();
	break;
	case 4 : quatreJoueurs();
	break;
	default : System.out.println("Vous devez être entre 2 et 4 joueurs");
	break;
		
}

}
public void premierTour(int nbJoueurs) {
	
}
public void deuxJoueurs () {
	String entr = "";
	
	System.out.println("Joueur1, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur1.setNom(entr);
	System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur1.setCouleur(entr);
	
	System.out.println("Joueur2, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur2.setNom(entr);
	System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur2.setCouleur(entr);
// Verifier que la couleur n'a pas déjà été selectionnée
	
	
	
	
}

public void troisJoueurs () {
	String entr = "";
	
	System.out.println("Joueur1, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur1.setNom(entr);
	System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur1.setCouleur(entr);
	
	System.out.println("Joueur2, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur2.setNom(entr);
	System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur2.setCouleur(entr);
	
	System.out.println("Joueur3, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur3.setNom(entr);
	System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur3.setCouleur(entr);
}	
	
public void quatreJoueurs () {

	String entr = "";
	
	System.out.println("Joueur1, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur1.setNom(entr);
	System.out.println("Joueur1, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur1.setCouleur(entr);
	
	System.out.println("Joueur2, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur2.setNom(entr);
	System.out.println("Joueur2, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur2.setCouleur(entr);
	
	System.out.println("Joueur3, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur3.setNom(entr);
	System.out.println("Joueur3, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur3.setCouleur(entr);
	

	System.out.println("Joueur4, choisissez un nom d'utilisateur:");
	entr = reader.next();
	this.joueur4.setNom(entr);
	System.out.println("Joueur4, choisissez maintenant votre couleur (rose, jaune, vert ou bleu ) :");
	entr = reader.next();
	this.joueur4.setCouleur(entr);
}		
	
public void tirageJoueur (int nbJoueurs) {
	// appel aléatoire d'un joueur pour tirer au sort les rois:
	
	int i = (int) Math.random()*2;
	if (i == joueur1.getNumeroJoueur()){
		System.out.println(joueur1.getNom() +" vous avez été sélectionné pour tirer les rois au sort");	
	}
	else if (i == joueur2.getNumeroJoueur()) {
		System.out.println(joueur2.getNom() +" vous avez été sélectionné pour tirer les rois au sort");
	}
	else if (i == joueur3.getNumeroJoueur()) {
		System.out.println(joueur3.getNom() +" vous avez été sélectionné pour tirer les rois au sort");
	}
	else if (i == joueur4.getNumeroJoueur()) {
		System.out.println(joueur4.getNom() +" vous avez été sélectionné pour tirer les rois au sort");
	}
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
