package construtores.sistema_academico;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {
	
	private String nome;
	private int ch;
	private Professor professor = new Professor();

}
