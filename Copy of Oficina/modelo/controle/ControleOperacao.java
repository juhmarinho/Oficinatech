package controle;

import principal.Operacoes;
import rh.Cliente;
import rh.Funcionario;

public class ControleOperacao {

	private Operacoes operacoes;

	public ControleOperacao(){

		operacoes= Operacoes.solicitaInstancia();
	}

	// ----------------- operacoes -----------------		
	public String realizarOrcamento(Funcionario funcionario,String cpf, String placa){

		return operacoes.realizarOrcamento(funcionario,cpf,placa);
	}

	/*public String realizarServico(String codigo_servico){

		return operacoes.realizarServico(codigo_servico);
	}

	public String realizarReparo(String codigoEmprestimo){

		return operacoes.realizarReparo(codigoEmprestimo);
	}

	public String realizarReserva(Usuario usuario, Obra obra){ 

		return operacoes.realizarReserva(usuario, obra);
	}*/

	// ----------------- busca -----------------	
	/*public Emprestimo buscarEmprestimo(String codigoEmprestimo){

		return operacoes.buscarEmprestimo(codigoEmprestimo);
	}
	
	public Emprestimo buscarDevolucao(String codigoEmprestimo){

		return operacoes.buscarDevolucao(codigoEmprestimo);
	}*/

}
