package controle;

import java.util.ArrayList;

import principal.Oficina;
import rh.Cliente;
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
	
	// ----------------- Cliente -----------------
		public String cadastrarCliente(String nome, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){
		
			return oficina.cadastrarCliente(nome, cpf, email, telefone, rua, numero, bairro, cep, cidade);
		}

		public Cliente buscarClienteMatricula(String cpf){
			
			return oficina.buscarCliente(cpf);
		}
		
//		public ArrayList<Cliente> buscarClienteNome(String nome){
//
//			return oficina.buscarClienteNome(nome);
//		}

		public String editarCliente(Cliente cliente, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

			return oficina.editarCliente(cliente, nome, email, telefone, rua, numero, bairro, cep, cidade);
		}

		public String excluirCliente(String cpf){ 

			return oficina.excluirCliente(cpf);
		}
}
