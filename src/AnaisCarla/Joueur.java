package AnaisCarla;

import java.util.Scanner;
import java.util.*;

public class Joueur {

// Stocke le nom de chaque joueur	
	
private String nom;
private String couleur;
private int score;
private int numeroJoueur;
private ArrayList<Domino> domJoueur = new ArrayList<Domino>(); //un joueur va avoir sa propre liste de domino associee
private Plateau plateau;

	/** Constructeur 
	 * param1 String nom
	 * param2 String couleur
	 * param3 int score
	 * param4 int numeroJoueur
	 * param5 ArrayList<Domino> domJoueur
	 * param6 Plateau plateau
	 * **/

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


	/** GETTERS **/

	public void setNom (String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	public String getCouleur() {
		return couleur;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getNumeroJoueur () {
		return numeroJoueur;
	}
	
	public ArrayList <Domino> getDomJoueur (){
		return domJoueur;
	}
	
	public Domino getDomJoueurElement(int i){
		return domJoueur.get(i);
	}
	
	public Domino getPlusPetitDomino() {
		Domino plusPetit = null;
			if (this.domJoueur.size() == 0) {
			System.out.println("Aucun domino pour ce joueur");
			System.out.println(this.toString());
			}
				for (Domino domino: this.domJoueur) {
					if (plusPetit == null || plusPetit.getNumeroDomino() > domino.getNumeroDomino()) {
				plusPetit = domino;
					}
				}
		return plusPetit;
		}
	
	public Plateau getPlateau() {
		return plateau; 
	}
	
	/** SETTERS **/
	
	public void setCouleur (String couleur) {
		this.couleur = couleur;	
	}

	public void setScore (int score) {
		this.score = score;
	}

	public void setNumeroJoueur (int numeroJoueur) {
		this.numeroJoueur = numeroJoueur;
	}

	public void setDomJoueur ( ArrayList<Domino> domJoueur) { //liste entière
		this.domJoueur = domJoueur;
	}
	public void setDomJoueurElement(Domino domino) { //un élément de la liste
		this.domJoueur.add(domino);// on ajoute un domino (le domino pioché par le joueur) à sa propre liste de dominos
	}

	
	public void setPlateau(Plateau plateau){
		this.plateau = plateau;
	}

	public int scoreFinal () {
		
		
		int couronneCount = 0;
		
	for (Domino domino : this.domJoueur) {
		couronneCount += domino.getCouronnes();
		
	}
	return couronneCount;
	}

}