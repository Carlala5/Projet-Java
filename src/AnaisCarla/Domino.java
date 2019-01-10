package AnaisCarla;

public class Domino {
String type1, type2, crowns1 , crowns2, id, position;
	
	public Domino(String id, String crowns1, String type1, String crowns2, String type2, String position) {
		this.crowns1 = crowns1;
		this.crowns2 = crowns2;
		this.type1 = type1;
		this.type2 = type2;
		this.id = id;
		this.position = position;

	}
	public String getCrowns1() {
		return crowns1;
	}
	public String getCrowns2() {
		return crowns2;
	}
	public String getType1() {
		return type1;
	}
	public String getType2() {
		return type2;
	}
	public String getId() {
		return id;
	}	
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition(String position) {
		return position;
	}


}
