package encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return "*"+nome+"*";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade <0 || idade > 100)
			this.idade = 0;
		else
			this.idade = idade;
	}



	String mostraPessoa() {
		return getNome() + " - " + getIdade();
	}

}
