package heranca.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaixaTest {
	
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	@BeforeEach
	void inicializar() {
		contas.add(new ContaCorrente(001, 900));
		contas.add(new ContaCorrente(002, 901));
		contas.add(new ContaUniversitaria(003, 900));
		contas.add(new ContaEspecial(004, 900, 1000));
		contas.get(0).deposito(100);
		contas.get(2).deposito(100);
		contas.get(3).deposito(100);
	}

	@Test
	void depositoValido() {
		contas.get(0).deposito(100);
		contas.get(1).deposito(100);
		contas.get(2).deposito(100);
		contas.get(3).deposito(100);
		assertEquals(200, contas.get(0).getSaldo());
		assertEquals(100, contas.get(1).getSaldo());
		assertEquals(200, contas.get(2).getSaldo());
		assertEquals(200, contas.get(3).getSaldo());
	}
	
	@Test
	void depositoInvalido() {
		contas.get(2).deposito(2000);
		assertEquals(100, contas.get(2).getSaldo());
	}
	
	@Test
	void saqueValido() {
		contas.get(0).saque(50);
		contas.get(2).saque(50);
		contas.get(3).saque(50);
		assertEquals(50, contas.get(0).getSaldo());
		assertEquals(50, contas.get(2).getSaldo());
		assertEquals(50, contas.get(3).getSaldo());
		contas.get(3).saque(500);
		assertEquals(-450, contas.get(3).getSaldo());
	}
	
	@Test
	void saqueInvalido() {
		contas.get(0).saque(150);
		contas.get(1).saque(1);
		contas.get(2).saque(150);
		contas.get(3).saque(1150);
		assertEquals(100, contas.get(0).getSaldo());
		assertEquals(0, contas.get(1).getSaldo());
		assertEquals(100, contas.get(2).getSaldo());
		assertEquals(100, contas.get(3).getSaldo());
	}
	
	@Test
	void transfValida() {
		contas.get(0).transferencia(90, contas.get(3));
		assertEquals(10, contas.get(0).getSaldo());
		assertEquals(190, contas.get(3).getSaldo());
	}
	
	@Test
	void transfInvalidaAgencia() {
		contas.get(0).transferencia(90, contas.get(1));
		assertEquals(100, contas.get(0).getSaldo());
		assertEquals(0, contas.get(1).getSaldo());
	}
	
	@Test
	void transfInvalidaSaldoOrigem() {
		contas.get(0).transferencia(200, contas.get(3));
		assertEquals(100, contas.get(0).getSaldo());
		assertEquals(100, contas.get(3).getSaldo());
	}
	
	@Test
	void transfInvalidaDepositoDestino() {
		contas.get(2).deposito(1900);
		contas.get(0).transferencia(50, contas.get(2));
		assertEquals(100, contas.get(0).getSaldo());
		assertEquals(2000, contas.get(2).getSaldo());
	}
	
	
	
	

}
