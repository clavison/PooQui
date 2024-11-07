package heranca.banco;

public class Conta {
	
	private int nr;
	private int ag;
	private double saldo;
	
	public boolean transferencia(double vl, Conta destino) {
		if (ag == destino.getAg()) {
			if(saque(vl)) {
				if(destino.deposito(vl)) {
					return true;
				}else {
					deposito(vl);
					return false;
				}
			}else {
				return false;
			}
			
		}
		return false;
		
	}
	public boolean deposito(double vl) {
		saldo += vl;
		return true;
	}
	
	public boolean saque(double vl) {
		saldo -= vl;
		return true;
	}
	
	
	
	public Conta() {
		this(0, 0);
	}
	
	public Conta(int nr, int ag) {
		this.nr = nr;
		this.ag = ag;
	}

	@Override
	public String toString() {
		return getNr() + " - " + getSaldo();
	}
	
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getAg() {
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
