package AnaisCarla;

public class MainClass {
	
	public static void main(String[] args) {
		Joueur joueur = new Joueur();
	}
		
		
//		Jeu monJeu = new Jeu();
//		monJeu.chargeLibrairieDominos()
//		nb = monJeu.demandeNbJoueur
//		
//		for (int i=0; i<nb; i++) {
//			monJeu.ajoutJoueur(i);
//			
//		}
//		monJeu.definiOrdrePassage();
//		
//		while(monJeu.enCours) {
//			monJeu.joueurSuivantJoue();
//			monjeu.Affiche();
//		}
//	}
//	monJeu.termine();
////	
	
	
	
	
	
	
	
	/* -- appel classe Domino:   Importer fichier csv et traiter les données 
 * classer les dominos dans un tableau : assigner un domino à une position 
 * 
 * -- appel classe Joueurs   Demander le nombre de joueurs :
 * 	- si 4 joueurs : 48 dominos
 * 	- si 3 joueurs : 36 dominos (48 et on en enlève 12 aléatoirement)
 * 	- si 2 joueurs : 24 dominos ( on en retire 24 aléatoirement)
 * 
 * -- appel classe Joueurs : Associer un joueur à un roi (nombre -couleur/pour plus tard-) 
 * 
 * -- appel classe Domino : 
 * Tirer au hasard un nombre entre 1 et 48 (enlever le domino du tableau), répeter 3 fois l'opération
 * 
 *-- appel classe plateauGénéral:  Trier par ordre croissant les 4 dominos
 * 
 * 
 * -- appel classe Joueur : pour 4joueurs : choix aléatoire d'un des 4 joueurs pour tirer 1 des 4 rois
 * 
 * 
 * --appel classe plateauGénéral : le premier joueur tiré, choisi un des quatre dominos 
 * 			ainsi de suite;
 * 
 * --appel classe domino : On renouvelle l'opération avec 4 autres dominos
 * 
 *  -- appel plateauGénéral : joueur sur la plus petite valeur du domino, commence à placer son roi sur un autre domino
 *  						puis celui sur la 2ieme plus petite valeur,
 *  						ainsi de suite
 *  
 *  -- appel plateauJoueur : on forme un plateau de taille 5x5
 *  on enregistre et on demande au joeur de placer le domino dans le plateau du joueur autour du chateau 
 *  
 *  idem pour chaque joueur
 *  
 *  -- appel plateauJoueur : pour placer correctement les prochains dominos : 
 *  si le type1 ou le type2 de domino 1 = type1 ou type2 de domino 2 on les place à côté
 *  
 *  
 *  
 * --appel classe nombrePoints : -- appel classe plateauJoueur : 
 * 				a chaque domino où il y a une ou deux couronnes 
 * 				si un domino a 1 couronne, voir autres dominos du même type, qui se touchent, addition nbr de domino
 * 				si un domino a 2 couronnes, on compte le nbr de dominos qui se touchent du même type, et on multiplie ce nbr par le nbr de couronnes
 * 	Total : addition de tout 
 * 
 * 
 * 
*/
	}
