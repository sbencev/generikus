package generikus;

public class GenerikuInterfaceOsztaly<T extends Number> implements IGenerikus<Number> {

	T generikusValtozo;

	public GenerikuInterfaceOsztaly(T generikusValtozo) {
		this.generikusValtozo = generikusValtozo;
	}

	@Override
	public int metodus() {

		return generikusValtozo.intValue() * 10;

	}

}
