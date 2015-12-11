package exclusao;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class TelaExclusaoObra extends TelaExclusao{

	@Override
	protected void confirmarMouseClicked(MouseEvent evt) {

		justificativa= textJustificativa.getText();

		if(!justificativa.equals("")){			
			String exclusao= controle.excluirObra(obraExclusao.solicitarCodigo(), justificativa);

			if(exclusao.equals("Exclusao realizada com sucesso"))			
				finalizarExclusao();

			else{				
				montarNovaTela();
				JOptionPane.showMessageDialog(null, exclusao);
			}
		}else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}
}
