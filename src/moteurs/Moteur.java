package moteurs;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
	
	TypeMoteur type;
	String cylindre;
	double prix;
	
	
	public Moteur(String cylindre,double prix) {
		this.cylindre=cylindre;
		this.prix=prix;
	}


	@Override
	public String toString() {
		return "Cylindre : " + cylindre + ", prix : " + prix;
	}


	public double getPrix() {
		return prix;
	}


	public TypeMoteur getType() {
		return type;
	}


	public void setType(TypeMoteur type) {
		this.type = type;
	}
	
}
