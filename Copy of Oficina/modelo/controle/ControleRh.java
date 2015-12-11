package controle;

import java.util.ArrayList;

import principal.Oficina;
import rh.Contato;
import rh.Endereco;
import rh.Funcionario;

public class ControleRh {

	private Oficina oficina;

	public ControleRh(){

		oficina= Oficina.solicitaInstancia();
	}

	public String logarFuncionario(String usuario, String senha){

		return oficina.logarFuncionario(usuario, senha);
	}	


	// ----------------- funcionario -----------------
	public String cadastrarFuncionario(String nome, String funcao, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade, String senha){

		return oficina.cadastrarFuncionario(nome, funcao, cpf, email, telefone, rua, numero, bairro, cidade, cep, senha);		
	}

	public Funcionario buscarFuncionarioMatricula(String matricula){
		
		return oficina.buscarFuncionarioMatricula(matricula);
	}
	
	public ArrayList<Funcionario> buscarFuncionarioNome(String nome){

		return oficina.buscarFuncionarioNome(nome);
	}
	
	public String editarFuncionario(Funcionario funcionario, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

		return oficina.editarFuncionario(funcionario, nome, email, telefone, rua, numero, bairro, cep, cidade);
	}

	public void alterarSenhaFuncionario(Funcionario funcionario, String senha){

		oficina.alterarSenhaFuncionario(funcionario, senha);
	}

	public void excluirFuncionario(String matricula){

		oficina.excluirFuncionario(matricula);
	}
}
