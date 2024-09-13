package construtores.sistema_academico;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
	
	private String nome;
	private int formacao;
	
	public Professor() {
	}

	public Professor(String nome, int formacao) {
		this.nome = nome;
		this.formacao = formacao;
	}

}
