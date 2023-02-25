package village;

public class Personne {
	private String nom;
	private Genre genre;

	public Personne(String nom, Genre genre) {
		this.nom = nom;
		this.genre = genre;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", genre=" + genre + "]";
	}

	public String getNom() {
		return nom;
	}

	public String donnerTitre() {
		if (genre.equals(Genre.FEMININ)) {
			return "Mme";
		} else {
			return "Mr";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && getClass() == obj.getClass()) {
			Personne personne = (Personne) obj;
			return nom.equals(personne.nom);
		}
		return false;
	}
}
