package generikus;

public class GenerikusFoOsztaly {

	public static void main(String[] args) {

		/*
		 * ha T tipust nem specializaltuk, addig Objectkent viselkedik, de annak keves a
		 * funkcionalitasa ha szukitjuk a tipusok koret (extends), akkor ma az ot
		 * felhasznalo objektum csak a szukites altal meghatarozott tipust veheti fel
		 * GenerikusOsztaly<String> genObj = new GenerikusOsztaly<String>("valami");
		 * System.out.println(genObj.metodus());
		 */

		GenerikusOsztaly<Integer> genObj = new GenerikusOsztaly<Integer>(100);
		System.out.println(genObj.metodus());

		GenerikusOsztaly<Byte> genObj2 = new GenerikusOsztaly<Byte>((byte) 75);
		System.out.println(genObj2.metodus());

		GenerikusOsztaly<Double> genObj3 = new GenerikusOsztaly<Double>(10.25);
		System.out.println(genObj3.metodus());

		GenerikusOsztaly<Long> genObj4 = new GenerikusOsztaly<Long>(306L);
		System.out.println(genObj4.metodus());
		System.out.println();

		NemGenerikusOsztaly nemGenObj = new NemGenerikusOsztaly();
		System.out.println(nemGenObj.generikusMeodus(100));
		System.out.println(nemGenObj.generikusMeodus((byte) 75));

		GenerikuInterfaceOsztaly<Integer> genObj5 = new GenerikuInterfaceOsztaly<Integer>(123);
		System.out.println(genObj5.metodus());

		NemGenrikusOsztalyGenerikusInterface genObj6 = new NemGenrikusOsztalyGenerikusInterface();
		System.out.println(genObj6.implementaltGenerikusMetodus((short) 1400));

	}

}
