package AnaisCarla;

import java.util.ArrayList;
import java.util.Arrays;

import AnaisCarla.DominoCSVtoArrayList.Test;

public class Game {
	public static Test[]liste;
	public static Test[]pioche_domino;
	
	public static void main(String[] args) {
		
		// liste = new Test [48];
		ArrayList<Domino> listDom = DominoCSVtoArrayList.parse_csv_file();
		
		
//		DominoCSVtoArrayList.melangerDominos(liste);
		
		// DominoCSVtoArrayList.print_list_domino(liste);
		DominoCSVtoArrayList.print_list_domino(listDom);
		
		System.out.println("Les dominos qui ont été piochés sont :");
		// pb : avec melangerDominos, mes dominos dans la pioche se mélengent aussi
		ArrayList<Domino> pioche_domino = DominoPioche.domino_pioche(listDom);
		
        /* Je print la liste des dominos piochés pour etre sur */
        DominoCSVtoArrayList.print_list_domino(pioche_domino);
	}
}