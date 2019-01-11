package AnaisCarla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import AnaisCarla.DominoCSVtoArrayList.Test;

public class ListeDomino {
	
public static ArrayList<Domino> enleverDominos(int nbJoueurs) {
	
	
		ArrayList<Domino> listDom = DominoCSVtoArrayList.parse_csv_file();
	

		int i ;

		if (listDom == null) { //condition qui verifie si la liste n'est pas egale a null
			System.out.println ("Liste null.");
			return new ArrayList<Domino>();
		}
		
	else {	
		
		System.out.println("nbJoueur ?");
		Scanner scan = new Scanner(System.in);
		nbJoueurs = scan.nextInt();
		
		if (nbJoueurs == 2) {
			for (i = 0; i < 25; i++) {
				
				listDom.remove(i);	
				
			}
			System.out.println(listDom);
		}
		
		
		
//		
//			else {
//				if (nbJoueurs == 3){
//					for (i = 0; i < 13; i++) {
//						listDom.remove(i);
//					}					
//				}
//			}				
	}
		return listDom;
}
	public static void main(String[] args) {
		
		
		enleverDominos(nbJoueurs);
		
		

	}

}

