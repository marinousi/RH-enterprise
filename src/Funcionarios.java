
public class Funcionarios {
	private String nomeDoFunci;
	private int idDoFunci;
	private int cpfDoFunci;
	private String dataDoFunci;
	private String cargo;
	private String setor;
	public String getNomeDoFunci() {
		return nomeDoFunci;
	}
	
	public String toString() {
		return "Funcionarios - Nome do Funcionário (" + nomeDoFunci + "), ID do Funcionário (" + idDoFunci + "), CPF do Funcionário (" + cpfDoFunci
				+ "), Aniversário do Funcionário (" + dataDoFunci + "), Cargo do Funcionário (" + cargo + "), Setor do Funcionário (" + setor + ")";
	}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Funcionarios(String nomeDoFunci, int idDoFunci, int cpfDoFunci, String dataDoFunci, String car,
			String set) {
		super();
		this.nomeDoFunci = nomeDoFunci;
		this.idDoFunci = idDoFunci;
		this.cpfDoFunci = cpfDoFunci;
		this.dataDoFunci = dataDoFunci;
		this.cargo = car;
		this.setor = set;
	}
	public Funcionarios(String nomeDoFunci2, int idDoFunci2, int cpfDoFunci2, String dataDoFunci2, Cargos[] cargo2,
			Setores[] setor2) {
		// TODO Auto-generated constructor stub
	}

	public void setNomeDoFunci(String nomeDoFunci) {
		this.nomeDoFunci = nomeDoFunci;
	}
	public int getIdDoFunci() {
		return idDoFunci;
	}
	public void setIdDoFunci(int idDoFunci) {
		this.idDoFunci = idDoFunci;
	}
	public int getCpfDoFunci() {
		return cpfDoFunci;
	}
	public void setCpfDoFunci(int cpfDoFunci) {
		this.cpfDoFunci = cpfDoFunci;
	}
	public String getDataDoFunci() {
		return dataDoFunci;
	}
	public void setDataDoFunci(String dataDoFunci) {
		this.dataDoFunci = dataDoFunci;
	}

}