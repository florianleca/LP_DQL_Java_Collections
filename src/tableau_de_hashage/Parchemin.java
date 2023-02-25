package tableau_de_hashage;

import ensemble.Date;

public class Parchemin {
	private String titre;
	private Personnage auteur;
	private Date date;

	public Parchemin(String titre, Personnage auteur, Date date) {
	  this.titre = titre;
	  this.auteur = auteur;
	  this.date = date;
	 }
	  
	public String toString() { 
		return titre + ", " + auteur + ", " + date;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		Parchemin other = (Parchemin)o;
		return(titre==other.titre && auteur==other.auteur && date==other.date);
	}
	
	public int hashCode() {
		return 31*(titre.hashCode()+auteur.hashCode()+date.hashCode());
	}
}
