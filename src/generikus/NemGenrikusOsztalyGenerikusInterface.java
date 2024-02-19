package generikus;

public class NemGenrikusOsztalyGenerikusInterface implements INemGenerikus {

	@Override
	public <T extends Number> int implementaltGenerikusMetodus(T generikusParameter) {

		return generikusParameter.intValue() * 10;

	}

}
