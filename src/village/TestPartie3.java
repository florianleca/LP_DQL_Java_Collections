package village;

public class TestPartie3 {
	public static void main(String[] args) {
		Hutte hutteChef = new Hutte();
		
		hutteChef.ajouterOccupant("Bonnemine", Genre.FEMININ);
		hutteChef.ajouterOccupant("Abraracourcix", Genre.MASCULIN);

		System.out.println(hutteChef.listeOccupants());

		System.out.println("La hutte est vide ? " + hutteChef.hutteVide());
		System.out.println(hutteChef.listeOccupants());
		System.out.print("Est-ce que Bonnemine est dans cette hutte ? ");
		System.out.println(hutteChef.estHabitePar(new Personne("Bonnemine", Genre.FEMININ)));
		System.out.println("Bonnemine et Abraracourcix partent.");
		hutteChef.partir();
		System.out.println("La hutte est vide ? " + hutteChef.hutteVide());
		System.out.println(hutteChef.listeOccupants());
		
	}
}
