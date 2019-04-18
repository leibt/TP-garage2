package modeles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import moteurs.Moteur;
import options.Option;

public abstract class Vehicule implements Serializable{
	protected double prix;
	protected String nom;
	protected List<Option> lopt;
	protected Marque nomMarque;
	protected Moteur mot;
	
	public Vehicule() {
		this.lopt=new ArrayList<>();
	}
	
	public Vehicule(double prix, String nom, Marque nomMarque) {
		super();
		this.lopt=new ArrayList<>();
		this.prix = prix;
		this.nom = nom;
		this.nomMarque = nomMarque;
	}
	
	public Vehicule(double prix, String nom, List<Option> lopt, Marque nomMarque, Moteur mot) {
		super();
		this.lopt=new ArrayList<>();
		this.prix = prix;
		this.nom = nom;
		this.lopt = lopt;
		this.nomMarque = nomMarque;
		this.mot = mot;
	}

	public void addOption(Option opt) {
		lopt.add(opt);
	}
		
	public double getPrix() {
		return prix;
	}

	public List<Option> getLopt() {
		return lopt;
	}


	public Marque getNomMarque() {
		return nomMarque;
	}


	public void setMoteur(Moteur mot) {
		this.mot = mot;
	}
	
	public double total() {
		double prixTot = this.prix;
		
		for(int i=0;i<(this.lopt).size();i++) {
			
			prixTot += ((this.lopt).get(i)).getPrix();	
		}
		return ((double)Math.round(prixTot * 100) / 100);
	}
	
	@Override
	public String toString() {
		return "Vehicule "+ this.nomMarque+ " : "+ this.nom+" "+ mot.toString()+" ("+ this.prix+"€) "+this.lopt.toString()+ " d'une valeur totale de "+this.total()+"€"; //+" prix=" + prix + ", nom=" + nom + ", nomMarque=" + nomMarque + "\n\t"+mot.toString();
	}
	
	
}
