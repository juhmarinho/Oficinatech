package crud;

import java.util.ArrayList;


import patrimonio.Carro;
import rh.Funcionario;
import controle.ControlePatrimonio;
import controle.ControleRh;

public class ControleBusca {
	
	private ControleRh controleRh;
	private ControlePatrimonio controlePatrimonio;

	public ControleBusca(){

		controleRh= new ControleRh();
		controlePatrimonio= new ControlePatrimonio();
	}
	
	/*public Usuario buscarUsuarioMatricula(String matricula){

		return controleRh.buscarUsuarioMatricula(matricula);
	}

	public ArrayList<Usuario> buscarUsuarioNome(String nome){

		return controleRh.buscarUsuarioNome(nome);
	}
	*/
	public Funcionario buscarFuncionarioMatricula(String matricula){

		return controleRh.buscarFuncionarioMatricula(matricula);
	}

	public ArrayList<Funcionario> buscarFuncionarioNome(String nome){

		return controleRh.buscarFuncionarioNome(nome);
	}
	
	public Carro buscarPlaca(String placa){

		return controlePatrimonio.buscarPlaca(placa);
	}
	
	/*public ArrayList<Carro> buscarObraNome(String nome){

		return controlePatrimonio.buscarObraNome(nome);
	}*/

	/*public Exemplar buscarExemplar(String codigo){

		return controlePatrimonio.buscarExemplar(codigo);
	}*/

}
