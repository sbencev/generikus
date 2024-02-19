package generikusKollekciokDemo;

import java.util.ArrayList;
import java.util.List;

public class GenerikusKollekciokFoprogram {

	public static void main(String[] args) {

		/*
		 * List lista = new ArrayList();
		 * 
		 * lista.add(10); lista.add(24); lista.add(66);
		 */

		Integer osszeg = 0;

		/*
		 * for (Object elem : lista) { osszeg += elem; }
		 */

		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(15);
		lista2.add(54);

		for (Integer elem : lista2) {
			osszeg += elem;
		}

		System.out.println(osszeg);

		List<Motor> motorok = new ArrayList<Motor>();
		motorok.add(new Motor("Yamaha"));
		motorok.add(new Motor("Kawasaki"));
		motorok.add(new Motor("Suzuki"));
		muvelet(motorok);

		List<Jarmu> jarmuvek = new ArrayList<Jarmu>();
		jarmuvek.add(new Jarmu("altalanos jarmu"));
		muvelet(jarmuvek);

		List<Auto> autok = new ArrayList<Auto>();
		autok.add(new Auto("BMW"));
		autok.add(new Auto("Audi"));
		autok.add(new Auto("Toyota"));
		muvelet(autok);

		List<ElektromosAuto> eAutok = new ArrayList<ElektromosAuto>();
		eAutok.add(new ElektromosAuto("Tesla"));
		muvelet(eAutok);

	}

	public static void muvelet(List<? extends Jarmu> lista) {

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getMegnevezes());
		}

		System.out.println();

	}

}
