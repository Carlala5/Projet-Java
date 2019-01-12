package AnaisCarla;



public class Domino {
	
	// Variables d'instance
	
	private int NbCouronne1;
    private String Type1;
    
    private int NbCouronne2;
    private String Type2;
    
    private int NumeroDomino;   
    
    
    
    /** Constructeur 
	 * param1 int nbCo1
	 * param2 int nbCo2
	 * param3 String t1
	 * param4 String t2
	 * param5 int num
	 * **/
   
 
public Domino(int nbCo1, String t1, int nbCo2 , String t2,int num) {
	this.NbCouronne1 = nbCo1;
	this.NbCouronne2 = nbCo2;
	this.Type1 = t1;
	this.Type2 = t2;
	this.NumeroDomino = num;
	
}	

	/** GETTERS **/

public int getNbCouronne1() {
	return this.NbCouronne1;
}

public int getNbCouronne2() {
	return this.NbCouronne2;
}

public String getType1() {
		return this.Type1;
	}

public String getType2() {
	return this.Type2;
}


public int getNumeroDomino() {
	return this.NumeroDomino;
}

public void setCoordonneesGeneral() {
	
	
}
public void setCoordonnees1() {
	
}
public void setCoordonnees2() {
	
}

}
