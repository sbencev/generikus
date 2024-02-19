package nevezetesTetelGenerikusan;

import java.util.List;

public class GenerikusTetelek {

	/*
	 * public static int elsoParos(List<Integer> szamok) {
	 * 
	 * int i = 0; while (i < szamok.size() && szamok.get(i) % 2 != 0) { i++; }
	 * 
	 * return (i < szamok.size() ? i : -1); }
	 */

	public static int elsoParos(List<? extends Number> szamok) {

		int i = 0;
		while (i < szamok.size() && szamok.get(i).doubleValue() % 2 != 0) {

			i++;

		}

		return (i < szamok.size() ? i : -1);
	}

	public static <T extends Number> int elsoParosBarmelyAdatszerkezettel(Iterable<T> adatok) {

		int i = 0;
		for (T adat : adatok) {
			if (adat.doubleValue() % 2 == 0) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
