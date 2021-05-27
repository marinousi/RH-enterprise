
public class Setores {
	private String nomeDoSetor;
	private int qtdeDeFunci = 0;
	public String getNomeDoSetor() {
		return nomeDoSetor;
	}
	
	public Setores(String nomeDoSetor, int qtdeDeFunci) {
		super();
		this.nomeDoSetor = nomeDoSetor;
		this.qtdeDeFunci = qtdeDeFunci;
	}

	public String toString() {
		return "Setores - Nome do Setor (" + nomeDoSetor + "), Quantidade de Funcionários no Setor (" + qtdeDeFunci + ")";
	}
	public Setores(String nomeDoSetor) {
		super();
		this.nomeDoSetor = nomeDoSetor;
	}
	public void setNomeDoSetor(String nomeDoSetor) {
		this.nomeDoSetor = nomeDoSetor;
	}
	public int getQtdeDeFunci() {
		return qtdeDeFunci;
	}
	public void setQtdeDeFunci(int qtdeDeFunci) {
		this.qtdeDeFunci = qtdeDeFunci;
	}
}
