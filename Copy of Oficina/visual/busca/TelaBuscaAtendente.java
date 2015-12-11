package busca;

import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaBuscaAtendente  extends TelaBusca{

	@Override
	protected void buscarMouseClicked(MouseEvent evt) { 

		busca= (String) buscarPor.getSelectedItem();
		filtro= (String) filtrarPor.getSelectedItem();
		termo= fieldTermo.getText();

		if(busca!=null && filtro!=null && termo!=null){

			if(busca.equals("Funcionario"))
				buscarFuncionario();
		}
		else
			JOptionPane.showMessageDialog(null, "Preenchimento invalido!\nVerifique campos em branco.");
	}


	@Override
	protected void escolherTipoItem(ItemEvent evt) {

		String eventoSelecionado = (String) buscarPor.getSelectedItem();

		String[] model;

		model = new String[2];
		model[0] = "Matricula";
		model[1] = "Nome";

		filtrarPor.setModel(new DefaultComboBoxModel(model)); 
	}


	@Override
	protected void addBuscarPor() {

		buscarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Funcionario"}));
		buscarPor.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(ItemEvent evt) {
				escolherTipoItem(evt);
			}
		});

	}

}
