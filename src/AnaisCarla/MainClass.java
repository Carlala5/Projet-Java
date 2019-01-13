package AnaisCarla;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue dans le jeu Domi'Nations !\n\nVoici les règles du jeu : "); 
		System.out.println("\nDomi'Nations est un jeu de plateau qui se joue à plusieurs (de 2 à 4 joueurs), où chaque joueur devra créer le plus beau royaume autour de son chateau.");
		System.out.println("Pour une partie à 2, chaque joueur aura deux rois, et dans les autres cas il n'a qu'un seul roi par joueur. ");
		System.out.println("Le royaume se construit en piochant puis plaçant les dominos les uns à côté des autres. \nPour placer un domino, il faut qu’au moins un de ses terrains soit adjacent à un terrain de même type.\nLa connexion ne peut se faire qu'horizontalement ou verticalement.");
		System.out.println("Lorsque tous les dominos ont été piochés, le joueur ayant le plus haut score a gagné.");
		System.out.println("\nLe royaume est actuellement en construction, nous allons donc jouer sur la console.\nVeuillez nous excuser pour la gêne occasionnée.\n");
		
		Jeu jeu = new Jeu();

	}

}
