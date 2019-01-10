package AnaisCarla;

public class Test {

	
	
	private String[] notes;
	private String job;


	//variables d'instance
	private int age;
	private String prenom;
	
	/**Constructeur 
	 * param1 int age
	 * param2 string prenom**/
	
	public Test(int age, String prenom) {
		this.age = age;
		this.prenom = prenom;
	}

	//Constructeur par defaut
	public Test() {
		
	}
	
	public void noomDeMethode(int nb) {
		age = age + nb;
		
		
	}//public void noomDeMethode(int nb)
	
	public void faireEcrire() {
		
	}
	
	/**GETTERS AND SETTERS**/
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String[] getNotes() {
		return notes;
	}


	public void setNotes(String[] notes) {
		this.notes = notes;
	}
	
	
	
}
