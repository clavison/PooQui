package construtores.sistema_academico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaAcademicoTest {
	
	private SistemaAcademico sistema = new SistemaAcademico();
	
	@BeforeEach
	void inicializa() {
		sistema.getProfessores().clear();
		sistema.getAlunos().clear();
		sistema.getDisciplinas().clear();
		
		sistema.cadastraProfessor("Prof1", 1);
		sistema.cadastraProfessor("Prof2", 2);
		sistema.cadastraProfessor("Prof3", 3);
		
		sistema.cadastraDisciplina("D1", 30, sistema.getProfessores().get(0));
		sistema.cadastraDisciplina("D2", 30, sistema.getProfessores().get(1));
		sistema.cadastraDisciplina("D3", 30, sistema.getProfessores().get(2));
		
		sistema.cadastraAluno("A1");
		sistema.cadastraAluno("A2");
	}

	@Test
	void cadastraProfessorTest() {
		sistema.cadastraProfessor("Prof4", 3);
		assertEquals(4, sistema.getProfessores().size());
		assertEquals("Prof4", sistema.getProfessores().get(3).getNome());
	}
	
	@Test
	void cadastraDisciplinaTest() {
		sistema.cadastraDisciplina("D4", 30, sistema.getProfessores().get(0));
		assertEquals(4, sistema.getDisciplinas().size());
		assertEquals("Prof1", sistema.getDisciplinas().get(3).getProfessor().getNome());
	}
	
	@Test
	void cadastraAlunoTest() {
		sistema.cadastraAluno("A3");
		assertEquals(3, sistema.getAlunos().size());
		assertEquals("A3", sistema.getAlunos().get(2).getNome());
	}
	
	@Test
	void fazMatriculaTest() {
		sistema.matricular(sistema.getAlunos().get(0), sistema.getDisciplinas().get(0));
		sistema.matricular(sistema.getAlunos().get(0), sistema.getDisciplinas().get(2));
		sistema.informarNotas(sistema.getMatriculas().get(0), 5, 6, 7);
		String ret = sistema.disciplinasPorAluno("A1");
		assertEquals("D1 - 6.0\nD3 - 0.0\n", ret);
		ret = sistema.disciplinasPorAluno("A100");
		assertEquals("", ret);
	}
	
	@Test
	void discilinasProfPosTest() {
		String ret = sistema.disciplinasPorProfessor();
		assertEquals("D3\n", ret);
	}

}
