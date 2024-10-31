package heranca;

public class Medico extends Pessoa{
	
	private int crm;

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	@Override
	public String toString() {
		return "Dr(a)" + super.toString() + " - " + getCrm();
	}
	
	public void consultar() {
		System.out.println("Consultando");
	}

}
