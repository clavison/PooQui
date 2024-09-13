package construtores;

import java.util.Random;

public class Aleatorio {
	
	int numero;
	
	public Aleatorio(int maximo) {
		numero = new Random().nextInt(maximo);
	}
	
	public Aleatorio(double d) {
		d = d * 100;
		numero = new Random().nextInt((int)d);
	}
	
	public Aleatorio() {
		this(20);
	}
		

}
