package modeles;

import java.util.List;

import moteurs.Moteur;
import options.Option;

public class A300B extends Vehicule{

	
	public A300B(double prix, String nom, List<Option> lopt, Marque nomMarque, Moteur mot) {
		super(prix, nom, lopt, nomMarque, mot);
		// TODO Auto-generated constructor stub
		System.out.println("Véhicule "+this.getClass().getName()+" crée!");
	}

	public A300B() {
		//super();
		
		super(28457.0,"A300B",Marque.PEUGEOT);
		//System.out.println("Véhicule "+this.getClass().getName()+" crée!");
	}
}
