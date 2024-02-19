package nevezetesTetelGenerikusan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NevezetesTetelGenerikusanFoprogram {

	public static void main(String[] args) {

		List<Integer> egeszSzamok = new ArrayList<Integer>(Arrays.asList(17, 423, 64, 34));
		int index = GenerikusTetelek.elsoParosBarmelyAdatszerkezettel(egeszSzamok);
		if (index > -1) {
			System.out.println("Az elso paros szam indexe: " + index);
		} else {
			System.out.println("Nincs paros szam a listaban.");
		}

		List<Long> nagySzamok = new ArrayList<Long>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(260000000L);
				add(100L);
				add(186454316L);
			}
		};
		index = GenerikusTetelek.elsoParosBarmelyAdatszerkezettel(nagySzamok);
		if (index > -1) {
			System.out.println("Az elso paros szam indexe: " + index);
		} else {
			System.out.println("Nincs paros szam a listaban.");
		}

		List<Double> tortSzamok = new ArrayList<Double>();
		tortSzamok.add(23.77);
		tortSzamok.add(256.42);

		index = GenerikusTetelek.elsoParosBarmelyAdatszerkezettel(tortSzamok);
		if (index > -1) {
			System.out.println("Az elso paros szam indexe: " + index);
		} else {
			System.out.println("Nincs paros szam a listaban.");
		}

		Set<Integer> halmaz = new TreeSet<Integer>();
		halmaz.add(15);
		halmaz.add(465);
		halmaz.add(34);

		index = GenerikusTetelek.elsoParosBarmelyAdatszerkezettel(halmaz);
		if (index > -1) {
			System.out.println("Az elso paros szam indexe: " + index);
		} else {
			System.out.println("Nincs paros szam a listaban.");
		}

		Integer[] tomb = new Integer[] { 45, 78, 156, 75, 124, 46 };
		index = GenerikusTetelek.elsoParosBarmelyAdatszerkezettel(Arrays.asList(tomb));
		if (index > -1) {
			System.out.println("Az elso paros szam indexe: " + index);
		} else {
			System.out.println("Nincs paros szam a listaban.");
		}

	}

}
