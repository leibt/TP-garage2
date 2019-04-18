package modeles;

import java.util.List;

import moteurs.Moteur;
import options.Option;

public class D4 extends Vehicule{
	
	public D4(double prix, String nom, List<Option> lopt, Marque nomMarque, Moteur mot) {
		super(prix, nom, lopt, nomMarque, mot);
		// TODO Auto-generated constructor stub
		System.out.println("Véhicule "+this.getClass().getName()+" crée!");
	}

	public D4() {
		//super();
		super(25147.0,"D4",Marque.CITROEN);
		//System.out.println("Véhicule "+this.getClass().getName()+" crée!");
	}
	

}
