package encapsulamento;

public class ManipulaPessoa {
	
	public static void main(String[] args) {
		Pessoa p= new Pessoa();
		p.setNome("Joãozinho fghfghdfgh");
		p.setIdade(10);
		System.out.println(p.mostraPessoa());
		System.out.println(p.getNome());
	}

}
