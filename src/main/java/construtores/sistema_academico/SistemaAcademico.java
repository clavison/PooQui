package construtores.sistema_academico;

import java.util.ArrayList;

public class SistemaAcademico {
	
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<AlunoDisciplina> matriculas = new ArrayList<AlunoDisciplina>();
	
	public void cadastraDisciplina(String n, int ch, Professor p) {
		disciplinas.add(new Disciplina(n, ch, p));
	}
	
	public void cadastraProfessor(String n, int f) {
		professores.add(new Professor(n, f));
	}
	
	public void cadastraAluno(String n) {
		alunos.add(new Aluno(n));
	}
	
	public void matricular(Aluno a, Disciplina d) {
		matriculas.add(new AlunoDisciplina(a, d));
	}
	
	public void informarNotas(AlunoDisciplina matricula, double n1, double n2, double n3) {
		matricula.setN1(n1);
		matricula.setN2(n2);
		matricula.setN3(n3);
	}
	
	public String disciplinasPorAluno(String nome) {
		String ret = "";
		for (AlunoDisciplina m : matriculas) {
			if(nome.equalsIgnoreCase(m.getAluno().getNome())) {
				ret += m.getDisciplina().getNome() + " - " + m.getMedia()+"\n";
			}
		}
		return ret;
	}
	
	public String disciplinasPorProfessor() {
		String ret = "";
		for (Disciplina d : disciplinas) {
			if(d.getProfessor().getFormacao() == 3) {
				ret += d.getNome()+"\n";
			}
		}
		return ret;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public ArrayList<AlunoDisciplina> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(ArrayList<AlunoDisciplina> matriculas) {
		this.matriculas = matriculas;
	}
	
	

}
