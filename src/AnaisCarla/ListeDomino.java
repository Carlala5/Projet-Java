package AnaisCarla;

import java.util.Arrays;
import java.util.Random;

import AnaisCarla.DominoCSVtoArrayList.Test;

public class ListeDomino {
	
public static void enleverDominos(int nbJoueurs) {
	
	Test[]temp_liste;
	temp_liste = Game.liste;
	int i ;

	if (Game.liste == null) {
		System.out.println ("Liste null.");
		return;
	}
	else {		
		if (nbJoueurs == 2) {
			for (i = 0; i< 25; i++) {
				Arrays.asList(temp_liste).remove(i);				
			}
		}
			else {
				if (nbJoueurs == 3){
					for (i = 0; i < 13; i++) {
						Arrays.asList(temp_liste).remove(i);
					}					
				}
			}				
	}
}
	public static void main(String[] args) {
		

	}

}

