package musee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import ensemble.Gaulois;

public class Musee {
	
	private Map<Gaulois, List<Trophee>> trophees = new HashMap<>();
	private NavigableMap<Gaulois, Map<Trophee, Integer>> inventaire = new TreeMap<>();

	public void ajouterTrophee(Gaulois proprietaire, Trophee trophee) {		
		if (!trophees.containsKey(proprietaire)) {
			trophees.put(proprietaire, new ArrayList<>());
		}
		trophees.get(proprietaire).add(trophee);
	}

	public String lesTrophees(Gaulois proprietaire) {
		String tousLesTrophees = "Les trophées de " + proprietaire.getNom() + " sont :\n";
		List<Trophee> liste = trophees.get(proprietaire);
		for (Trophee trophee : liste) {
			tousLesTrophees += "- " + trophee + "\n";
		}
		return tousLesTrophees;
	}

	public String tousLesTrophees() {
		
		Set<Gaulois> gaulois = trophees.keySet();
				
		String tousLesTrophees = "Tous les trophées du musée sont :\n";
		
		for (Gaulois g : gaulois) {
			tousLesTrophees += lesTrophees(g);
		}
		return tousLesTrophees;
	}
	
	public void ajouterTropheeInventaire(Gaulois g, Trophee t) {
		Map<Trophee, Integer> m = new TreeMap<>();
		if (!inventaire.containsKey(g)) {
			m.put(t, 1);
			inventaire.put(g, m);
		} else {						// inventaire contient le gaulois
			m= inventaire.get(g);		// on récupère la map associée au gaulois
			int i = m.get(t) +1;		// on calcule la nouvelle valeur de l'int
			m.put(t, i);
			
		}
	}
	
	public String donnerInventaire() {
		String affichage = "INVENTAIRE DU MUSEE \n \n";
		for (Gaulois g : inventaire.keySet()) {
			affichage += inventaire.get(g) + "\n";
		}
		return affichage;
	}
	
}
