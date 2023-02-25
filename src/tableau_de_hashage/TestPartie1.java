package tableau_de_hashage;

import ensemble.Gaulois;
import musee.Musee;
import musee.Trophee;

public class TestPartie1 {
	public static void main(String[] args) {
		Musee musee = new Musee();
		Gaulois asterix = new Gaulois("Asterix");
		Gaulois obelix = new Gaulois("Obélix");
		Gaulois abraracourcix = new Gaulois("Abraracourcix");

		musee.ajouterTrophee(asterix, Trophee.BOUCLIER);
		musee.ajouterTrophee(asterix, Trophee.CASQUE);
		musee.ajouterTrophee(asterix, Trophee.CASQUE);
		musee.ajouterTrophee(obelix, Trophee.GLAIVE);
		musee.ajouterTrophee(abraracourcix, Trophee.CASQUE);

		System.out.println(musee.tousLesTrophees());
		System.out.println("******************************");
		System.out.println(musee.lesTrophees(asterix));
		
//		RESULTAT :
//			Tous les troph�es du mus�e sont :
//				Les troph�es de Abraracourcix sont :
//				- CASQUE
//
//				Les troph�es de Ob�lix sont :
//				- GLAIVE
//
//				Les troph�es de Asterix sont :
//				- BOUCLIER
//				- CASQUE
//				- CASQUE
//
//
//				******************************
//				Les troph�es de Asterix sont :
//				- BOUCLIER
//				- CASQUE
//				- CASQUE
	}
}
