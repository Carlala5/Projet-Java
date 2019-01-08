package AnaisCarla;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DominoCSVtoArrayList {
	
	
	
	static class Test{
	    private int NbCouronne1;
	    private String Type1;
	    
	    private int NbCouronne2;
	    private String Type2;
	    
	    private int NumeroDomino;
	    
	    public Test (String dominoLine) {
	    	String[] splitData = dominoLine.split("\\s*,\\s*"); //splitData est une liste de string
	      
	      this.NbCouronne1 = Integer.parseInt(splitData[0]);
	      this.Type1 = splitData[1];
	      this.NbCouronne2 = Integer.parseInt(splitData[2]);
	      this.Type2 = splitData[3];
	      this.NumeroDomino = Integer.parseInt(splitData[4]);
	      
	     
	    }
	    
		}
	
	
	// Fonction qui parcourt la liste qui a été remplie grace au CSV et affiche les dominos correctement
	
	
	 public static void print_list_domino (Test[] liste) {
		 
		 	int i = 0;
		 	if (liste == null) {
		 		System.out.println ("Liste null.");
		 		return;
		 	}
		 	else {
		 	
		 		for (i = 0 ; i < liste.length ; i++){
		 			System.out.println( "Domino de Numéro : " + liste[i].NumeroDomino + " --> Nombre de Couronne sur le terrain 1 : " + liste[i].NbCouronne1 + " ; Type de terrain 1 : " + liste[i].Type1 + " ### Nombre de Couronne sur le terrain 2 : " + liste[i]. NbCouronne2 + " ; Type de terrain 2 : " + liste[i].Type2);
		 		}
		 	}
	 }
	 
	
	// Fonction qui s'occupe de parcourir le fichier CSV et de remplir la liste avec ce qui est lu dans le CSV
	 
	public static void parse_csv_file (Test [] liste) {
		BufferedReader dominoBuffer = null;
		try {
			String dominoLine;
			dominoBuffer = new BufferedReader(new FileReader("src/dominos.csv")); //li le fichier CSV
			int count = 0;
			int i = 0;
			while ((dominoLine = dominoBuffer.readLine())!=null) { //tant que chaque ligne lue n'est pas egale à null, on lit le fichier
				if (count == 0) {
					count++;
					continue;
				}
						
				System.out.println ("RawCSV : "+ dominoLine); // et on renvoie cela.
				liste [i] = new Test(dominoLine);
				i++;
				
							
				}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dominoBuffer != null) dominoBuffer.close();					
			} catch (IOException dominoException) {
				dominoException.printStackTrace();
			
			}			
		}			
	}
	

	 
		/*
		 BufferedReader prend qqchose en mémoire. Si il n'y avait pas null, dominoBuffer pourrait prendre 
		 n'importe quelle valeur de la mémoire. Donc toutes les variables qui jouent avec de la mémoire, on les met à null
		 */

}
