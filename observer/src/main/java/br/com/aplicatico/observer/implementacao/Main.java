package br.com.aplicatico.observer.implementacao;

public class Main {

	public static void main(String[] args) throws Exception {
		GraficoBarras gb = new GraficoBarras();
		AcoesLogger al = new AcoesLogger();
		CarteiraAcoes c = new CarteiraAcoes();
		c.addObservador(gb);
		c.addObservador(al);
		Thread.sleep(2000);
		c.adicionarAcoes("COMP02", 200);
		Thread.sleep(2000);
		c.adicionarAcoes("EMP34", 400);
		Thread.sleep(2000);
		c.adicionarAcoes("ACDF89", 300);
		Thread.sleep(2000);
		c.adicionarAcoes("EMP34", -200);
		Thread.sleep(2000);
		c.adicionarAcoes("COMP02", 150);
		}


}
