package crud;

import controle.ControlePatrimonio;
import controle.ControleRh;

public class ControleExclusao {
	
	private ControleRh controleRh;
	private ControlePatrimonio controlePatrimonio;
	
	public ControleExclusao(){
		
		controleRh= new ControleRh();
		controlePatrimonio= new ControlePatrimonio();
	}
	
	/*public String excluirUsuario(String matricula, String justificativa){ 

		return controleRh.excluirUsuario(matricula, justificativa);
	}*/
	public void excluirFuncionario(String matricula){

		controleRh.excluirFuncionario(matricula);
	}

	public void excluirCarro(String placa){

		controlePatrimonio.excluirCarro(placa);
	}

	/*public void excluirExemplar(String codigo, String justificativa) {
		
		controlePatrimonio.excluirExemplar(codigo, justificativa);
	}*/
}
