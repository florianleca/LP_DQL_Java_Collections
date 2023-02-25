package village;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hutte hutteChef = new Hutte();
		hutteChef.ajouterOccupant("Bonnemine", Genre.FEMININ);
		hutteChef.ajouterOccupant("Abraracourcix", Genre.MASCULIN);
		System.out.println(hutteChef.listeOccupants());

//		List<Character> caracteres = new ArrayList<>();
//		Collections.addAll(caracteres, 'r', 'a', 'u', 't');
//		Iterator<Character> iter = caracteres.iterator();
//		System.out.println(caracteres);
//		iter.next();
//		iter.next();
//		iter.remove();
//		iter.next();
//		iter.remove();
//		System.out.println(caracteres);

	}

}
