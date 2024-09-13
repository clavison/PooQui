package construtores.sistema_academico;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDisciplina {
	
	private Aluno aluno = new Aluno();
	private Disciplina disciplina = new Disciplina();
	double n1;
	double n2;
	double n3;
	

	public AlunoDisciplina(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	
	public double getMedia() {
		return (n1 + n2 + n3) / 3;
	}

}
