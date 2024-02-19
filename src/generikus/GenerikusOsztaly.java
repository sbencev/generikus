package generikus;

public class GenerikusOsztaly<T extends Number> {

	T genrikusvaltozo;

	public GenerikusOsztaly(T generikusValtozo) {
		this.genrikusvaltozo = generikusValtozo;
	}

	public int metodus() {

		return genrikusvaltozo.intValue() * 10;

	}

}
