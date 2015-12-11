package crud;

import controle.ControlePatrimonio;
import controle.ControleRh;

public class ControleCadastro {

	private ControleRh controleRh;
	private ControlePatrimonio controlePatrimonio;

	public ControleCadastro(){

		controleRh= new ControleRh();
		controlePatrimonio= new ControlePatrimonio();
	}

	/*public String cadastrarUsuario(String nome, String vinculo, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade, String senha){
	
		return controleRh.cadastrarUsuario(nome, vinculo, cpf, email, telefone, rua, numero, bairro, cep, cidade, senha);
	}*/

	public String cadastrarFuncionario(String nome, String funcao, String cpf, String email, String telefone, String rua, String numero, String bairro, String cep, String cidade, String senha){

		return controleRh.cadastrarFuncionario(nome, funcao, cpf, email, telefone, rua, numero, bairro, cep, cidade, senha);
	}

	public String cadastrarCarro(String marca, String modelo, String ano, String cor, String placa){

		return controlePatrimonio.cadastrarCarro(marca,modelo,ano,cor,placa);
	}

	/*public String cadastrarExemplar(String edicao, String isbn, String codigoObra){

		return controlePatrimonio.cadastrarExemplar(edicao, isbn, codigoObra);
	}*/
}
