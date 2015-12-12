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
	/*public Servico buscarServico(String codigoServico){

		return operacoes.buscarServico(codigoServico);
	}
	
	public Reparo buscarReparo(String codigoReparo){

		return operacoes.buscarReparo(codigoReparo);
	}*/

}
