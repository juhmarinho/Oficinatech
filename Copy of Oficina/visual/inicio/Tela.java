package inicio;

import javax.swing.JFrame;

import rh.Funcionario;

public abstract class Tela extends JFrame{

	protected Funcionario funcionario;
	
	public Tela(){ 	}
	
	public abstract void insereFuncionario(Funcionario funcionario);
	
	protected abstract void montarNovaTela();

}
