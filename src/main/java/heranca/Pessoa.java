package heranca;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	@Override
	public String toString() {
		return getNome() + " - " + getIdade();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public boolean equals(Object o) {
		Pessoa p = (Pessoa) o;
		if(getNome().equals(p.getNome()) && getIdade() == p.getIdade())
			return true;
		return false;
	}
	
	
	protected Pessoa clone() {
		Pessoa nova = new Pessoa();
		nova.setNome(getNome());
		nova.setIdade(getIdade());
		return nova;
	}
	
	public int compareTo(Pessoa outro) {
		return getIdade() - outro.getIdade();
	}
	
	

}
