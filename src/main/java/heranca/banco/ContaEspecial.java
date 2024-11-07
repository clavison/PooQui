package heranca.banco;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	@Override
	public boolean saque(double vl) {
		if(getSaldo() + limite >= vl) {
			return super.saque(vl);
		}
		return false;
	}
	
	public ContaEspecial(int nr, int ag, double limite) {
		super(nr, ag);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
