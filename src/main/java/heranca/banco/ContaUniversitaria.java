package heranca.banco;

public class ContaUniversitaria extends Conta{

	public ContaUniversitaria(int nr, int ag) {
		super(nr, ag);
	}
	
	@Override
	public boolean saque(double vl) {
		if(getSaldo() >= vl) {
			return super.saque(vl);
		}
		return false;
	}
	
	@Override
	public boolean deposito(double vl) {
		if(getSaldo() + vl <= 2000) {
			return super.deposito(vl);
		}
		return false;
	}
	
}
