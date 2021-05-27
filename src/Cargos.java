
public class Cargos {
	private String nomeDoCargo;
	private double salarioDoCargo;
	private int idDoCargo;
	public String getNomeDoCargo() {
		return nomeDoCargo;
	}
	
	public String toString() {
		return "Cargos - Nome do Cargo (" + nomeDoCargo + "), Salário do Cargo (" + salarioDoCargo + "), ID do Cargo (" + idDoCargo
				+ ")";
	}
	public Cargos(String nomeDoCargo, double salarioDoCargo, int idDoCargo) {
		super();
		this.nomeDoCargo = nomeDoCargo;
		this.salarioDoCargo = salarioDoCargo;
		this.idDoCargo = idDoCargo;
	}
	public void setNomeDoCargo(String nomeDoCargo) {
		this.nomeDoCargo = nomeDoCargo;
	}
	public double getSalarioDoCargo() {
		return salarioDoCargo;
	}
	public void setSalarioDoCargo(double salarioDoCargo) {
		this.salarioDoCargo = salarioDoCargo;
	}
	public int getIdDoCargo() {
		return idDoCargo;
	}
	public void setIdDoCargo(int idDoCargo) {
		this.idDoCargo = idDoCargo;
	}
}
