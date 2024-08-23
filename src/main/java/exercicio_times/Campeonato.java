package exercicio_times;

import java.util.ArrayList;

public class Campeonato {
	
	private ArrayList<Time> times = new ArrayList<Time>();
	
	public Time timeMaisGols () {
		Time campeao = new Time();
		for (Time t : times) {
			if(t.contaGols() > campeao.contaGols()) {
				campeao = t;
			}
		}
		return campeao.getNome() != null ? campeao : null;
	}
	
	
	public Jogador artilheiroCampeonato() {
		Jogador artCamp = new Jogador();
		for (Time t : times) {
			if(t.artTime().getGols() > artCamp.getGols()) {
				artCamp = t.artTime();
			}
		}
		return artCamp.getNome() != null ? artCamp : null;
	}
	
	public String listaJogadores(String nmTime) {
		Time t = buscaTime(nmTime);
		return t != null ? t.listaJogadores() : null;
	}
	
	public void addJogadorTime(String nmTime, String nmJog, int camisa, int gols) {
		Time t = buscaTime(nmTime);
		if( t != null) {
			Jogador j = new Jogador();
			j.cadastrar(nmJog, camisa, gols);
			t.addJogador(j);
		}
	}
	
	public void cadastraTime(String nome) {
		Time t = new Time();
		t.cadastrar(nome);
		times.add(t);
	}
	
	private Time buscaTime(String nome) {
		for (Time t : times) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				return t;
			}
		}
		return null;
	}
	
	

	public ArrayList<Time> getTimes() {
		return times;
	}
	
	

}
