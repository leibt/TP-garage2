package moteurs;

public class MoteurHybride extends Moteur{

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		super.setType(TypeMoteur.HYBRIDE);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Moteur "+super.getType() +" "+ cylindre; //+ " (" + prix+"€)";
	}

}
