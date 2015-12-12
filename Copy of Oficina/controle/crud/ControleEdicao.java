package crud;

import patrimonio.Carro;
import rh.Cliente;
import rh.Contato;
import rh.Endereco;
import rh.Funcionario;
import controle.ControlePatrimonio;
import controle.ControleRh;

public class ControleEdicao {

	private ControleRh controleRh;
	private ControlePatrimonio controlePatrimonio;

	public ControleEdicao(){

		controleRh= new ControleRh();
		controlePatrimonio= new ControlePatrimonio();
	}

	public String editarCliente(Cliente cliente, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

		return controleRh.editarCliente(cliente, nome, email, telefone, rua, numero, bairro, cep, cidade);
	
	}

	/*public void alterarSenhacliente(Usuario usuario, String senha){

		controleRh.alterarSenhaUsuario(usuario, senha);
	}*/

	public String editarFuncionario(Funcionario funcionario, String nome, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade){

		return controleRh.editarFuncionario(funcionario, nome, email, telefone, rua, numero, bairro, cep, cidade);
	}

	public void alterarSenhaFuncionario(Funcionario funcionario, String senha){

		controleRh.alterarSenhaFuncionario(funcionario, senha);
	}

	/*public String editarObra(Obra obra, String titulo, String autores, String assuntos, String editora, String observacoes){

		return controlePatrimonio.editarObra(obra, titulo, autores, assuntos, editora, observacoes);
	}*/
}
