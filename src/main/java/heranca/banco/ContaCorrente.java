package heranca.banco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int nr, int ag) {
		super(nr, ag);
	}
	
	@Override
	public boolean saque(double vl) {
		if(getSaldo() >= vl) {
			return super.saque(vl);
		}
		return false;
	}
	

}
