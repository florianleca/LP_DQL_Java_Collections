package tableau_de_hashage;

import java.util.HashSet;
import java.util.Set;

import ensemble.Date;
import ensemble.Gaulois;

public class TestMusee {
	public static void main(String[] args) {
		Romain cesar = new Romain("Cesar");
		Gaulois druide = new Gaulois("Panoramix");
		Gaulois assurancetourix = new Gaulois("Assurancetourix");
		
		Parchemin effetsPotion = new Parchemin("Les effets secondaires de la potion magique", druide,
				new Date(21, 12, -70));
		Parchemin musiqueBestOf = new Parchemin("Mes plus grands succes", assurancetourix, new Date(30, 04, -45));
		Parchemin guerresDesGaules = new Parchemin("Commentaires sur la guerre des gaules", cesar,
				new Date(12, 07, -50));
		
		Set<Parchemin> ensembleParchemin = new HashSet<>();
		ensembleParchemin.add(guerresDesGaules);
		ensembleParchemin.add(effetsPotion);
		ensembleParchemin.add(musiqueBestOf);

		
		Set<Parchemin> ensembleAPreter = new HashSet<>(ensembleParchemin);
		
		Set<Parchemin> ensemblePretes = new HashSet<>();
		
		System.out.println("A-t-on prete des parchemlins ? " + !ensemblePretes.isEmpty());
		
		ensembleAPreter.remove(guerresDesGaules);
		ensembleAPreter.remove(musiqueBestOf);
		
		ensemblePretes.addAll(ensembleParchemin);
		
		ensemblePretes.removeAll(ensembleAPreter);

	}
}
