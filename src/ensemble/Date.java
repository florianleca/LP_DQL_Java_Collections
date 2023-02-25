package ensemble;

public class Date implements Comparable<Date>{
	int jour;
	int mois;
	int annee;

	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	@Override
	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}
	
	public static void main(String[] args) {
		System.out.println("Réponse true");
		boolean comparaison = (new Date(1,10,2019)).equals(new Date(1,10,2019));
		System.out.println("1/10/2019 = 1/10/2019 ? " + comparaison);
		int nbComparaison = (new Date(1,10,2019)).compareTo(new Date(15, 10, 2019));
		comparaison = nbComparaison < 1;
		System.out.println("1/10/2019 < 15/10/2019 ? " + comparaison);
		nbComparaison = (new Date(1,10,2019)).compareTo(new Date(1, 12, 2019));
		comparaison = nbComparaison < 1;
		System.out.println("1/10/2019 < 1/12/2019 ? " + comparaison);
		nbComparaison = (new Date(1,10,2019)).compareTo(new Date(1, 10, 2020));
		comparaison = nbComparaison < 1;
		System.out.println("1/10/2019 < 1/10/2020 ? " + comparaison);
		System.out.println("Réponse false");
		nbComparaison = (new Date(15,10,2019)).compareTo(new Date(1, 10, 2019));
		comparaison = nbComparaison < 1;
		System.out.println("15/10/2019 < 1/10/2019 ? " + comparaison);
		nbComparaison = (new Date(1,12,2019)).compareTo(new Date(1, 10, 2019));
		comparaison = nbComparaison < 1;
		System.out.println("1/12/2019 < 1/10/2019 ? " + comparaison);
		nbComparaison = (new Date(1,10,2020)).compareTo(new Date(1, 10, 2019));
		comparaison = nbComparaison < 1;
		System.out.println("1/10/2020 < 1/10/2019 ? " + comparaison);
	}

	@Override
	public int compareTo(Date o) {
		if (annee!=o.annee) {
			return annee-o.annee;
		} 
		if (mois!=o.mois) {
			return mois-o.mois;
		}
		return jour-o.jour;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return annee == other.annee && jour == other.jour && mois == other.mois;
	}
	
	@Override
	public int hashCode() {
		return 31*(annee+jour+mois);
	}
	
}
