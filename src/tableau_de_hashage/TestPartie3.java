package tableau_de_hashage;

import ensemble.Gaulois;
import musee.Musee;
import musee.Trophee;

public class TestPartie3 {
	public static void main(String[] args) {
		Musee musee = new Musee();
		Gaulois asterix = new Gaulois("Asterix");
		Gaulois obelix = new Gaulois("Obélix");
		Gaulois abraracourcix = new Gaulois("Abraracourcix");

		musee.ajouterTropheeInventaire(asterix, Trophee.BOUCLIER);
		musee.ajouterTropheeInventaire(asterix, Trophee.CASQUE);
		musee.ajouterTropheeInventaire(asterix, Trophee.CASQUE);
		musee.ajouterTropheeInventaire(obelix, Trophee.GLAIVE);
		musee.ajouterTropheeInventaire(abraracourcix, Trophee.CASQUE);

		System.out.println(musee.donnerInventaire());

		
//		RESULTAT :
//			INVENTAIRE DU MUSEE
//
//			Abraracourcix a donn� :
//			- 1 x CASQUE
//
//			Asterix a donn� :
//			- 1 x BOUCLIER
//			- 2 x CASQUE
//
//			Ob�lix a donn� :
//			- 1 x GLAIVE
		
	}
}
