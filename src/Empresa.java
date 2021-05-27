import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	
	private static Scanner prompt;

	public static void main(String[] args) {
		
		ArrayList <Cargos> colecaoCargos = new ArrayList <Cargos>(); 
		ArrayList <Funcionarios> colecaoFuncionarios = new ArrayList <Funcionarios> ();
		ArrayList <Setores> colecaoSetores = new ArrayList<Setores> ();
		
		int contador = 1;
		prompt = new Scanner (System.in);
		while(contador == 1){
		System.out.println("Digite 1 para fazer o cadastro");
		System.out.println("Digite 2 para fazer a listagem");
		System.out.println("Digite 3 para fazer a edição");
		System.out.println("Digite 4 para fazer a exclusão");
		System.out.println("Digite 0 para finalizar");
		int opcao = prompt.nextInt();
		switch (opcao) {
		case 0:
			contador = 0;
			System.out.println("Finalizado com sucesso!");
			break;
		case 1:
				System.out.println("Digite 1 para começar o cadastro do cargo");
				System.out.println("Digite 2 para começar o cadastro do setor");
				System.out.println("Digite 3 para começar o cadastro do funcionário");
				int estado = prompt.nextInt();
	
				switch (estado) {
				case 1:
						System.out.println("Digite o nome do cargo: ");
						String nomeDoCargo = prompt.next();
						System.out.println("Digite o salário equivalente ao cargo: ");
						double salarioDoCargo = prompt.nextDouble();
						System.out.println("Digite o ID equivalente ao cargo: ");
						int idDoCargo = prompt.nextInt();
						Cargos c = new Cargos(nomeDoCargo, salarioDoCargo, idDoCargo);
						colecaoCargos.add(c);
						break;
						
				case 2:
						System.out.println("Digite o nome do setor: ");
						String nomeDoSetor = prompt.next();
						Setores s = new Setores(nomeDoSetor);
						colecaoSetores.add(s);
						break;
						
				case 3:
						System.out.println("Digite o nome do funcionário: ");
						String nomeDoFunci = prompt.next();
						System.out.println("Digite o ID do funcionário: ");
						int idDoFunci = prompt.nextInt();
						System.out.println("Digite o CPF do funcionário: ");
						int cpfDoFunci = prompt.nextInt();
						System.out.println("Digite o aniversário do funcionário: ");
						String dataDoFunci = prompt.next();
						System.out.println("Digite o setor: ");
						System.out.println("Disponíveis: ");
						for (int i = 0; i < colecaoSetores.size(); i++) {
							System.out.println("Código"+i + "/Nome do setor : " + colecaoSetores.get(i).getNomeDoSetor());
							
						}
						String set = prompt.next();
						System.out.println("Digite o código do setor");
						int cod = prompt.nextInt();	
						colecaoSetores.get(cod).setQtdeDeFunci(+1);
						System.out.println("Digite o cargo: ");
						System.out.println("Disponíveis: ");
						for (int i = 0; i < colecaoCargos.size(); i++) {
							System.out.println(colecaoCargos.get(i).getNomeDoCargo());
							
						}
						String car = prompt.next();
						Funcionarios f = new Funcionarios(nomeDoFunci, idDoFunci, cpfDoFunci, dataDoFunci, car, set);
						colecaoFuncionarios.add(f);
						break;
				}
			break;
			case 2:
				System.out.println("Digite o que você quer listar: 1 para cargo, 2 para setor e 3 para funcionário");
				int listar = prompt.nextInt();
				switch (listar) {
				case 1:
					System.out.println("Cargos: ");
					for (int i = 0; i < colecaoCargos.size(); i++) {
					System.out.println(colecaoCargos.get(i));
						
					}
					break;
				case 2:
					System.out.println("Setores: ");
					for (int i = 0; i < colecaoSetores.size(); i++) {
					System.out.println(colecaoSetores.get(i));
						
					}
					break;
				case 3:
					System.out.println("Funcionários: ");
					for (int i = 0; i < colecaoFuncionarios.size(); i++) {
						System.out.println(colecaoFuncionarios.get(i));
						
					}
					break;
				}
				break;
			case 3:
				System.out.println("Digite o que você quer editar: 1 para cargo, 2 para setor e 3 para funcionário");
				int editar = prompt.nextInt();
				switch (editar) {
				case 1: 
					System.out.println("Cargos que você colocou:");
					for (int i = 0; i < colecaoCargos.size(); i++) {
						System.out.println(i + ":" + colecaoCargos.get(i));
					}
					System.out.println("Digite o cargo que você quer editar");
					int cargoEditado = prompt.nextInt();
					
					System.out.println(colecaoCargos.get(cargoEditado));
					System.out.println("Digite para editar: 1 para o nome do cargo, 2 para o salário e 3 para o ID do cargo");
					
					int e = prompt.nextInt();
					switch (e) {
					case 1:
						System.out.println("Você quer editar o nome do seu cargo para qual?");
						String edicao = prompt.next();
						colecaoCargos.get(cargoEditado).setNomeDoCargo(edicao);
						
						System.out.println(colecaoCargos.get(cargoEditado));
						
						break;
						
					case 2:
						System.out.println("Você quer editar o salário do seu cargo para qual?");
						double edicaoSal = prompt.nextDouble();
						colecaoCargos.get(cargoEditado).setSalarioDoCargo(edicaoSal);
						
						System.out.println(colecaoCargos.get(cargoEditado));
						
						break;
						
					case 3:
						System.out.println("Você quer editar o ID do seu cargo para qual?");
						int edicaoId = prompt.nextInt();
						colecaoCargos.get(cargoEditado).setSalarioDoCargo(edicaoId);
						
						System.out.println(colecaoCargos.get(cargoEditado));
						
						break;
					} break;
				case 2:
					System.out.println("Setores que você colocou:");
					for (int i = 0; i < colecaoSetores.size(); i++) {
						System.out.println(i + ":" + colecaoSetores.get(i));
						
					}
					System.out.println("Digite o setor que você quer editar");
					int setorEditado = prompt.nextInt();

					System.out.println(colecaoSetores.get(setorEditado));

					System.out.println("Você quer editar o nome do seu setor para qual?");
					String edicao = prompt.next();
					colecaoSetores.get(setorEditado).setNomeDoSetor(edicao);
						
					System.out.println(colecaoSetores.get(setorEditado));
					break;
					
				case 3:
					System.out.println("Funcionários que você colocou:");
					for (int i = 0; i < colecaoFuncionarios.size(); i++) {
						System.out.println(i + ":" + colecaoFuncionarios.get(i));
					}
					System.out.println("Digite o funcionário que você quer editar");
					int funcionarioEditado = prompt.nextInt();
					
					System.out.println(colecaoFuncionarios.get(funcionarioEditado));
					System.out.println("Digite para editar: 1 para o nome do funcionário, 2 para o ID do funcionário, 3 para o CPF do funcionário, 4 para a data de aniversário do funcionário, 5 para o cargo do funcionário e 6 para o setor do funcionário");
					
					int edit = prompt.nextInt();
					switch (edit) {
					case 1:
						System.out.println("Você quer editar o nome do seu funcionário para qual?");
						String edi = prompt.next();
						colecaoFuncionarios.get(funcionarioEditado).setNomeDoFunci(edi);;
						
						System.out.println(colecaoFuncionarios.get(funcionarioEditado));
						
						break;
						
					case 2:
						System.out.println("Você quer editar o ID do seu funcionário para qual?");
						int edicaoIdFunci = prompt.nextInt();
						colecaoFuncionarios.get(funcionarioEditado).setIdDoFunci(edicaoIdFunci);;
						
						System.out.println(colecaoFuncionarios.get(funcionarioEditado));
						
						break;
						
					case 3:
						System.out.println("Você quer editar o CPF do seu funcionário para qual?");
						int edicaoCpf = prompt.nextInt();
						colecaoFuncionarios.get(funcionarioEditado).setCpfDoFunci(edicaoCpf);
						
						System.out.println(colecaoFuncionarios.get(funcionarioEditado));
						
						break;
						
					case 4:
						System.out.println("Você quer editar o aniversário do seu funcionário para qual?");
						String edicaoNiver = prompt.next();
						colecaoFuncionarios.get(funcionarioEditado).setDataDoFunci(edicaoNiver);
						
						System.out.println(colecaoFuncionarios.get(funcionarioEditado));
						
						break;
						
					case 5:
						System.out.println("Você quer editar o cargo do seu funcionário para qual?");
						String edicaoCargo = prompt.next();
						colecaoFuncionarios.get(funcionarioEditado).setCargo(edicaoCargo);
						
						System.out.println(colecaoFuncionarios.get(funcionarioEditado));
						
						break;
						
					case 6:
						System.out.println("Você quer editar o setor do seu funcionário para qual?");
						String edicaoSetor = prompt.next();
						colecaoFuncionarios.get(funcionarioEditado).setSetor(edicaoSetor);
						
						System.out.println(colecaoFuncionarios.get(funcionarioEditado));
						
						break;
					} break;
				} break;
			case 4:
				System.out.println("Digite o que você quer excluir: 1 para cargo, 2 para setor e 3 para funcionário");
				int excluir = prompt.nextInt();
				switch (excluir) {
				case 1:
					System.out.println("Cargos para excluir:");
					for (int i = 0; i < colecaoCargos.size(); i++) {
						System.out.println(i + ":" + colecaoCargos.get(i));
					}
					int variavel = prompt.nextInt();
					colecaoCargos.remove(variavel);
					System.out.println("Cargo excluídos com sucesso!");
					break;
				case 2:
					System.out.println("Setores para excluir:");
					for (int i = 0; i < colecaoSetores.size(); i++) {
						System.out.println(i + ":" + colecaoSetores.get(i));
					}
					int var = prompt.nextInt();
					colecaoSetores.remove(var);
					System.out.println("Setor excluídos com sucesso!");
					break;
				case 3:
					System.out.println("Funcionários para excluir:");
					for (int i = 0; i < colecaoFuncionarios.size(); i++) {
						System.out.println(i + ":" + colecaoFuncionarios.get(i));
					}
					int v = prompt.nextInt();
					colecaoFuncionarios.remove(v);
					System.out.println("Funcionário excluídos com sucesso!");
				}
				break;
		} 
			}
		}
}









