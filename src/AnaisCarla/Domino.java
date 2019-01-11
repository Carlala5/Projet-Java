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
    
    
public Domino(int nbCo1, int nbCo2, String t1, String t2, int num) {
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
//
//String type1, type2, crowns1 , crowns2, id, position;
//	
//	public Domino(String id, String crowns1, String type1, String crowns2, String type2, String position) {
//		this.crowns1 = crowns1;
//		this.crowns2 = crowns2;
//		this.type1 = type1;
//		this.type2 = type2;
//		this.id = id;
//		this.position = position;
//
//	}
//	public String getCrowns1() {
//		return crowns1;
//	}
//	public String getCrowns2() {
//		return crowns2;
//	}
//	public String getType1() {
//		return type1;
//	}
//	public String getType2() {
//		return type2;
//	}
//	public String getId() {
//		return id;
//	}	
//	
//	public void setPosition(String position) {
//		this.position = position;
//	}
//	
//	public String getPosition(String position) {
//		return position;
//	}
//


}
