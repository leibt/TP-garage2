package moteurs;

public class MoteurDiesel extends Moteur{

	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		super.setType(TypeMoteur.DIESEL);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Moteur "+super.getType() +" "+ cylindre;// + " (" + prix+"€)";
	}

}
