package village;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hutte {
	private List<Personne> occupants = new ArrayList<>();
	
	public void ajouterOccupant(String nom, Genre genre) {
		occupants.add(new Personne(nom, genre));
	}
	
	public String listeOccupants() {
		if (hutteVide()) {
			return "La hutte est vide !";
		} else {
			String affichage = "La hutte est occupée par ";
			for (Iterator<Personne> iterator = occupants.iterator(); iterator.hasNext();) {
				Personne personne = iterator.next();
				affichage += personne.donnerTitre() + " " + personne.getNom();
				if (iterator.hasNext()) {
					affichage += ", ";
				} else {
					affichage += ".";
				}
			}
			return affichage;
		}
		
	}
	
	public boolean hutteVide() {
		return occupants.isEmpty();
	}
	
	public void partir() {
		occupants.clear();
	}
	
	public boolean estHabitePar(Personne personne) {
		return occupants.contains(personne);
	}
}
