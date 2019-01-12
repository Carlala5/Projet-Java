package AnaisCarla;

import java.util.ArrayList;

import java.util.Arrays;

//import AnaisCarla.DominoCSVtoArrayList.Test;

public class Game {
	public static Test[]liste;
	public static Test[]pioche_domino;
	
	public static void main(String[] args) {
		
		// liste = new Test [48];
		ArrayList<Domino> listDom = DominoCSVtoArrayList.parse_csv_file();
		
		
//		DominoCSVtoArrayList.melangerDominos(liste);
		
		// DominoCSVtoArrayList.print_list_domino(liste);
		DominoCSVtoArrayList.print_list_domino(listDom);
		
		
	}
}