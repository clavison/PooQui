package exercicio_times;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampeonatoTest {
	
	Campeonato champ = new Campeonato();
	
	@BeforeEach
	void inicializar() {
		champ.getTimes().clear();
		
		champ.cadastraTime("A");
		champ.addJogadorTime("A", "J1", 1, 2);
		champ.addJogadorTime("A", "J2", 2, 3);
		champ.addJogadorTime("A", "J3", 3, 2);
		
		champ.cadastraTime("B");
		champ.addJogadorTime("B", "J4", 4, 1);
		champ.addJogadorTime("B", "J5", 5, 0);
		champ.addJogadorTime("B", "J6", 6, 4);
		champ.addJogadorTime("B", "J7", 7, 0);
		
	}

	@Test
	void timeMaisGolsTest() {
		Time t = champ.timeMaisGols();
		assertEquals("A", t.getNome());
	}
	
	@Test
	void artilheiroCampeonatoTest() {
		Jogador j = champ.artilheiroCampeonato();
		assertEquals( "J6" , j.getNome());
	}
	
	@Test
	void listaJogadoresTest() {
		String ret = champ.listaJogadores("A");
		String esperado = "J1 (1): 2\n"
				+ "J2 (2): 3\n"
				+ "J3 (3): 2\n";
		assertEquals( esperado , ret);
	}
	
	@Test
	void addJogadorTimeTest() {
		champ.addJogadorTime("A", "J22", 10, 10);
		assertEquals( 4 , champ.getTimes().get(0).getJogadores().size());
	}
	
	@Test
	void addJogadorTimeInexistenteTest() {
		champ.addJogadorTime("C", "J22", 10, 10);
		assertEquals( 3 , champ.getTimes().get(0).getJogadores().size());
		assertEquals( 4 , champ.getTimes().get(1).getJogadores().size());
	}
	
	@Test
	void acadastraTimeTest() {
		champ.cadastraTime("C");
		assertEquals( 3, champ.getTimes().size());
		assertEquals( "C", champ.getTimes().get(2).getNome());
		assertEquals( 0, champ.getTimes().get(2).getJogadores().size());
	}
	
	@Test
	void listaJogadoresTimeNaocadastradoTest() {
		String ret = champ.listaJogadores("C");
		assertNull(ret);
	}
	
	@Test
	void timeMaisGolsSemTimeTest() {
		champ.getTimes().clear();
		Time t = champ.timeMaisGols();
		assertNull(t);
	}
	
	@Test
	void artilheiroCampeonatoSemTimeTest() {
		champ.getTimes().clear();
		Jogador j = champ.artilheiroCampeonato();
		assertNull(j);
	}
	
	@Test
	void artilheiroTimeSemJogador() {
		champ.cadastraTime("C");
		Time novo = champ.getTimes().get(2);
		Jogador artTime = novo.artTime();
		assertNull(artTime);
	}

}
