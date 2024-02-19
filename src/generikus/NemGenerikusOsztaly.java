package generikus;

public class NemGenerikusOsztaly {

	public <T extends Number> int generikusMeodus(T generikusParameter) {

		return generikusParameter.intValue() * 10;

	}

}
