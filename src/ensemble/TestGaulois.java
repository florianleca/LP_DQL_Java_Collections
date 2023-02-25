package ensemble;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestGaulois {
	
	public static void afficherGaulois(NavigableSet<Gaulois> ensemble) {
		for (Iterator<Gaulois> iter = ensemble.iterator(); iter.hasNext();) {
			Gaulois gaulois = iter.next();
			System.out.println(gaulois);
		}
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 35);
		Gaulois obelix = new Gaulois("Obélix", 30);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 40);
		Gaulois bonemine = new Gaulois("Bonemine", 36);
		Gaulois panoramix = new Gaulois("Panoramix", 90);
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 41);
		Gaulois cetautomatix = new Gaulois("Cétautomatix", 41);

		NavigableSet<Gaulois> ensemble = new TreeSet<>();
		Collections.addAll(ensemble, asterix, obelix, abraracourcix, bonemine, panoramix, ordralfabetix, cetautomatix);
		System.out.println("Ordre alphabétique :");
		afficherGaulois(ensemble);
		
		NavigableSet<Gaulois> ensembleGaulois = new TreeSet<>(new Comparator<Gaulois>() {

			@Override
			public int compare(Gaulois o1, Gaulois o2) {
				if(o1.getAge()!=o2.getAge()) {
					return o1.getAge()-o2.getAge();
				}
				return o1.compareTo(o2);
			}
		});
		System.out.println();
		Collections.addAll(ensembleGaulois, asterix, obelix, abraracourcix, bonemine, panoramix, ordralfabetix, cetautomatix);
		System.out.println("Ordre selon l'age :");
		afficherGaulois(ensembleGaulois);
	}
}
