package AnaisCarla;

import java.util.Scanner;

public class Joueur {

// Stocke le nom de chaque joueur	
private String nom;
private String couleur;
private int score;
private int numeroJoueur;
private int plateauJoueur;

//Constructeur par defaut
public Joueur(String nom, String couleur, int score, int numeroJoueur, int plateauJoueur) {
	this.nom = nom;
	this.couleur = couleur;
	this.score = score;
	this.numeroJoueur = numeroJoueur;
	this.plateauJoueur = plateauJoueur;
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

public void setPlateauJoueur ( int plateauJoueur) {
	this.plateauJoueur = plateauJoueur;
}
public int getPlateauJoueur() {
	return plateauJoueur;
}

}






			


