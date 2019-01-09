package AnaisCarla;

import AnaisCarla.DominoCSVtoArrayList.Test;

public class Game {
	public static Test[]liste;
	public static Test[]pioche_domino;
	
	public static void main(String[] args) {
		
	
	
		liste = new Test [48];
		DominoCSVtoArrayList.parse_csv_file(liste);
		
		
		DominoCSVtoArrayList.print_list_domino(liste);
		
		System.out.println("Les dominos qui ont été piochés sont :");
		DominoPioche.domino_pioche();
		
		
	

}
}