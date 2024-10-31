package heranca;

public class TesteHeranca {
	
	public static void main(String[] args) {
//		Aluno a = new Aluno();
//		a.setNome("aluno");
//		a.setIdade(1);
//		System.out.println(a);
		
		
//		Medico m = new Medico();
//		m.setNome("Médico");
//		m.setIdade(2);
//		m.setCrm(1111);
//		System.out.println(m);
		
//		Pediatra p = new Pediatra();
//		p.setNome("João");
//		p.setIdade(3);
//		
//		Aluno a = new Aluno();
//		a.setNome("João");
//		a.setIdade(3);
//		
//		System.out.println(p.equals(a));
		
		Pessoa p1 = new Pessoa();
		p1.setNome("João");
		p1.setIdade(3);
		
		Pessoa p2 = p1.clone();
		p2.setIdade(7);
		
		System.out.println(p2.compareTo(p1));
		
		
		
	}

}
