package br.com.aplicatico.observer.implementacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteiraAcoes {

	private Map<String,Integer> acoes = new HashMap<>();
	private List<Observador> observador = new ArrayList<>();
	
	public void adicionarAcoes(String acao,Integer quantidade){
		if(acoes.containsKey(acao)) {
			quantidade +=acoes.get(acao);
		}
		acoes.put(acao, quantidade);
		notificar(acao, quantidade);
	}
	
	private void notificar(String acao, Integer quantidade) {
		for(Observador o: observador) {
			o.mudancaQuantidade(acao, quantidade);
		}
	}
	
	public void addObservador(Observador o) {
		observador.add(o);
	}
}
