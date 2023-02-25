package tableau_de_hashage;

public class Personnage {
	private String nom;

	public Personnage(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return nom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && getClass() == obj.getClass()) {
			Personnage other = (Personnage) obj;
			return nom.equals(other.nom);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 31*nom.hashCode();
	}
}
