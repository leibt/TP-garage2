package moteurs;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
		super.setType(TypeMoteur.ESSENCE);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Moteur "+super.getType() +" "+ cylindre ;//+ " (" + prix+"€)";
	}

}
