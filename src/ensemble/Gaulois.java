package ensemble;

import tableau_de_hashage.Personnage;

public class Gaulois extends Personnage implements Comparable<Gaulois> {
	private String nom;
	private int age;

	public Gaulois(String nom, int age) {
		super(nom);
		this.age = age;
	}

	public Gaulois(String nom) {
		super(nom);
	}
	
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Gaulois) {
			Gaulois gaulois = (Gaulois) obj;
			return nom.equals(gaulois.nom);
		}
		return false;
	}

	public int compareTo(Gaulois gauloisToCompare) {
		return this.nom.compareTo(gauloisToCompare.nom);
	}

	public String toString() {
		return nom + " a " + age + " ans";
	}
	
	public int getAge() {
		return age;
	}
}
