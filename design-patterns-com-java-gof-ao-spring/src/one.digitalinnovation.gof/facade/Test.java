package one.digitalinnovation.gof.facade;

public class Test {
	public static void main(String[] args) {
		Facade api = new Facade();

		api.migrarCliente("a", "123");
	}
}
