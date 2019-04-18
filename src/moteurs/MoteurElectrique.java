package moteurs;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		super.setType(TypeMoteur.ELECTRIQUE);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Moteur "+super.getType() +" "+ cylindre ;//+ " (" + prix+"€)";
	}

}
