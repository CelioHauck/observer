package br.com.aplicatico.observer.implementacao;

public class AcoesLogger implements Observador {

	public void mudancaQuantidade(String acao, Integer quantidade) {
		System.out.println("Alterada a quantidade da ação " + acao + " para" + quantidade);
	}
}
