package AnaisCarla;

import java.util.Scanner;
import java.util.*;

public class Joueur {

// Stocke le nom de chaque joueur	
private String nom;
private String couleur;
private int score;
private int numeroJoueur;
private ArrayList<Domino> domJoueur = new ArrayList<Domino>(); //un joueur va avoir sa propre liste de domino
private Plateau plateau;

//Constructeur par defaut
public Joueur(String nom, String couleur, int score, int numeroJoueur, ArrayList<Domino> domJoueur, Plateau plateau) {
	this.nom = nom;
	this.couleur = couleur;
	this.score = score;
	this.numeroJoueur = numeroJoueur;
	this.domJoueur = domJoueur;
	this.plateau = plateau;
}
//setter = méthode qui permet de definir un seul attribut en particulier (modification en direct) utiliser void
//getter = méthode qui permet de renvoyer un attribut un attribut en particulier

	
public void setNom (String nom) {
	this.nom = nom;
	
}
public String getNom() {
	return nom;
}

public void setCouleur (String couleur) {
	this.couleur = couleur;
	
}
public String getCouleur() {
	return couleur;
}

public void setScore (int score) {
	this.score = score;
}

public int getScore() {
	return score;
}

public void setNumeroJoueur (int numeroJoueur) {
	this.numeroJoueur = numeroJoueur;
}

public int getNumeroJoueur () {
	return numeroJoueur;
}

public Domino getSmallestDomino() {
	Domino smallest = null;
	if (this.domJoueur.size() == 0) {
		System.out.println("Aucun domino pour ce joueur");
		System.out.println(this.toString());
	}
	for (Domino domino: this.domJoueur) {
		if (smallest == null || smallest.getNumeroDomino() > domino.getNumeroDomino()) {
			smallest = domino;
		}
	}
	return smallest;
}

public void setDomJoueur ( ArrayList<Domino> domJoueur) { //liste entière
	this.domJoueur = domJoueur;
}
public void setDomJoueurElement(Domino domino) { //un élément de la liste
	this.domJoueur.add(domino);// on ajoute un domino (le domino pioché par le joueur) à sa propre liste de dominos
}

public ArrayList <Domino> getDomJoueur (){
	return domJoueur;
}
public Domino getDomJoueurElement(int i){
	return domJoueur.get(i);
}
public void setPlateau(Plateau plateau){
	this.plateau = plateau;
}
public Plateau getPlateau() {
	return plateau; 
}


}






			


