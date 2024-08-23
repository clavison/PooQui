package exercicio_times;

import java.util.ArrayList;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public int contaGols() {
		int gols = 0;
		for (Jogador j : jogadores) {
			gols += j.getGols();
		}
		return gols;
	}
	
	public Jogador artTime() {
		if(getJogadores().size() == 0)
			return null;
		Jogador artilheiro = getJogadores().get(0);
		for (Jogador j : jogadores) {
			if( j.getGols() > artilheiro.getGols()) {
				artilheiro = j;
			}
		}
		return artilheiro;
	}
	
	
	public void addJogador(Jogador j) {
		getJogadores().add(j);
	}
	
	public void cadastrar(String nome) {
		setNome(nome);
	}
	
	
	public String listaJogadores() {
		String ret = "";
		for (Jogador j : jogadores) {
			ret += j.dados();
		}
		return ret;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	
	

}
