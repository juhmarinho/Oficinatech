package logar;

import rh.Funcionario;
//import rh.Usuario;
import controle.ControleRh;

public class ControleLogin {

	private ControleRh controle;

	public ControleLogin(){

		controle= new ControleRh();
	}

	public String logarFuncionario(String usuario, String senha){

		return controle.logarFuncionario(usuario, senha);
	} 

	/*public String logarUsuario(String usuario, String senha){

		return controle.logarUsuario(usuario, senha);
	}*/

	public Funcionario buscarFuncionario(String matricula){

		return controle.buscarFuncionarioMatricula(matricula);
	}
	
	/*public Usuario buscarUsuario(String matricula){

		return controle.buscarUsuarioMatricula(matricula);
	}*/
}
