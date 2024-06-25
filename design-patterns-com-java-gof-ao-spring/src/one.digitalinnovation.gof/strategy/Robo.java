package one.digitalinnovation.gof.strategy;

public class Robo {
	private Comportamento strategy;

	public Robo() {
		this.strategy = new ComportamentoNormal();
	}

	public void setStrategy(Comportamento strategy) {
		this.strategy = strategy;
	}

	public void mover() {
		this.strategy.mover();
	}
}
