package one.digitalinnovation.gof.strategy;

public class Test {
	public static void main(String[] args) {
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
	
		Robo robo = new Robo();	

		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(normal);
		robo.mover();
	} 
}
