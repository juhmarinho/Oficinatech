
package cadastro;

import java.awt.event.MouseEvent;

import inicio.Tela;
import inicio.TelaBibliotecario;
import inicio.TelaGerente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import crud.ControleCadastro;
import rh.Funcionario;

public class TelaCadastroPeca extends Tela{

	private JTextField field_assuntos, field_autores, field_titulo, field_editora;
	private JButton button_cancelar, button_confirmar;
	private JTextArea text_observacoes;
	private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5;
	private JScrollPane jScrollPane2;
	private JPanel telaCadastro;
	private JLabel label_nomeFuncionario;	
	//----------------------------------------
	String codigo, titulo, autores, editora, assuntos, observacoes, assunto;
	private ControleCadastro controle;

	public TelaCadastroPeca() {

		iniciarComponentes();		
	}

	private void iniciarComponentes() {

		controle= new ControleCadastro();
		label_nomeFuncionario = new JLabel();
		telaCadastro = new JPanel();
		jLabel1 = new JLabel();
		field_titulo = new JTextField();
		jLabel2 = new JLabel();
		field_autores = new JTextField();
		jLabel3 = new JLabel();
		field_assuntos = new JTextField();
		jLabel4 = new JLabel();
		button_confirmar = new JButton();
		button_cancelar = new JButton();
		field_editora = new JTextField();
		jScrollPane2 = new JScrollPane();
		text_observacoes = new JTextArea();
		jLabel5 = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		label_nomeFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		telaCadastro.setBackground(new java.awt.Color(204, 204, 204));
		telaCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastrar obra"));

		jLabel1.setText("Titulo:");
		jLabel2.setText("Autor(es):");
		jLabel3.setText("Assunto(s):");
		jLabel4.setText("Observacoes:");
		jLabel5.setText("Editora:");

		button_confirmar.setText("Ok");
		button_confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				confirmarCadMouseClicked(evt);
			}});

		button_cancelar.setText("Cancelar");
		button_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		button_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {

				CancelarCadMouseClicked(evt);
			}});

		text_observacoes.setColumns(20);
		text_observacoes.setRows(5);
		jScrollPane2.setViewportView(text_observacoes);

		javax.swing.GroupLayout telaCadastroLayout = new javax.swing.GroupLayout(telaCadastro);
		telaCadastro.setLayout(telaCadastroLayout);
		telaCadastroLayout.setHorizontalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaCadastroLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(button_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(telaCadastroLayout.createSequentialGroup()
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
																.addComponent(jLabel1)
																.addGap(57, 57, 57))
																.addGroup(telaCadastroLayout.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(telaCadastroLayout.createSequentialGroup()
																								.addComponent(jLabel3)
																								.addGap(44, 44, 44))
																								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroLayout.createSequentialGroup()
																										.addComponent(jLabel4)
																										.addGap(18, 18, 18)))
																										.addGroup(telaCadastroLayout.createSequentialGroup()
																												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(jLabel2)
																														.addComponent(jLabel5))
																														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
																														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																																.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																																		.addComponent(field_assuntos)
																																		.addComponent(field_titulo)
																																		.addComponent(field_autores)
																																		.addComponent(field_editora, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addGap(0, 62, Short.MAX_VALUE)))
																																		.addContainerGap()));
		telaCadastroLayout.setVerticalGroup(
				telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(telaCadastroLayout.createSequentialGroup()
						.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(telaCadastroLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1))
										.addComponent(field_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(54, 54, 54)
										.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(field_autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
												.addGap(49, 49, 49)
												.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(field_editora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
														.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(field_assuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel3))
																.addGap(49, 49, 49)
																.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel4)
																		.addGroup(telaCadastroLayout.createSequentialGroup()
																				.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(37, 37, 37)
																				.addGroup(telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(button_confirmar)
																						.addComponent(button_cancelar))))
																						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(telaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(telaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}                       

	private void confirmarCadMouseClicked(MouseEvent evt) {  

		titulo= field_titulo.getText();
		autores= field_autores.getText();		
		assuntos= field_assuntos.getText(); 
		editora= field_editora.getText();
		observacoes= text_observacoes.getText();

		codigo= controle.cadastrarObra(titulo, autores, assuntos, editora, observacoes);

		if(!codigo.equals("Preencha todos os campos."))
			finalizarCadastro();
		else
			JOptionPane.showMessageDialog(null,"Preenchimento invalido!\nVerifique campos em branco.");
	}                                         

	private void CancelarCadMouseClicked(MouseEvent evt) {     

		montarNovaTela();
	}

	private void finalizarCadastro(){

		montarNovaTela();
		JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!\nCodigo da nova obra: " + codigo);
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {

		this.funcionario= funcionario;
		label_nomeFuncionario.setText("Nome do funcionario: " + funcionario.solicitarNome());		
	}

	@Override
	protected void montarNovaTela() {

		Tela tela= null;

		if(funcionario.solicitarFuncao().equals("Bibliotecario"))
			tela= new TelaBibliotecario();

		else if(funcionario.solicitarFuncao().equals("Gerente"))
			tela = new TelaGerente();

		tela.setVisible(true);
		tela.insereFuncionario(funcionario);
		dispose();
	}

}
