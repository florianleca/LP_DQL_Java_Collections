package ensemble;

import java.util.Comparator;
import java.util.Objects;

public class Poisson implements Comparable<Poisson>{
	private Date datePeche;
	private float poids;

	public Poisson(Date datePeche, float poids) {
		this.datePeche = datePeche;
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Poisson [datePeche=" + datePeche + ", poids=" + poids + "]";
	}
	
	public static void main(String[] args) {
		Poisson poissonJumeau = new Poisson(new Date(28,9,2019), 2.35f);
		Poisson poissonVieux = new Poisson(new Date(28,9,2019), 2.35f);
		Poisson poissonFrais = new Poisson(new Date(2,10,2019), 2.35f);
		Poisson poissonLourd = new Poisson(new Date(3,10,2019), 3.51f);
		Poisson poissonLeger = new Poisson(new Date(3,10,2019), 1.23f);
		System.out.println("Réponse true");
		System.out.println("PoissonJumeau.equals(PoissonVieux) ? " + poissonJumeau.equals(poissonVieux));
		boolean comparaison = poissonVieux.compareTo(poissonFrais) < 1;
		System.out.println("PoissonVieux < PoissonFrais ? " + comparaison);
		comparaison = poissonLeger.compareTo(poissonLourd) < 1;
		System.out.println("PoissonLeger < PoissonLourd ? " + comparaison);
		System.out.println("Réponse false");
		comparaison = poissonFrais.compareTo(poissonVieux) < 1;
		System.out.println("PoissonFrais < PoissonVieux ? " + comparaison);
		comparaison = poissonLourd.compareTo(poissonLeger) < 1;
		System.out.println("PoissonLourd < PoissonLeger ? " + comparaison);
	}

	@Override
	public int compareTo(Poisson o) {
		if (datePeche.compareTo(o.datePeche)!=0) {
			return datePeche.compareTo(o.datePeche);
		}
		return Float.compare(poids, o.poids);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poisson other = (Poisson) obj;
		return Objects.equals(datePeche, other.datePeche)
				&& Float.floatToIntBits(poids) == Float.floatToIntBits(other.poids);
	}
	

}
