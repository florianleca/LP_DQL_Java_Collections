package musee;

import ensemble.Gaulois;

public class DescriptionTrophee {
	private Gaulois proprietaire;
	private Trophee trophee;

	public DescriptionTrophee(Gaulois proprietaire, Trophee trophee) {
		this.proprietaire = proprietaire;
		this.trophee = trophee;
	}

	public Gaulois getProprietaire() {
		return proprietaire;
	}

	public Trophee getTrophee() {
		return trophee;
	}
}
