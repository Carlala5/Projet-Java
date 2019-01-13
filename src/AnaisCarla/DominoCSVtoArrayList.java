package AnaisCarla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DominoCSVtoArrayList {

	/*
	 * La fonction print_list_domino parcourt la liste qui a ete remplie grace au
	 * fichier CSV et affiche les dominos correctement en console (pure
	 * verification)
	 */

	public static void print_list_domino(ArrayList<Domino> listDom) {
		int i = 0;
		if (listDom == null) { // le if verifie si la liste de dominos n est pas egale e null
			System.out.println("Liste null.");
			return;
		} else { // si elle n est pas egale a null, on peut la parcourir puis l affichee
			for (i = 0; i < listDom.size(); i++) {
				Domino d = listDom.get(i);
				System.out.println("Domino de Numéro : " + d.getNumeroDomino()
						+ " --> Nombre de Couronne sur le terrain 1 : " + d.getNbCouronne1() + " ; Type de terrain 1 : "
						+ d.getType1() + " ### Nombre de Couronne sur le terrain 2 : " + d.getNbCouronne2()
						+ " ; Type de terrain 2 : " + d.getType2());
			}
		}
	}

	/*
	 * La fonction parse_csv_file s occupe de parcourir le fichier CSV tout en le
	 * lisant lignes par lignes et de remplir la liste de dominos avec ce qui est lu
	 * dans le CSV
	 */

	public static ArrayList<Domino> parse_csv_file() {

		BufferedReader dominoBuffer = null;
		/*
		 * BufferedReader prend qqchose en memoire. Si il n y avait pas = null,
		 * dominoBuffer pourrait prendre n importe quelle valeur de la memoire. Donc
		 * toutes les variables qui jouent avec de la memoire, on les met à null
		 */
		
		ArrayList<Domino> listDom = new ArrayList<Domino>(); 												
		/*
		 * Creation d une nouvelle liste de dominos : listDom qui contient des <Domino>
		 */
		
		try {
			String dominoLine; // Chaque ligne lue est stockee dans la variable dominoLine
			dominoBuffer = new BufferedReader(new FileReader("src/dominos.csv")); // BufferedReader sert e lire le
																					// fichier CSV
			int count = 0;

			/*
			 * Tant qu il y a de la matiere a lire (tant que chaque ligne lue n est pas
			 * egale a null) on lit le fichier CSV et on cree des dominos grace a la
			 * fonction createDomino
			 */

			while ((dominoLine = dominoBuffer.readLine()) != null) {

				if (count == 0) { // le if sert a ne pas lire la premiere ligne du fichier CSV qui correspond au
									// nom des colonnes (nbCouronne1...)
					count++;
					continue;
				}

				Domino d = createDomino(dominoLine); // on cree un domino grace a la fonction createDomino
				listDom.add(d); // chaque domino cree est ajoute a notre liste generale de dominos : listDom
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dominoBuffer != null)
					dominoBuffer.close();
			} catch (IOException dominoException) {
				dominoException.printStackTrace();

			}
		}
		return listDom;
	}

	/*
	 * La fonction createDomino permet de creet un domino dont les attributs sont
	 * definis dans le constructeur de la classe Domino
	 */

	private static Domino createDomino(String dominoLine) { // creer un domino

		/*
		 * splitData est une liste de string qui permet de separer les lignes du fichier
		 * CSV qui ont ete lues par le BuffedReader (et qui sont maintenant stockees
		 * dans dominoLine) correctement
		 */
		String[] splitData = dominoLine.split("\\s*,\\s*"); // \\s* : ce qui est lu avant une virgule et \\s* : ce qui
															// est lu apres la virgule
		int NbCouronne1 = Integer.parseInt(splitData[0]); // Integer.parseInt sert a convertir une variable integer en
															// une variable String
		String Type1 = splitData[1];
		int NbCouronne2 = Integer.parseInt(splitData[2]);
		String Type2 = splitData[3];
		int NumeroDomino = Integer.parseInt(splitData[4]);
		Domino d = new Domino(NbCouronne1, Type1, NbCouronne2, Type2, NumeroDomino);

		return d;
	}

}
