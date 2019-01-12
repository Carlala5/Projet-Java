package AnaisCarla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class DominoCSVtoArrayList {
	
	
	
	static class Test{
		private ArrayList<Domino> dom = new ArrayList<Domino>();
	    private int NbCouronne1;
	    private String Type1;
	    
	    private int NbCouronne2;
	    private String Type2;
	    
	    private int NumeroDomino;
	  
	    Domino d;
	    
	    
		}

	
	
	// Fonction qui parcourt la liste qui a été remplie grace au CSV et affiche les dominos correctement
	
	
	 public static void print_list_domino_2 (Test[] liste) {
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
	 
	 public static void print_list_domino (ArrayList<Domino> listDom) {
		 	int i = 0;
		 	if (listDom == null) {
		 		System.out.println ("Liste null.");
		 		return;
		 	}
		 	else {
		 
		 		for (i = 0 ; i < listDom.size() ; i++){
		 			Domino d = listDom.get(i);
		 			System.out.println(
		 				"Domino de Numéro : " + d.getNumeroDomino() 
		 				+ " --> Nombre de Couronne sur le terrain 1 : " + d.getNbCouronne1()
		 				+ " ; Type de terrain 1 : " + d.getType1()
		 				+ " ### Nombre de Couronne sur le terrain 2 : " + d.getNbCouronne2()
		 				+ " ; Type de terrain 2 : " + d.getType2());
		 		}
		 
		 	}
	 }
	
	// Fonction qui s'occupe de parcourir le fichier CSV et de remplir la liste avec ce qui est lu dans le CSV
	 
	public static ArrayList<Domino> parse_csv_file () { // lire le fichier csv ligne par ligne, chaque ligne va etre stockee dans dominoLine
		BufferedReader dominoBuffer = null;
		ArrayList<Domino> listDom = new ArrayList<Domino>();
		try {
			String dominoLine;
			dominoBuffer = new BufferedReader(new FileReader("/Users/carladeruelle/Desktop/Projet-Java/src/dominos.csv")); //lit le fichier CSV
			int count = 0;
			int i = 0;
			
			while ((dominoLine = dominoBuffer.readLine())!=null) {//tant que chaque ligne lue n'est pas egale à null, on lit le fichier
				
				if (count == 0) {
					count++;
					continue;
				}

				Domino d = createDomino(dominoLine);
				listDom.add(d);
				
				// System.out.println ("RawCSV : "+ dominoLine); // et on renvoie cela.
				
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
		return listDom;
	} 

		private static Domino createDomino(String dominoLine) { // creer un domino
			
			String[] splitData = dominoLine.split("\\s*,\\s*"); //splitData est une liste de string
		      int NbCouronne1 = Integer.parseInt(splitData[0]);
		      String Type1 = splitData[1];
		      int NbCouronne2 = Integer.parseInt(splitData[2]);
		      String Type2 = splitData[3];
		      int NumeroDomino = Integer.parseInt(splitData[4]);
		      Domino d = new Domino (NbCouronne1,Type1, NbCouronne2,Type2,NumeroDomino);
		 	
		 	  return d;
	}


		/*
		 BufferedReader prend qqchose en mémoire. Si il n'y avait pas null, dominoBuffer pourrait prendre 
		 n'importe quelle valeur de la mémoire. Donc toutes les variables qui jouent avec de la mémoire, on les met à null
		 */

	public static void melangerDominos(Test [] liste) {
		Collections.shuffle(Arrays.asList(liste));
	}
	
}
