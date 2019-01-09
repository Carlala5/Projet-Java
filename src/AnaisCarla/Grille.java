package AnaisCarla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Grille extends JFrame {
	
	//Instanciation d'un objet JPanel
    private JPanel pan = new JPanel();
    private JButton bouton = new JButton("Mon bouton");
    
    
  public Grille() {       
      
    //Titre de la fenêtre
    this.setTitle("Grille DomiNation"); 
    
    //Definir sa taille
    this.setSize(500, 500);
    
    //Mettre la fenetre au centre de notre ecran
    this.setLocationRelativeTo(null);
    
    //Termine le processus quand on clique sur la croix rouge
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Garder la fenetre au premier plan (quand eclipse n'est pas en full ecran) 
    this.setAlwaysOnTop(true);
    
    
    
//    //Définition de sa couleur de fond
//    pan.setBackground(Color.BLUE);   

    //Cinq lignes par cinq colonnes
    for (int i = 1; i < 26; i++) {
    this.setLayout(new GridLayout(5,5));
    this.add(new JButton(String.valueOf(i)));
    
    } 
    
//    //Ajout du bouton a notre content pane
//    pan.add(bouton);
    
//    //On prévient notre JFrame que notre JPanel sera son content pane
//    this.setContentPane(pan);  
    
    //sert à rendre la fenetre visible
    this.setVisible(true);
  }    
  public static void main(String[] args) {
	  Grille gr = new Grille();
  }
}
