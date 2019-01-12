package AnaisCarla;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import AnaisCarla.DominoCSVtoArrayList.Test;


public class DominoPioche {

	public static ArrayList<Domino> domino_pioche(ArrayList<Domino> listDom) {

		//On crée une liste temporaire dans laquelle on stocke notre Game.liste.
		//On va jouer avec cette liste pour ne par avoir de pb

		// Test[]temp_liste;

		// temp_liste = Game.liste;


		int i = 0;

		if (listDom == null) { //condition qui verifie si la liste n'est pas egale a null
			System.out.println ("Liste null.");
			return new ArrayList<Domino>();
		}
		else {
			Random randomGenerator = new Random();

			/* On crée une liste de dominos qui s'appelle pioche_domino */
			
			ArrayList<Domino> pioche_domino = new ArrayList<Domino>(); 
			
			/* on crée la liste pioche_domino qui aura quatre cases */
            // pioche_domino = new Test [4]; //On ne connait que la taille du tableau sans connaitre les valeurs

			//Test[] pioche_domino; /* on crée la liste pioche_domino qui aura quatre cases */
            //pioche_domino = new Test [4]; //On ne connait que la taille du tableau sans connaitre les valeurs
        
            int[] random_numbs = new int[4]; /*  on initialise 4 nombres aléatoires à 0 dans un tableau */
            random_numbs[0] = 0;
            random_numbs[1] = 0;
            random_numbs[2] = 0;
            random_numbs[3] = 0;

            int same_random_number = 0;

			while (true) { 
				
				/* retourne true tant que le numéro aléatoire tiré est égal 
				 * un numéro qui est déjà dans notre tableau de nombres
				 * aléatoires (cad que same_random_number est égal à 1).
				 * */

			    /* on crée un nombre aléatoire entre 1 et 48 */

				int random_number = 1 + randomGenerator.nextInt(47);

                /* on vérifie qu'il soit pas dans notre tableau de 4 int aleatoire (4 dominos en gros) en parcourant le tableau */
                for (int j = 0 ; j < 4 ; j++) {
                	
                    /* si par hasard le numéro aleatoire a déjà été tiré 
                     * on va sortir et refaire un nombre aléatoire avec le "continue" */
                	
                    if (random_number == random_numbs[j]) {
                        same_random_number = 1;
                        break;
                    }
                }

                /* condition pour tester si le nombre aléatoire tiré a déjà été tiré ou pas et si oui et bien on refait un nombre aléatoire jusqu'a en avoir un différent */
                if (same_random_number == 1) {
                    same_random_number = 0;
                    continue;
                }

                /* Si le nombre aléatoire tiré est différent d'un tiré avant alors on le met dans le tableau d'int aléatoire  */

                random_numbs[i] = random_number; //on remplace random_numbs[i] par random_number

                /* On passe au prochain tirage du nombre aléatoire en incrémentant tout */
                i++;
                

                /* Une fois les 4 pioches fait on sort */

                if (i >= 4)
					break;
			}
			
			
			
            /* On va ajouter a notre liste de 4 dominos nos 4 tirages
             * temp_liste[random_numbs[0]] ---> on prend le domino numéro (random_numbs[O]) qui est le premier tirage.
             */
			Arrays.sort(random_numbs); // trie nos random_numbs par ordre croissant
			
			
			
//            pioche_domino[0] = temp_liste[random_numbs[0]];
//            pioche_domino[1] = temp_liste[random_numbs[1]];
//            pioche_domino[2] = temp_liste[random_numbs[2]];
//            pioche_domino[3] = temp_liste[random_numbs[3]];
			
			pioche_domino.add(listDom.get(random_numbs[0]));
			pioche_domino.add(listDom.get(random_numbs[1]));
			pioche_domino.add(listDom.get(random_numbs[2]));
			pioche_domino.add(listDom.get(random_numbs[3]));
            
            return pioche_domino;
            
		}

	}
}


