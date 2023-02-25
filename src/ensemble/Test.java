package ensemble;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		Poisson poissonJumeau = new Poisson(new Date(28,9,2019), 2.35f);
		Poisson poissonVieux = new Poisson(new Date(28,9,2019), 2.35f);
		Poisson poissonFrais = new Poisson(new Date(2,10,2019), 2.35f);
		Poisson poissonLourd = new Poisson(new Date(3,10,2019), 3.51f);
		Poisson poissonLeger = new Poisson(new Date(3,10,2019), 1.23f);
		
		NavigableSet<Poisson> etal = new TreeSet<>();
//		etal.add(poissonJumeau);
//		etal.add(poissonVieux);
//		etal.add(poissonFrais);
//		etal.add(poissonLourd);
//		etal.add(poissonLeger);
		Collections.addAll(etal, poissonJumeau, poissonVieux, poissonFrais, poissonLourd, poissonLeger);
		
//		for (Poisson poisson : etal) {
//			System.out.println(poisson);
//		}
		
		System.out.println("Les poissons sur l'étal : ");
		for (Iterator<Poisson> iterator = etal.iterator(); iterator.hasNext();) {
			Poisson poisson = iterator.next();
			System.out.println(poisson);
		}
	}
	
}
