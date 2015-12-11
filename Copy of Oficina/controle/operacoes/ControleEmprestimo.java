package operacoes;

import java.util.ArrayList;

import patrimonio.Carro;
import rh.Funcionario;
import controle.ControleOperacao;
import controle.ControlePatrimonio;
import controle.ControleRh;

public class ControleEmprestimo {
	
	private ControleRh controleRh;
	private ControlePatrimonio controlePatrimonio;
	private ControleOperacao controleOperacao;

	public ControleEmprestimo(){

		controleRh= new ControleRh();
		controlePatrimonio= new ControlePatrimonio();
		controleOperacao= new ControleOperacao();
	}
	
	/*public String realizarEmprestimo(Usuario usuario, String codigoExemplar){

		return controleOperacao.realizarEmprestimo(usuario, codigoExemplar);
	}
	
	public String realizarRenovacao(String codigoEmprestimo){

		return controleOperacao.realizarRenovacao(codigoEmprestimo);
	}
	
	public String realizarDevolucao(String codigoEmprestimo){

		return controleOperacao.realizarDevolucao(codigoEmprestimo);
	}

	public Emprestimo buscarEmprestimo(String codigoEmprestimo){

		return controleOperacao.buscarEmprestimo(codigoEmprestimo);
	}
	
	public Emprestimo buscarDevolucao(String codigoEmprestimo){

		return controleOperacao.buscarDevolucao(codigoEmprestimo);
	}*/
}
