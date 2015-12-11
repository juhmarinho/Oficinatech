package exclusao;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class TelaExclusaoFuncionario extends TelaExclusao{

	@Override
	protected void confirmarMouseClicked(MouseEvent evt) {

		justificativa= textJustificativa.getText();

		if(!justificativa.equals("")){		

			controle.excluirFuncionario(funcionarioExclusao.solicitarMatricula(), justificativa);
			finalizarExclusao();

		}else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");

	}

}
